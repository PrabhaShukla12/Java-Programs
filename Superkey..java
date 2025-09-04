class Bike
{
	int speed=100;
}

class Honda extends Bike
{
	int speed= 130;
	System.out.println("Bike is running at a fast speed");
}

class SuperKey
{
public static void main(String args[])
{
	Honda h=new Honda();
	System.out.printlln("Speed of Bike is: "+ h.speed);
}
}