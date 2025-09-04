******************Initilization by Reference variable ****************

class Student
{
	int id;
	String name;
	int age;
}

class Ref
{
public static void main (String args[])
{
	Student S1= new Student();	// creating an object
	S1.id= 234;
	S1.name= "Kanu";
	S1.age=27;
	System.out.println(S1.id + " "+ S1.name + " "+S1.age);
}
}
