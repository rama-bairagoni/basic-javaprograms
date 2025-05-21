package Collection;

import java.util.HashMap;
import java.util.Map;

public class MapPropertyprgrm {

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
     
   Boolean b1  =m1.equals(m2);
     System.out.println(b1);
     
	}

}
