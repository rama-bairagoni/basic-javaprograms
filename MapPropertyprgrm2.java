package Collection;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapPropertyprgrm2 {

	public static void main(String[] args) 
	{
		Map<Integer,String> m1=new HashMap<Integer,String>();
		m1.put(33278, "RAMA");
		m1.put(67578, "RAJITHA");
		m1.put(33232, "ROOPA");
		m1.put(33237, "RESHMA");
     System.out.println(m1);
     
     Map<Integer,String> m2=new HashMap<Integer,String>();
		m2.put(33248, "anusha");
		m2.put(67528, "RAJi");
		m2.put(33222, "naveen");
		m2.put(33239, "sushu");
		m2.putAll(m1);
  System.out.println(m2);
  System.out.println("iteration done in a map using keySet()");
   for(   Integer     a    :m1.keySet())
   {
	   System.out.println(a);
   }
   System.out.println("iteration done in a map using values()");
   for( String b              :m1.values())
   {
	   System.out.println(b);
	  
   }
   System.out.println("iteration done in a map using entrySet()");
   for( Entry<Integer, String> c       :m1.entrySet()) 
   {
	   System.out.println(c);
   }
   Set<Entry<Integer,String>> s1=m1.entrySet();
  Iterator <Entry<Integer,String>> i1 =s1.iterator();
  while(i1.hasNext()) {
	  System.out.println(i1.next());
  }
   
     
  // Boolean b1  =m1.equals(m2);
  //   System.out.println(b1);
     
	}

}
