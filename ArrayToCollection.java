package Collection;

import java.util.Arrays;
import java.util.List;

public class ArrayToCollection {

	public static void main(String[] args) 
	{
		//define an array.
		String[] array= {"apple","banana","cherry"};
		
		//convert the array to a List using Arrays.asList()
			List<String> list =Arrays.asList(array);
			System.out.println("arrays converted to list:");
			for(String item:list)
			{
			System.out.println(item);
				
			}

	}

}
