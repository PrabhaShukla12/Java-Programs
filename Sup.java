class Animal
{
	String colour= "Black";
}

class Dog extends Animal
{
	String colour= "White";

	Void print()
	{
		System.out.println("The colour of Dog is White"+ colour);
	}
}

class Sup
{
public static void main(String args[])
{
	Dog d=new Dog();
	d.print();
}
}