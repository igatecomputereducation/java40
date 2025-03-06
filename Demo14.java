import java.util.*;
class Demo14 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter any natural number:");
		int num=sc.nextInt();

		if(num%2==0)
			System.out.println("Even number");
		else
			System.out.println("Odd number");
	
	}
}