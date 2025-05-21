package Collection;

public class ReturnKeyword 
{
        static int  add(int a,int b) 
        {
        	int c=a+b;
        	return c;
        }
        static double  add(int a,double b) 
        {
        	double  c=a+b;
        	return c;
        }
        static boolean answer()
        {
        	return false;
        }
        
	public static void main(String[] args) 
	{
		System.out.println(add(94,98));
		System.out.println(add(76,98.6));

	}

}
