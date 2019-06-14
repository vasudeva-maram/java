package javaConcepts;

public class WrapperClasses {

	public static void main(String[] args) {
		//int i1=new int();// we are not creating object for the primitive datatypes
		Integer i1=new Integer(1000);
		System.out.println(i1);
		Integer i2=new Integer("545");
		System.out.println(i2);
		//Integer i3=new Integer("dsfdsg");
		//System.out.println(i3);//it will throwing an exception like NumberFormatException
		// because integer will not convert string to integer.
		
		Boolean b1=new Boolean(true);
		
		System.out.println(b1);
		Character c1=new Character('t');
		System.out.println(c1);
		
		
		
		Integer i3=Integer.valueOf(525);
		// valuesOf() is creating wrapper class objects and its alternative to the constructor
		
		System.out.println(i3.doubleValue());//here Integer value is changes too double
		//xxxValue() is converting wrapper class object value to primitive data type values
		Long l1=Long.valueOf("2454");
		float l=l1.floatValue();
		System.out.println("float value= "+l);
		System.out.println(l+i3.doubleValue());
		
		String s1="5554";
		String s2="2545";
		System.out.println(s1+s2);
		int i=Integer.parseInt(s1);
		float f=Integer.parseInt(s2);
		System.out.println(i+f);
		
		WrapperClasses wc=new WrapperClasses();
		wc.toString();
		
		}
		
		
	}


