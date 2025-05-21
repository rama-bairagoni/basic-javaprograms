package baiscprograms2;

public class StringMutable {

	public static void main(String[] args) 
	{
		String str="Java";
		 String str=str.concat("Programming");//giving birth to the new string.
		System.out.println(str);   //immutable means string can not be change the value once it is created.
	    /* String name= new String("chethan");
	     System.out.println(name);
	     StringBuilder s4=new StringBuilder("school");
	     s4.append(" is abcd");
	     System.out.println(s4);//mutable means something that can changed.

	     StringBuffer s6=new StringBuffer("school");                                 // string come java 1.0 versions
	     s6.append(" is abcd");                                                       //stringsBuffer java 1.0
	     System.out.println(s6);//mutable means something that can changed.             //StringBuilder is 1.5 java version.

	}                                                           // String ,StringBuilder,StringBuffer is came from java lang.package
                                                                //StringBuilder,StringBuffer is having 16 default size.
}
                                                             
//StringBuilder,StringBuffer are  invoked by using constructors.
//String concept insert,delete are not present.because it is immutable .
 //stringBuilder ,string buffer have 3 types of constructor 
//                 StringBuilder s4=new StringBuilder();
//                 StringBuilder s4=new StringBuilder("school");
                  //StringBuilder s4=new StringBuilder(100);
                 //StringBuffer s6=new StringBuffer();
//StringBuffer s6=new StringBuffer("school");
//StringBuffer s6=new StringBuffer(100);*/
	}
}