package javaConcepts;
class Methodoverload{
//	int a=19;
//	int b=30;
	static int m1(int a,int b)
	{
		System.out.println("add:"+(a+b));
		return a+b;
	}
	void m1(int i,int j,int k)
	{
		System.out.println("sumof:"+(i+j+k));
	}
	static {
		System.out.println("static block");
	}
}

public class Overloading extends Methodoverload {
	public static void main(String[] args) {
		Overloading or =new Overloading();
	 or.m1(255, 851);
	 or.m1(56, 47, 646);
	 //System.out.println(Methodoverload.m1(55416, 35416));
	 
	}

}
