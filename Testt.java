// interface example

interface Shape
{
void closed();
}

interface Sides
{
void side();
}

class Circle implements Shape,Sides
{
public void closed()
{
	System.out.println("Circle is round");
}

public void side()
{
	System.out.println("Circle has no sides");
}
}

class Square implements Shape,Sides
{
public void closed()
{
	System.out.println("All the sides of square are equal");
}

public void side()
{
	System.out.println("A square has four sides");
}
}


class Testt
{
public static void main(String args[])
{
	Circle c=new Circle();
	c.closed();
	c.side();

	Square s=new Square();
	s.closed();
	s.side();

}
}