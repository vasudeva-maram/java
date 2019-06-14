package javaConcepts;

import java.awt.List;
import java.util.ArrayList;

public class ArrayListconcepts{
	public static void main(String[] args) {
	ArrayList ar=new ArrayList();
	System.out.println("adding the values to array");
		ar.add(52);
		ar.add(244);
		ar.add(null);
		ar.add("niranjan");
		ar.add('c');
		ar.add("gutha");
		ar.add(5458);
		System.out.println(ar);
		System.out.println();
		System.out.println("remove 4th index values in that array");
		ar.remove(4);
		System.out.println(ar);
		System.out.println();
		System.out.println("remove the string name gutha");
		ar.remove("gutha");
		System.out.println(ar);
		System.out.println();
		System.out.println("---------------ArrayList with generics ----------------");
		ArrayList<Integer> ar1=new ArrayList<Integer>();
		ar1.add(120);
		ar1.add(545);
		ar1.add(542);
		System.out.println(ar1);
		Integer[] a=new Integer[ar1.size()];
		System.out.println(ar1.toArray(a));
		int sum=0;
		for(Integer a1:a)
		{
			sum=sum+a1;
			System.out.println(a1);
		}
		System.out.println(sum);
		
	}

}