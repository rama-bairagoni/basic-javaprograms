package baiscprograms2;

public class StringBufferprogram 
{

	public static void main(String[] args)
	{
		StringBuffer s1=new StringBuffer("Automation Testing");
	//	System.out.println(s1.substring(10));
		System.out.println(s1.substring(11, 15));
		//s1.insert(10,"Software");
		//System.out.println(s1);
		//s1.append(" and Manual Testing");
		//System.out.println(s1);
		s1.delete(0, 10);
		System.out.println(s1);
	s1.replace(0, 8, "API");
	System.out.println(s1);
	StringBuffer s2=new StringBuffer("Manish kumar tiwari");
	//s2.delete(0, 6);
	//System.out.println(s2);
	s2.reverse();
	System.out.println(s2);
	}
	}


