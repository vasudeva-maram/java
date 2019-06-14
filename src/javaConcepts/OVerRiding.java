package javaConcepts;
class Riding{
	String name="niranjan";
	int basic_sal=25000;
	int OT=6500;
	void sal()
	{
		System.out.println("name:"+name);
		System.out.println("net sal="+(basic_sal+OT));
	}
	
}
public class OVerRiding extends Riding
{
	void sal(int a,int b)
	{
		String name=this.name;
		System.out.println("name:"+name);
		System.out.println("net sal="+(a-b));
	}
public static void main(String[] args) {
	OVerRiding or=new OVerRiding();
	System.out.println("before OVERRIDING");
	or.sal();
	System.out.println("after OVERRIDING");
	or.sal(22225, 5244);
//	Riding r =new Riding();
//	r.sal(5225, 636);
//	
}
}
