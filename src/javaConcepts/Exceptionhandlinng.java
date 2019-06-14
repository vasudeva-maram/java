package javaConcepts;

public class Exceptionhandlinng {
    public void add()
    {
    	System.out.println(10+20);
    }
    public void sub()
    {
    try {
    	System.out.println("Exception handling");
    	Integer i=new Integer("585");
    	System.out.println(i);
    	System.out.println("nirajnan");
    }
    catch(NumberFormatException e)
    {
    	System.out.println(e);
    }
    }
    public void mul()
    {
    System.out.println(52*85);	
    
    System.out.println(6+3);
	try{
	System.out.println(10/0);
	}
	catch(ArithmeticException e)
	{
		System.out.println(e);
	}
	System.out.println("hello");
    }
  	public static void main(String[] args) {
  		Exceptionhandlinng ex=new Exceptionhandlinng();
  		//Exceptionhandlinng ex= null;// GETTING NullPointerException
  		ex.add();
  		ex.sub();
  		ex.mul();
  		
	}

		
//	System.out.println(6+3);
//	try{
//	System.out.println(10/0);
//	}
//	catch(ArithmeticException e)
//	{
//		System.out.println(e);
//	}
//	System.out.println("hello");
//
//	}

}
