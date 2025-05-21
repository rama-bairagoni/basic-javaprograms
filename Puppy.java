package baiscprograms2;
class Animal
{
	static void eat()
	{
		System.out.println("Animals eats ");
	}
}
class Dog extends Animal
{
	static void Bark() 
	{
		System.out.println("dog making sound");
	}
	
}	
 public class Puppy extends Dog  
 {

	public static void main(String[] args) 
	{
		eat();
		Bark();
	}
		

	
	}

	