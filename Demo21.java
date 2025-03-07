import java.util.*;
class Demo21 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any integer:");
		int n=sc.nextInt();
		if(n>=-9 && n<=9)
			System.out.println("Single digit");
		else if(n>=-99 && n<=99)
			System.out.println("Two digit");
		else if(n>=-999 && n<=999)
			System.out.println("Three digit");
		else if(n>999)
			System.out.println("Biggest number");
		else
			System.out.println("Smallest number");
	}
}
