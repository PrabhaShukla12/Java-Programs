import java.util.*;
class nested
{
public static void main(String args[])
	{
	int x,y;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the value of x: ");
	x=sc.nextInt();
	if (x==3)
	{
		System.out.println("Display x");
		System.out.print("Enter the value of y: ");
		y=sc.nextInt();
		if (y==2)
		{
			System.out.println("Display y");
		}
		else
		{
			System.out.println("Display z");
		}
	}
	else
	{
		System.out.println("Display outer Z");
	}
	}
}