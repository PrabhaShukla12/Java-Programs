// Reversing a string

import java.util.*;
class Strr
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String: ");
	String str= sc.nextLine();	
	String rev = new String (" ");
	int len= str.length();
	
	for (int i=len-1; i>=0; i--)
	{
		rev = rev + str.charAt(i);
	}
	
	System.out.println("After reversing the entered String: "+ rev);
}
} 