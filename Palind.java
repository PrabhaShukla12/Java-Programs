import java.util.*;
class Palind
{
public static void main(String args[])
{
	String rev= new String ("");
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String: ");
	String str = sc.nextLine();
	String s= str;
	
	int l= s.length();
	
	for (int i= l-1; i>=0; i--)
	{
		rev = rev + s.charAt(i);
	}
	System.out.println("Reverse is: " + rev);

	if (str == rev)
	{
	System.out.println("Pallindrome String");
	}
	else
	{
	System.out.println("Not a Pallindrome String");
	}
}
}