class Animal
{
	String colour= "Black";
	void eat()
	{
		System.out.println("Animal is eating");
	}

	Animal()
	{
		super();
		System.out.println("This is Animal constructor");
	}
}

class Dog extends Animal
{
	String colour= "White";

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
		System.out.println("The colour of Animal is "+ super.colour);
		System.out.println("The colour of Dog is "+ colour);
	}
}

class Supp
{
public static void main(String args[])
{
	Dog d=new Dog();
	d.print();
}
}