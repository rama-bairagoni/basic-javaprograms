package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionProperty {

	public static void main(String[] args) 
	{
		Collection c1=new ArrayList();
			c1.add("MKT");        // add(object )is used to add the elements into the collection.
			c1.add(435432);
			c1.add(true);
			c1.add('M');
			System.out.println(c1);
			
			Collection c2=new ArrayList();
			c2.add("akash");
			c2.add(45655);
			c2.add(false);
			c2.add('A');
			c2.addAll(c1);  //addAll(Collection ) is used to add all the elements from one collection  to another collection.
			System.out.println(c2);
			System.out.println(c2.contains("jyoti")); // contains(object o) is used to check the specific element is present or not.
			System.out.println(c2.containsAll(c1));  // containsAll(collection c) checking  whether a collection contains all elements of another.
			c2.remove('A');
			System.out.println("updated "+c2);
			c2.removeAll(c1);
			System.out.println("updated"+c2);
			boolean b1=c2.equals(c1);
			System.out.println(b1);
			int i1=c2.size();//size() is used to get the number of elements in a collection.
			System.out.println(i1);
			
//c1.clear();
//System.out.println("aftr clear"+c1);// isEmpty() is returns true if the collection does not contains no elements.
	}                                //and is returns false if the collection having the elements.

}
