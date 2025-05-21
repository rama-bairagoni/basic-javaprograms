package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorPrgrm {

	public static void main(String[] args)
	{
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);
		a1.add(60);
		
		Iterator<Integer> i=a1.iterator();
		System.out.println("Iteration using iterator()");
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
     ListIterator<Integer>  l1 =a1.listIterator();
     System.out.println("Iteration using listiterator() in fardward direction");
     while(l1.hasNext())
		{
			System.out.println(l1.next());
		}
     System.out.println("Iteration using listiterator() in backward direction");
     while(l1.hasPrevious())
     {
    	 System.out.println(l1.previous());
     }
	}
}
