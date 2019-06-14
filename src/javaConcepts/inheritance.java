package javaConcepts;
public class inheritance {
int a=12;
int b=34;
 void add()
 {
	 
	 System.out.println("sum of a+b: "+(a+b));
 }}
 class child extends inheritance
{
	 int a=30;
	 int b=40;
 void sub()
 {
	 System.out.println(a+b);
 }
	
 public static void main(String[] args) {
	inheritance i1=new inheritance();
	//i1.add();
	 child c1=new child();
	c1.add();
	c1.sub();
	i1.add();
}
}
