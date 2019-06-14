package com.Collection;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add(46);
		l.add(4878);
		l.add(null);
		l.add("ibm");
		l.add(46);
		System.out.println(l);//[46,4878,null,ibm,46]
		System.out.println(l.size());//5
		l.remove();// remove first 0th index value
		System.out.println(l);//[4878,null,ibm,46]
		l.remove(3);// remove 3rd index value
		System.out.println(l);//[4878,null,ibm]
		l.remove(null);// remove null object
		System.out.println(l);// [4878,ibm]
		System.out.println(l.getFirst());// first object
		System.out.println(l.getLast());// last object
		
	}

}
