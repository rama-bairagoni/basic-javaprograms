package Collection;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CollectionsMethods3 {

	public static void main(String[] args) 
	{
		Map<Integer,String> modifiableMap=new HashMap<>();
		modifiableMap.put(1,"java");
		modifiableMap.put(2, "python");
		modifiableMap.put(3, "c++");
		
		//Creating an unmodifiable map
	Map<Integer,String>unmodifiableMap	=Collections.unmodifiableMap(modifiableMap);
	//accessing the elements
	System.out.println("unmodifiableMap :"+unmodifiableMap);
	//Attempting to modify
	unmodifiableMap.put(4, "selenium");
	
	}

}
