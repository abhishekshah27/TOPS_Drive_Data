package com.fundamental;

interface ifs1
{
	void meth1();
	void meth2();
}
interface ifs2 extends ifs1
{
	void meth3();
	void meth4();
}
class ifs3 implements ifs2
{
	public void meth1() {
	}
	public void meth2() {
	}
	public void meth3() {
	}
	public void meth4() {
	}
	
}
public class InterfaceDemo {

}
