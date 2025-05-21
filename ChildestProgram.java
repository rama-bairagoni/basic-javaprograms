package baiscprograms2;
class O1
{
static void method1() 
{
	System.out.println("one1");
}
		
		
	
}
class T1 extends O1
{
	static void method2() 
	{
		System.out.println("two2");
	}
}
public class ChildestProgram extends T1
{

	public static void main(String[] args) 
	{
		method1();
		method2();
	}

}
