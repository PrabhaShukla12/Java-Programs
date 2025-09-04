// Multi-level Inheritence

class Animal
{
	void eat()
	{
		System.out.println("Animal is eating");
	}
}

class Dog extends Animal
{
	void bark()
	{
		System.out.println("Dog is barking");
	}
}

class Puppy extends Dog
{
	void weep()
	{
		System.out.println("Puppy is weeping");
	}
}

class Small extends Puppy
{
	void cry()
	{
		System.out.println("Small is crying");
	}
}


class Multi
{
public static void main(String args[])
{
	Dog d=new Dog();
	d.bark();
	d.eat();

	Puppy p=new Puppy();
	p.weep();
	p.bark();
	p.eat();

	Small s=new Small();
	s.cry();
	s.weep();
	s.bark();
	s.eat();
}
}