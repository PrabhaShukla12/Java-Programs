import java.util.*;
class Arms
{
public static void main (String args[])
{
	Scanner sc= new Scanner (System.in);
	System.out.println("Enter a number");
	int n= sc.nextInt();
	int temp=n;
	int arms = 0;

	String strn= String.valueOf(n);
	int len= strn.length();
		
	while (temp!=0)
	{
		int rem = temp % 10;
		int mul = 1;

	for (int i=1; i<=len; i++)
	{
		mul = mul * rem;
	}
		arms = arms + mul;
		temp= temp/10;
	}
	
	System.out.println(arms);

	if (arms == n)
	{
		System.out.println("Armstrong no");
	}
	else
	{
		System.out.println("Not an armstrong no");	
	}
}
}