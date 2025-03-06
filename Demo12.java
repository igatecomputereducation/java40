import java.util.*;
class Demo12 
{
	public static void main(String[] args) 
	{

		Scanner sc=new Scanner(System.in);

		System.out.print("Enter a digit 0-6:");
		int day=sc.nextInt();
		
		/*
		Date d=new Date();
		int day=d.getDay();
		*/
	
		if(day==0)
			System.out.println("Sunday");

		if(day==1)
			System.out.println("Monday");

		if(day==2)
			System.out.println("Tuesday");

		if(day==3)
			System.out.println("Wednesday");

		if(day==4)
			System.out.println("Thursday");

		if(day==5)
			System.out.println("Friday");

		if(day==6)
			System.out.println("Saturday");

	}
}
