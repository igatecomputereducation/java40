import java.util.*;
class Demo8 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.print("Radius:");
		int rad=sc.nextInt();

		double area=Math.PI*Math.pow(rad,2);
		double cir=2*Math.PI*rad;

		System.out.println("Area:"+area);
		System.out.println("Circumference:"+cir);		
	}
}