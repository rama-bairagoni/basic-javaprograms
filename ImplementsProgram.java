package baiscprograms2;
interface Google
{
	void Loginwayauth();
	void LoginuseingOTP();
}





public class ImplementsProgram implements Google {

	public static void main(String[] args) 
	{
		ImplementsProgram i=new ImplementsProgram();
		i.Loginwayauth();
		i.LoginuseingOTP();
	}

	
	public void Loginwayauth() 
	{
		System.out.println("login in google with wayauthuntication");
	}

	
	public void LoginuseingOTP() 
	{
		System.out.println("login in google with OTP:124473");
	}

}
