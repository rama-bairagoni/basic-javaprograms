package Collection;

import java.util.ArrayList;

public class JoinArrayLists {

	public static void main(String[] args)
	{
		//First ArrayList
		ArrayList<String> list1=new ArrayList<>();
		list1.add("Apple");
		list1.add("Banana");
		list1.add("cherry");
	
		//Second ArrayList
		ArrayList<String> list2=new ArrayList<>();
		list2.add("Date");
		list2.add("fig");
		list2.add("Grapes");
		list1.addAll(list2);
		System.out.println("All the objects of list2 will be added to the list1 "+list1);
		System.out.println(list2);
	}

}
