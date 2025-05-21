package baiscprograms2;


public class CheckedExceptionpr2 
{
    public static void main(String[] args) 
    {
    	for(int i=1;i<=50;i++) 
    	{
    		System.out.println(i);
    		try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			};
    	}
    }
    
}
