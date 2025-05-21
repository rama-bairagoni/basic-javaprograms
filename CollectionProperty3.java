package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class CollectionProperty3 {

	public static void main(String[] args) 
	{
		
		List<String> l1=new ArrayList<String>();
		l1.add("akash");
l1.add("rama");
l1.add("Adhya");
l1.add("Maha");
l1.add(0, "Mahi");
l1.add("rama");
l1.add(null);
l1.add(null);
System.out.println(l1);

 List<String> l2=new ArrayList<String>();
l2.add("kalki");
l2.add("raajita");
l2.add(0, "ankitha");
l2.addAll(0,l1);
l2.remove(0);
System.out.println(l2.get(5));
System.out.println(l2);


     Iterator <String> i1=l1.iterator();
//hasNext() ,Next();
     //hasNext-boolean=Whether next element is present or not?
     //Next-object-give u that element
     System.out.println("Iteration using Iterator(I)");
    while(i1.hasNext())
    {
    	System.out.println(i1.next());
    }
    ListIterator <String>i2=l1.listIterator();
    System.out.println("Iteration using ListIterator(I)");
    System.out.println("Iteration using ListIterator(I) in forward direction");
    while(i2.hasNext())
    {
    	
    	System.out.println(i2.next());
    }
	System.out.println("Iteration using ListIterator(I) in backward direction");
    while(i2.hasPrevious())
    {
    
    	System.out.println(i2.previous());
    }
	}

}
