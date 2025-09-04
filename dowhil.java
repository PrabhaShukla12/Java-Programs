import java.util.*;
class dowhil
{
public static void main(String args[])
{
int i=1,n;
Scanner sc=new Scanner (System.in);
System.out.print("Enter n: ");
n= sc.nextInt();
do
{
	if(i==5)
	{
		i++;
		break;
	} 
	System.out.println(i);
	i++;
} while (i<=n);
}
}