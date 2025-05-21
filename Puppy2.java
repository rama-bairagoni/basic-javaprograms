package baiscprograms2;
class Animal1
{
	void sound() 
	{
		System.out.println("all animal make sounds");
	}
}
class Dog3 extends Animal1
{
	void bow()
	{
		System.out.println("dog sound:bow");
	}
	
}
public class Puppy2 extends Dog3{

	public static void main(String[] args) 
	{
		Puppy2 p=new Puppy2();
		p.sound();
		p.bow();

	}

}
