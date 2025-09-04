class Bike
{
	final int speed= 50;

void run()
{
	
	System.out.println(speed);
}
}

class Honda extends Bike
{
	void run()
	{
		System.out.println("The speed of Honda is very fast");
	}
}

public static void main(String args[])
{
	Honda h=new Honda();
	h.run();
}
}