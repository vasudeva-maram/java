package javaConcepts;

public class instanceblock {
	int a=10;
	int b=20;
	instanceblock()
	{
		System.out.println("0 arg constructor");
	}
	void m1()
	{
		System.out.println("a+b:"+(a+b));
	}
	{
		System.out.println("instance block");
	}
	// when ever we are creating the object for the class that time 
	//only execute the instance block 
	public static void main(String[] args) {
		instanceblock i1=new instanceblock();
		i1.m1();
		
	}

}
