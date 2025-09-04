class Calc
{
	int add(int a, int b)
	{
	return a+b;
	}

	double add(double a, double b)
	{
	return a+b;
	}

	int add(int a, int b, int c)
	{
	return a+b+c;
	}
}

class Mainn
{
public static void main(String args[])
{
	Calc c=new Calc();
	System.out.println(2+3);
	System.out.println(2.8+3.3);
	System.out.println(2+3+8);
}
}