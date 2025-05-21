package Collection;

public class ThisKeyword 
{
 int candid;
 String name;
 double salary;
 
 void canditatedetails(int candid,String name,double salary) 
 {
	 this.candid=candid;
	 this.name=name;
	 this.salary=salary;
	// System.out.println(candid);
	// System.out.println(name);
	// System.out.println(salary);
 }
 //this.globalvariable=local variable;
 
	public static void main(String[] args) 
	{
		ThisKeyword t1=new ThisKeyword ();
		t1.canditatedetails(65, "rama", 98000);
		System.out.println(t1.candid);
		 System.out.println(t1.name);
		 System.out.println(t1.salary);

	}

}
