package baiscprograms2;

public class HelloLetters {

	public static void main(String[] args)    //WAP to print each letter in the string hello
	{
		String word="hello";
		System.out.println("Letters in the word 'hello' : ");
		for(int i=0;i<word.length();i++) 
		{
			char letter=word.charAt(i);
			System.out.println("Letter at index "+ i + " :"+ letter);
		}

	}

}
