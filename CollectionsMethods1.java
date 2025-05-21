package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class CollectionsMethods1 
{
   public static void main(String[] args) 
   {
	   Collection<Integer>numbers=new ArrayList<Integer>(Arrays.asList(10,20,30,40,10,20,10));
	   System.out.println("Min :" +Collections.max(numbers));
	   System.out.println("Max :"+Collections.min(numbers));
	   System.out.println("Frequency :"+Collections.frequency(numbers,10));
}
}
