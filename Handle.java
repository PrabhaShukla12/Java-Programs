class Handle
{
public static void main(String args[])
{
	int a=8;
	int b=0;
	try
{
	int c=a/b;
	System.out.println(c);
}
catch(ArithmeticException e)
{
	System.out.println("The integer cannot be divided by 0");
}
	System.out.println("Rest of the codes");
	System.out.println("Thank you");
}
}