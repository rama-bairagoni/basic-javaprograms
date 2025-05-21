package baiscprograms2;
interface O9
{
	void one();
	void two();
	
}
interface T9
{
	void three();
	void four();
}
public class Multilevelconnect implements O9,T9
{
	static  void five() 
	{
		System.out.println("logic1");
	} 
	void six() 
	{
		System.out.println("logic2");
	}

	public static void main(String[] args) 
	{
	   five();
	   Multilevelconnect m=new Multilevelconnect();
	   m.six();
	   m.one();
	   m.two();
	   m.three();
	   m.four();

	}
	
	public void three()
	{
		System.out.println("logic3");
		
	}
	
	public void four() 
	{
		System.out.println("logic4");
	}
	
	public void one() {
		
		System.out.println("logic5");
	}
	
	public void two() {
		System.out.println("logic6");
		
	}

}
