package baiscprograms2;
abstract class One1
{
	abstract void method1();
	abstract void method2();
}
abstract class Two2 extends One1
{
	abstract void method3();
	abstract void method4();
}
public class MultilevelAbstract extends Two2{

	public static void main(String[] args)
	{
		MultilevelAbstract m=new MultilevelAbstract();
		m.method1();
		m.method2();
		m.method3();
		m.method4();
		System.out.println("Real logic1");
	}

	
	void method3() 
	{
		System.out.println("Real logic1");
	}

	
	void method4() 
	{
		
		System.out.println("Real logic2");
	}

	
	void method1() 
	{
		System.out.println("Real logic3");
	}

	
	void method2() 
	{
		System.out.println("Real logic4");
		
	}

}
