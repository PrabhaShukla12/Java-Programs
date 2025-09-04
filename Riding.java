class Animal
{
void eat()
{
	System.out.println("Animal is eating");
}
}

class Dog extends Animal
{
void eat()
{
	System.out.println("Dog is eating");
}
}


class Riding
{
public static void main(String args[])
{
	Dog d = new Dog();
	d. eat(); 
}
}