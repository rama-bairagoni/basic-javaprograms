package baiscprograms2;

import java.net.MalformedURLException;
import java.net.URL;

public class CheckedExceptionpr 
{
    public static void main(String[] args)
    {
		try {
			@SuppressWarnings("deprecation")
			URL url=new URL("www.amezon.co");
			System.out.println(url);
		} catch (MalformedURLException e) 
		{
			
			System.out.println("Mallformed URL: "+e.getMessage());;
		}
		
	}
}
