package baiscprograms2;

public class Strinfunction2 
{
	static String a="Mahasri";
	static String b="                 NIKKI id good girl                    ";
	public static void main(String[] args)
	{ 
		
	
		System.out.println("a equals to b:"+a.equalsIgnoreCase(b));
	System.out.println(b.toUpperCase());
	System.out.println(b.toLowerCase());
	System.out.println(a.lastIndexOf('s'));
	System.out.println(b.lastIndexOf("good"));
	
	char ch=b.charAt(4);
	System.out.println(ch);
	System.out.println(b);
	System.out.println(b.trim());

	
	
	}

}
