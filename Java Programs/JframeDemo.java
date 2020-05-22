package com.fundamental;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class JframeDemo implements ActionListener{

	JFrame f;
	JLabel l1,l2,l3,l4,l5,l6;
	JTextField t1,t2,t3,t4;
	JComboBox jcm;
	ButtonGroup bg;
	JRadioButton r1,r2;
	JButton b1,b2,b3,b4;
	
	public JframeDemo() {
		f=new JFrame("My Frame");
		f.setSize(500, 500);
		f.setVisible(true);
		//f.setLayout(new FlowLayout());
		//f.setLayout(new GridLayout(4, 2));
		f.setLayout(null);
		
		l1=new JLabel("ID");
		l2=new JLabel("FNAME");
		l3=new JLabel("LNAME");
		l4=new JLabel("EMAIL");
		/*l5=new JLabel("Education");
		l6=new JLabel("Gender");*/
		
		t1=new JTextField(20);
		t2=new JTextField(20);
		t3=new JTextField(20);
		t4=new JTextField(20);
		/*String[] education= {"BE","BCA","BscIT","ME","MCA","MscIT"};
		jcm=new JComboBox(education);
		bg=new ButtonGroup();
		r1=new JRadioButton("Male");
		r2=new JRadioButton("Female");
		bg.add(r1);
		bg.add(r2);*/
		b1=new JButton("Insert");
		b2=new JButton("Search");
		b3=new JButton("Update");
		b4=new JButton("Delete");
		
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(l3);
		f.add(t3);
		f.add(l4);
		f.add(t4);
		/*f.add(l5);
		f.add(jcm);
		f.add(l6);
		f.add(r1);
		f.add(r2);*/
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
		l1.setBounds(50, 50, 120, 20);
		l2.setBounds(50, 80, 120, 20);
		l3.setBounds(50, 110, 120, 20);
		l4.setBounds(50, 140, 120, 20);
		/*l5.setBounds(50, 170, 120, 20);
		l6.setBounds(50, 200, 120, 20);*/
		
		t1.setBounds(120, 50, 120, 20);
		t2.setBounds(120, 80, 120, 20);
		t3.setBounds(120, 110, 120, 20);
		t4.setBounds(120, 140, 120, 20);
		/*jcm.setBounds(120, 170, 120, 20);
		r1.setBounds(120, 200, 80, 20);
		r2.setBounds(200, 200, 80, 20);*/
		
		b1.setBounds(50, 230, 100, 20);
		b2.setBounds(150, 230, 100, 20);
		b3.setBounds(50, 260, 100, 20);
		b4.setBounds(150, 260, 100, 20);
	}
	public static void main(String[] args) {
		new JframeDemo();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
	
		if(e.getSource()==b1)
		{
			String fname=t2.getText();
			String lname=t3.getText();
			String email=t4.getText();
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/kssbm", "root", "");
				String sql="insert into student(fname,lname,email) values(?,?,?)";
				PreparedStatement pst=conn.prepareStatement(sql);
				pst.setString(1, fname);
				pst.setString(2, lname);
				pst.setString(3, email);
				pst.executeUpdate();
				t2.setText("");
				t3.setText("");
				t4.setText("");
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
			
		}
		else if(e.getSource()==b2)
		{
			System.out.println("Search");
		}
		else if(e.getSource()==b3)
		{
			System.out.println("Update");
		}
		else if(e.getSource()==b4)
		{
			System.out.println("Delete");
		}
	}
}
