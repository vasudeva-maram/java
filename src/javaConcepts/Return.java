package javaConcepts;

public class Return {
	
		 int m2(int a,int b)
		{
				return a+b;// return is only inside the method only
			
		}
		 String name(String a,String b)
		{
		return a+b; 	
		}
public static void main(String[] args) 
		{
	Return r=new Return();

		System.out.println(r.m2(441, 35));
		System.out.println(r.name("niranjan ", "naidu"));




		}
}
