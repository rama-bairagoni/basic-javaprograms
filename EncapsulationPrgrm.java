package Collection;
  class SensitiveProgram
  {
	  private String un="contact@grotechminds.com";
	  public String  getUn() //fetching user name
	  {
		  return un;
	  }
	  public void setUn(String un) //updating the user name 
	  {
		this.un=un;  
	  }
	  private int otp=0000;
	  public int  getOtp() //fetching user name
	  {
		return otp; 
	  } 
	  public void  setOtp(int otp) //fetching user name
	  {
		 this.otp=otp;
	  } 
	 

	private char gender ='F';
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	  
  }


public class EncapsulationPrgrm {  //can be used by all the developers

	public static void main(String[] args) 
	{
		SensitiveProgram s1=new SensitiveProgram();
		s1.setUn("vishal@grotechminds.com");
		s1.setOtp(6575);
		s1.setGender('M');
		System.out.println(s1.getUn());
		System.out.println(s1.getOtp());
		System.out.println(s1.getGender());
	
		
	}

}
