import java.util.*;
class Sqroot
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number: ");
	int n= sc.nextInt();
	int result=0;
	
	for (int i=1; i<=n; i++)
	{
	if (i*i <= n)
	{
		result=i;
	} else
	{
		break;
	}
	}

	System.out.println("Square root of "+ n +" is: "+ result);
}
}