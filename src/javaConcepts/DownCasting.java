package javaConcepts;

public class DownCasting {

	public static void main(String[] args) {
		int i=3343;
		short s=(short)i;
		double d=s;
	byte b=(byte)d;
	long l=(long)b;
	float f =(float)l;
	System.out.println(i);
	System.out.println(d);
	System.out.println(b);
	System.out.println(l);
	System.out.println(f);
	
	}

}
// Type  casting: convertion of one datatype to another datatype

//      auto widening
// byte->short->int->long->float->double

// byte<-short<-int<-long<-float<-double