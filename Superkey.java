class Bike
{
	int speed=100;
}

class Honda extends Bike
{
	int speed= 130;

	void sp()
	{
		System.out.println("Speed of Bike is: "+ speed);
	}
	
}

class Sup
{
public static void main(String args[])
{
	Honda h=new Honda();
	h.sp();
}
}