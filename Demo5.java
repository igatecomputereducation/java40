import java.util.*;
class  Demo5
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.printf("Price:");
		float price=sc.nextFloat();

		System.out.printf("Quantity:");
		int qty=sc.nextInt();

		float bill=price*qty;

		System.out.printf("Bill %f",bill);
	}
}
