package javaConcepts;
class animal{
	void eating()
	{
		System.out.println("eating");
	}
	void sleeping()
	{
		System.out.println("sleeping");
	}
}
class tiger extends animal
{
void hunting()
{
	System.out.println("hunting");
}
void security()
{
System.out.println("security");	
}
}
public class Casting extends animal {
	void cat()
	{
		System.out.println("drinking milk");
		
	}
	void dog()
	{
		
	System.out.println("barking");
	}
	
	public static void main(String[] args) {
		System.out.println("------------upcasting------------");
	animal a1=new tiger();
	a1.eating();
	a1.sleeping();
	System.out.println();
	animal a2=new Casting();
	a2.eating();
	a2.sleeping();
	System.out.println("----------downcasting--------------");
	//tiger t1=new animal(); //it is not possible downcasting directly
  //tiger t1=(tiger)new animal();// it will showing an error
	tiger t1=(tiger)a1;
	t1.eating();
	t1.hunting();
	t1.security();
	t1.sleeping();
	System.out.println();
	Casting c1=(Casting)a2;
	c1.cat();
	c1.eating();
	c1.dog();
	c1.sleeping();
	}
	

}
