package javaConcepts;

public interface Interface// abstract
{
 void example1();// by default public,abstract
 

}
interface interface1 extends Interface
{
	void example2();
	
}
interface interface2 extends interface1
{
	 void example3();
		
}
class Niranjan implements interface2
{
	 public void example3()
	{
		System.out.println("method 3");
	}
	public void example2()
	{
		System.out.println("method 2");
	}
	public void example1()
	{
		System.out.println("method 1");
	}
	public static void main(String[] args) {
		Niranjan n1=new Niranjan();
		n1.example1();
		n1.example2();
		n1.example3();
		System.out.println(".......upcasting.......");
		interface2 it=new Niranjan();
		it.example1();
		it.example2();
		it.example3();
		System.out.println("-------------down casting-------------");
		Interface it2=(Interface)n1;
		it2.example1();
		
	}
	}