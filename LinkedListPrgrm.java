package Collection;

import java.util.LinkedList;

public class LinkedListPrgrm {

	public static void main(String[] args) 
	{
		LinkedList<Integer>l1=new LinkedList<>();
		l1.add(12);
		l1.add(21);
		l1.add(321);
		l1.add(22);
		System.out.println(l1.getFirst());
		System.out.println(l1.getLast());
		System.out.println(l1.peekFirst());
		System.out.println(l1.peekLast());
		l1.addFirst(11);//add these element in top of the an array.
		System.out.println(l1);
		System.out.println(l1.offerFirst(111));
		
	}

}
