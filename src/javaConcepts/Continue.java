package javaConcepts;

public class Continue {

	public static void main(String[] args) {
		int a=20;
		for(;a<=30;a++)
		{
			if(a==25)
			{
		     continue;// skip the current flow  of execution
			}
			System.out.println(a);
		}
	}

}
