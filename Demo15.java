import java.util.*;
class Demo15 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter any 3 digit natural number:");
		int num=sc.nextInt();

		if(num%10 == num/100)
			System.out.println("Palindrome number");
		else
			System.out.println("Not a palindrome number");
	}
}