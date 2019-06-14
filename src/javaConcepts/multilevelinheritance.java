package javaConcepts;

public class multilevelinheritance {
	String name="niranjan";
	int salary=25000;
	void netsal()
	{
		System.out.println("Accname"+name);
		System.out.println("net ammount:"+(salary+5000));
	}
}
class child2 extends multilevelinheritance
{
	String name="kesava";
	int salary=55000;
	void sal()
	{
		System.out.println("Acc name: "+name);
		System.out.println("net ammount: "+(salary+30000));
	}
}
class child1 extends child2
{
	String name="amma";
	int salary=47574;
	void basicsal()
	{
		System.out.println("Acc name: "+name);
		System.out.println("net ammount: "+(salary+80000));
	}

	
	public static void main(String[] args) {
	child1 c1=new child1();
	c1.basicsal();
	c1.sal();
	c1.netsal();
	
		
	}
}