import java.util.*;
class Rev
{
public static void main(String args[])
{
	int rev=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number which you want to reverse: ");
	int n=sc.nextInt();
	
	while(n!=0)
	{
		rev= rev* 10 + n%10;
		n= n/10;
	}
	
	System.out.println("After reversing the user entered number: "+ rev);
}
}