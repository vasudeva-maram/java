package com.Collection;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector v=new Vector(45);
		System.out.println("capacity: "+v.capacity());//10
		v.addElement(542);
		v.addElement(898);
		v.addElement(32);
		v.addElement("inm");
		v.addElement(null);
		System.out.println(v);//[542,898,32,inm,null]
		System.out.println(v.size());//5
		
		v.removeElementAt(3);// remove 3rd index value
		System.out.println(v);//[542,898,32,null]
		System.out.println(v.removeElement(32));// remove the object 32
		System.out.println(v);//[542,898,null]
		
		
	}

}
