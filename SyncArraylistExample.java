package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SyncArraylistExample {

	public static void main(String[] args) 
	{
		List<String> list=new ArrayList<String>();
		List<String> synchronizedList=Collections.synchronizedList(list);
		 synchronizedList.add("java");
		 synchronizedList.add("c++");
		 
		 synchronized(synchronizedList)
		 {
			 for(String item : synchronizedList) 
			 {
				 System.out.println(item);
			 }
		 }
	}

}
