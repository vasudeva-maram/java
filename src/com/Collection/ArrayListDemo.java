package com.Collection;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(52);
		a.add(2);
		a.add(null);
		a.add("niranjan");
		a.add(25);
		a.add(2);
		System.out.println(a);//[52,2,null,niranjan,25,2]
		System.out.println(a.size());//6
		//a.remove(2);// remove 2nd index
		System.out.println(a);//[52,2,niranjan,25,2]
		a.remove(4);// remove 4th index value
		a.add(2, "ibm");// add 2nd index "ibm"
		System.out.println(a);//[52,2,ibm,niranjan,25]
		a.remove(1);// remove 1st index
		System.out.println(a);//[52,ibm,niranjan,25]
		
		
	}

}
