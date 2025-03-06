import java.util.*;
class Demo9 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any 3 digit natural number:");
		int n=sc.nextInt();
		int th=n%10;
		n=n/10;
		int se=n%10;
		n=n/10;
		int fi=n%10;
		int sm=fi+se+th;
		System.out.println("Sum of all the digits:"+sm);
	}
}