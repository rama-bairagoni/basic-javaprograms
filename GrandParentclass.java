package baiscprograms2;

public class GrandParentclass 
{
  void method1() 
  {
	  System.out.println("1st method");
  }
}
  class Parentclass2 extends GrandParentclass
  {
	 void method2() 
	 {
		 System.out.println("2nd method");
	 }
  }
    class ChildProgram extends Parentclass2
  {
	  void method3() 
	  {
		  System.out.println("3rd method");
	  }
	 public static void main(String[] args)
	 {
		 ChildProgram c1=new ChildProgram();
		 c1.method1();
		c1.method2();
		c1.method3();
	} 
  

	
}
