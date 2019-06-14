package javaConcepts;

public class Constructor {
	Constructor()
	{
		System.out.println("default constructor");
	}
	Constructor(int a,int b)
	{
		System.out.println("a= "+a+" b= "+b);
		System.out.println("parametarized constructor");
	}
	public static void main(String[] args) {
		Constructor c1=new Constructor();
		Constructor c2=new Constructor(821,845);

	}

}
