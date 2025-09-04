import java.util.*;
class Palin
{
public static void main(String args[])
{
	int rev=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number: ");
	int n = sc.nextInt();
	int num = n;
	
	while(num!=0)
	{
		rev = rev * 10 + num % 10;
		num = num/10;
	}
	System.out.println ("Reversed number: " + rev);

	if (n == rev)
	{
	System.out.println("Pallindrome number");
	}
	else
	{
	System.out.println("Not a Pallindrome number");
	}
}
}