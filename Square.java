import java.util.*;
class Square
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number: ");
	int n= sc.nextInt();
	
	int sq = 1;
	sq= n*n;
	System.out.println("Square of "+ n +" is: "+ sq);	
}
}