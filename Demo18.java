import java.util.*;
class Demo18 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Random r=new Random();

		int otp=r.nextInt(1000,10000);
		System.out.println("Your OTP:"+otp);
		
		System.out.print("Enter your OTP:");
		int uotp=sc.nextInt();

		if(otp==uotp)
			System.out.println("Proceed..");
		else
			System.out.println("Invalid OTP");

	}
}
