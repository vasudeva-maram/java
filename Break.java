package javaConcepts;
/*
 * break is used for only loop statements and switch 
 */
public class Break {
	public static void main(String[] args) {
		int i=10;
		for(;i>=0;i--)
		{
			if(i==5)
			{
				break;
			}
			System.out.println(i);
		}
		System.out.println("----swith statement");
	switch (i)
	{
	case 1:
		System.out.println(i);
		break;
	case 2:
		System.out.println(i);
		break;
	case 3:
		System.out.println(i);
		break;
	case 4:
		System.out.println(i);
		break;
	case 5:
		System.out.println(i);
		break;
		default :
			System.out.println(i);
	}
	
	
	
	
	
	
	
	}

}
