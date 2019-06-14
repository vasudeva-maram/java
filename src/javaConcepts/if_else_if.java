package javaConcepts;

public class if_else_if {
	public void checking(String name)
	{
		if(name.contains("niranjan"))
		{
			System.out.println("name:"+name);
		}
		else if(!(name.contains("niranjan")))
				{
			System.out.println("name:"+name);
				}
//		else
//		{
//			System.out.println("given input is:");
//		}
		
	}
	public static void main(String[] args) {
		if_else_if e1=new if_else_if();
		e1.checking("niranjan");
		
		
	}

}
