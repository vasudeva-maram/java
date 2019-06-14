package javaConcepts;

public class staticblock {
	static {
		 int a=120;
		 int b=234;
		 System.out.println("a+c: "+(a+b));
		 System.out.println("static block");
	}
	static String m1(int a)
	{
		System.out.println("static method");
		return null;
		
	}
	

	public static void main(String[] args) {
		staticblock st=new staticblock();
		//st.m1(54);// using reference variable
		//staticblock.m1(58);// using class name
		m1(25);//  directly calling method
		
		
	}

}
