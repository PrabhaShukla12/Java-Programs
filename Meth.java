// ******************Initilization by method ****************

class Student
{
	int id;
	String name;
	int age;

void insert (int i, String n, int a)
{
	id=i;
	name=n;
	age=a;
}

void display ()
{
	System.out.println (id+ " "+ name+" " + age);
}

}

class Meth
{
public static void main (String args[])
{
	Student S1= new Student();	// creating an object
	Student S2= new Student();
	
	S1.insert(101, "Payal", 25);
	S1.display();

	S2.insert(101, "Payal", 25);
	S2.display();

}
}
