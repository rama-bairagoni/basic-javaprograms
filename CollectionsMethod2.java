package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsMethod2 {

	public static void main(String[] args) 
	{
		List<Integer>list=new ArrayList<Integer>(Arrays.asList(1,2,3,5,4,6,7));
        Collections.sort(list);
        System.out.println("sorted the list :"+list);
        Collections.reverse(list);
        System.out.println("reverse the list"+ list);
        Collections.shuffle(list);
        System.out.println("shuffle the list"+ list);
       Collections.rotate(list, 2);            //rotate elements in right 7,1,2,3,4,5,6,(6,7,1,2,3,4,5)
       System.out.println("rotate the list"+ list);
	}

}
