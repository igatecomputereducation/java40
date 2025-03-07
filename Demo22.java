import java.util.*;
class Demo22 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.print("Price:");
		float price=sc.nextFloat();
		
		System.out.print("Quantity:");
		int qty=sc.nextInt();
		
		float bill=price*qty;

		float dis=(bill>=1500)?bill*7/100:bill*3/100;

		float nbill=bill-dis;

		System.out.println("Bill:"+bill+"\nDiscount:"+
			dis+"\nNetbill:"+nbill);

	}
}