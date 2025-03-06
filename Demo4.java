import java.util.*;
class Demo4 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.printf("Breadth:");
		int bre=sc.nextInt();

		System.out.printf("Width:");
		int wid=sc.nextInt();

		System.out.printf("Height:");
		int hei=sc.nextInt();

		int vol=bre*wid*hei;

		System.out.printf("Volume of box %d",vol);
	}
}
