package javaConcepts;

public class This_keyword {
int a=19;//instance variables
int b=30;//instance variables
void m2()// instance method
{
System.out.println(a+b);	
}
This_keyword()// constructor
{
System.out.println("0 arg constructor");	
}
void m1(int a ,int b)
{
	
	this.m2();// access instance method
System.out.println(this.a+this.b);//access instance variables
System.out.println(a+b);//access local variables
}
void m3()
{
	this.m1(25, 85);
}
This_keyword(String s,String v)
{
	this();
System.out.println(s+v);	
}
public static void main(String[] args) {
	This_keyword t1=new This_keyword();
	t1.m3();
	This_keyword t2=new This_keyword("niranjan","keasava");
			
}	
}
