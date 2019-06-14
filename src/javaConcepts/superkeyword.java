package javaConcepts;
 class parent
{
int a=100;
int b=200;
void m2(char s)
{
System.out.println(" parent class method");	
System.out.println(s);
}
parent()
{
System.out.println("parent class constructor");	
}

}
public class superkeyword extends parent {
int a=340;
int b=470;
void m1()
{
	
super.m2('s');// calling  the parent class method	
System.out.println(a+b);
System.out.println(super.a+super.b);// access the parent class variables
}
superkeyword()
{
super();
System.out.println("child class constructor");
}
	public static void main(String[] args) {
		superkeyword s1=new superkeyword();
		s1.m1();
	}

}
