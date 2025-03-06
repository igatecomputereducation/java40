import java.util.*;
class Demo19 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Gender:");
		String gen=sc.nextLine();
		
		System.out.print("Age:");
		int age=sc.nextInt();

		if( gen.equals("male") && age>=21 || 
								gen.equals("female") && age>=18)
			System.out.println("Major");
		else
			System.out.println("Minor");
	
	}
}
