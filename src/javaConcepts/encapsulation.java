package javaConcepts;

public class encapsulation {
private int Empid;
private String Empname;


void set(int Empid,String Empname) {
this.Empid=Empid;
this.Empname=Empname;
}
void get()
{
	System.out.println(Empname);
System.out.println(Empid);	
}
	
	
	
	
public static void main(String[] args) {
	encapsulation e1=new encapsulation();
	e1.set(255, "niranjan");
	e1.get();
}	
	
}
