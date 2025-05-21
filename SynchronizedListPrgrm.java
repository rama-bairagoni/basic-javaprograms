package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedListPrgrm {

	public static void main(String[] args) 
	{
		List<String>list=new ArrayList<>();
		List<String>synclist=Collections.synchronizedList(list);//this line is used to create a threadsafe version of given list
		//adding elements to the synchronized list        //internally it call the threads one by one at atime.slower execution happened
		synclist.add("java");
		synclist.add("python");
      //accessing in a synchronized block
		synchronized(synclist)
		{
			for(String s : synclist)
			{
				System.out.println(s);
		}
	}

	
		
	}

}
