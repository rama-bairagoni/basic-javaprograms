package baiscprograms2;
interface A
{
	void add();
	void sub();
}
interface B
{
	void mul();
	void div();
}
public class Multiplelevel implements A,B
{

	public static void main(String[] args)
	{
		Multiplelevel m=new Multiplelevel ();
        m.add();
        m.sub();
        m.mul();
        m.div();

	}

	
	public void mul()
	{
		System.out.println("logic1");
		
	}

	
	public void div() {
		
		System.out.println("logic2");
	}

	
	public void add() {
		System.out.println("logic3");
		
	}

	
	public void sub() 
	{		
		System.out.println("logic4");
	}

}
