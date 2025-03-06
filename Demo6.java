import java.util.*;
class Demo6 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.printf("Enter into a:");
		int a=sc.nextInt();

		System.out.printf("Enter into b:");
		int b=sc.nextInt();

		/*
		int temp=a;
		a=b;
		b=temp;
		*/

		a=a+b;
		b=a-b;
		a=a-b;

		System.out.printf("a:%d",a);
		System.out.printf("\nb:%d",b);
	}
}