package com.Collection;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack s=new Stack();
		s.push(365);
		s.push(56);
		s.push(null);
		s.push(56);
		s.push("ibm");
		System.out.println(s.capacity());// initial capacity 10
		System.out.println(s);//[365,56,null,56,ibm]
		System.out.println(s.peek());//ibm
		s.pop();//remove top elemenet in the stack
		System.out.println(s);// [365,56,null,56]
		System.out.println(s.empty());// false
		System.out.println(s.search(null));//2 it will showing the offset value 
		for(int i=1;i<=10;i++)
		{
			s.push(i);
		}
		System.out.println(s);
		System.out.println(s.capacity());
	}

}
