//  Run time polymorphism - Shapes

class Shape
{
void closed()
{
	System.out.println("Shape is closed");
}
}

class Circle extends Shape
{
void closed()
{
	System.out.println("Circle is closed");
}
}

class Triangle extends Shape
{
void closed()
{
	System.out.println("Triangle is closed");
}
}

class Square extends Shape
{
void closed()
{
	System.out.println("Square is closed");
}
}

class Pentagon extends Shape
{
void closed()
{
	System.out.println("Pentagon is closed");
}
}


class Test
{
public static void main(String args[])
{
	Shape s;

	s=new Circle();
	s.closed();

	s=new Triangle();
	s.closed();

	s=new Square();
	s.closed();

	s=new Pentagon();
	s.closed();
}
}