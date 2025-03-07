import java.util.*;
class Demo23 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 2 integers..");
		int x=sc.nextInt();
		int y=sc.nextInt();

		System.out.print("1.Add\n2.Subtract\n3.Product
				\n4.Division\nEnter your choice [1..4]:");
		int ch=sc.nextInt();

		switch(ch)
		{
			case 1:
				System.out.println("Addition:"+(x+y));
				break;
			case 2:
				System.out.println("Subtraction:"+(x-y));
				break;
			case 3:
				System.out.println("Product:"+x*y);
				break;
			case 4:
				System.out.println("Division:"+(float)x/y);
				break;
			default:
				System.out.println("Invalid choice");
		}
	}
}