package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Iteratorlistprgrm {

	public static void main(String[] args) 
	{
		ArrayList<Integer> a1=new ArrayList<> ();
		a1.add(123);
		a1.add(234);
		a1.add(23);
		a1.add(34);
		System.out.println("iterator using iterator");
		 Iterator<Integer> i1=a1.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		ListIterator<Integer> l1=a1.listIterator();
		System.out.println("iteration using list of iteration in forward direction");
		while(l1.hasNext()) {
			System.out.println(l1.next());
		}
		System.out.println("iteration using list of iteration in backword direction");
		while(l1.hasPrevious()) {
			System.out.println(l1.previous());
		}
		
			}

}
