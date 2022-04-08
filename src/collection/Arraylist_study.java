package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Arraylist_study {


	public static void main(String[] args) {
		
		ArrayList<Object> ar = new ArrayList<Object>();
		ar.add(123);
		ar.add("Name");
		ar.add(120.223);
		ar.add('A');
		ar.add(true);
		ar.add(null);
		
		System.out.println(ar);
		System.out.println("      ");
		System.out.println("============");
		
		for(int i=0; i<=ar.size()-1;i++) {
			System.out.println(ar.get(i));
		}
		System.out.println("      ");
		System.out.println("============");
		
		for(Object o:ar) {
			System.out.println(o);
		}
		
		System.out.println("      ");
		System.out.println("============");
		
		Iterator<Object> it = ar.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		ArrayList<Integer> e = new ArrayList<Integer>();
		
		e.add(1);
		e.add(2);
		e.add(15);
		e.add(32);
		e.add(41);
		e.add(5);
		
		System.out.println(e);
		
		System.out.println(" ");
		
		e.removeIf(num -> num % 2 == 0);
		System.out.println(e);

	}

}
