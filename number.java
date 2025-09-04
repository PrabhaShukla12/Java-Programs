import java.util.*;
class number
{
	public static void main(String args[])
	{
		int x;
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter the number: ");
		x=sc.nextInt();
		System.out.println(x%2==0);
		String y= (x%2==0)? "Even number" : "Odd number";
		System.out.println(y);
	}
}