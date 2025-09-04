class Ex
{
public static void main(String args[])
{
	int a=4;
	int b=0;
	int c;
	try
	{
		c=a/b;
		System.out.println(c);
	}
	catch (ArithmeticException e)
	{
		System.out.println("An integer cannot be divided by 0");
	}
	finally{
	System.out.println("Rest of the codes");
	System.out.println("THANK YOU !!");
	}
}
}