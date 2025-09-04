import java.util.*;
class sumpro
{
public static void main(String args[])
{
	int n, sum=0, product=1;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter n: ");
	n=sc.nextInt();
	for(int i=1; i<=n;i++)
	{
		System.out.println(i);
		sum=sum+i;
		product=product*i;
	}
	System.out.println("Sum: "+sum);
	System.out.println("Product: "+ product);
}
}