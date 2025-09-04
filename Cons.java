// Initialization by constructor *******************

class Student
{
	int id;
	String name;
	int age;
	String place;

Student()        // Default constructor
{
	System.out.println("No-arg constructor");
}

Student(int i)        
{
	System.out.println("One-arg constructor");
	id=i;
}

Student(int i, String n)        
{
	System.out.println("Two-arg constructor");
	id=i;
	name=n;
}

Student(int i, String n, int a,String p)        
{
	System.out.println("Four-arg constructor");
	id=i;
	name=n;
	age=a;
	place=p;
}

void display()
{
	System.out.println(id+ " "+ name+ " "+ age + " "+ place);
}

}


class Cons
{
public static void main(String args[])
{
	Student S1=new Student();
	Student S2=new Student(2385,"Kajal");
	Student S3=new Student(1298, "Tushar", 24, "Delhi");
	
	S1.display();
	S2.display();
	S3.display();	
}
}