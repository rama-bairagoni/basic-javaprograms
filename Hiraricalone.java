package baiscprograms2;
class three
{
	void college() 
	{
		System.out.println("They are going to college");
	}
}
class four extends three
{
	void school() 
	{
		System.out.println("They are going to school");
	}
}
public class Hiraricalone extends three
{
  void play() 
  {
	  System.out.println("playing");
  }
  public static void main(String[] args)
  {
	  Hiraricalone h=new Hiraricalone();
	  h.college();
	  h.play();
	  four f=new four();
	  f.school();
	  f.college();
	  
	
}
}
