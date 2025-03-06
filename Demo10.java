import java.util.*;
class Demo10 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Give any 4digit natural number:");
		int n=sc.nextInt();
		int fo=n%10;
		n=n/10;
		int th=n%10;
		n=n/10;
		int se=n%10;
		n=n/10;
		int fi=n%10;
		int rev=fo*1000+th*100+se*10+fi;
		System.out.println("Reverse:"+rev);
	}
}
