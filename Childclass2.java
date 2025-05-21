package baiscprograms2;
abstract class Program
{
	abstract void add();
	abstract void sub();
	static void mul() 
	{
		System.out.println("logic for exposing 1");
	}
	void div() 
	{
		System.out.println("logic for exposing2");
	
	}
}




public class Childclass2 extends Program
{
	static void mod() 
	{
		System.out.println("logic for exposing3");
	}
	void arthematic() 
	{
		System.out.println("logic for exposing4");
	}

	public static void main(String[] args) 
	{
		Childclass2 c=new Childclass2();
		c.add();
		c.arthematic();
		c.div();
		Childclass2.mul();
		mod();
		c.sub();
	}
	
	void add() 
	{
		System.out.println("logic for exposing5");
		
	}
	
	void sub() 
	{
		System.out.println("logic for exposing6");
		
	}

}
