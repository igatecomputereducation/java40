import java.util.*;
class Demo20 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any alphabet:");
		char ch=sc.nextLine().toLowerCase().charAt(0);
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			System.out.println("Vowel");
		else
			System.out.println("Consonent");
	}
}