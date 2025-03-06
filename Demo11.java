import java.util.*;
class Demo11 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter an integer:");
		int num=sc.nextInt();
		
		if(num==0)
			System.out.println("Zero");
		
		if(num>0)
			System.out.println("Positive");
		
		if(num<0)
			System.out.println("Negative");
	}
}