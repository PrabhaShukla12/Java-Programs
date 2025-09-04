class Animal
{
	final int speed= 40;
	void eat()
	{
		System.out.println("Animal is running with the speed of 40 km/hr");
	}

	Animal()
	{
		super();
		System.out.println("This is Animal constructor");
	}
}

class Dog extends Animal
{
	int speed= 70;

	void eat()
	{
		System.out.println("Dog is eating");
	}

	void bark()
	{
		System.out.println("Dog is barking");
	}

	Dog()
	{
		System.out.println("This is Dog constructor");
	}

	void print()
	{
		super.eat();
		eat();
		bark();
		System.out.println("The colour of Animal is "+ speed);
		System.out.println("The colour of Dog is "+ speed);
	}
}

class Fina
{
public static void main(String args[])
{
	Dog d=new Dog();
	d.print();
}
}