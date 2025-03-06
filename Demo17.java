import java.util.*;
class Demo17 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("User Name:");
		String uname=sc.nextLine();
		if(uname.equalsIgnoreCase("igate123"))
		{
			System.out.print("Password:");
			String pwd=sc.nextLine();
			if(pwd.equals("kavali"))
				System.out.println("Welcome");
			else
				System.out.println("Invalid password");
		}
		else
			System.out.println("Invalid user name");

	}
}
