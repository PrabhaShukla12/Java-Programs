import java.util.*;
class validage
{
public static void main(String args[])
{
int age;
Scanner sc=new Scanner(System.in);
System.out.print("Enter your name: ");
String name= sc.nextLine();
System.out.print("Please enter your age: ");
age=sc.nextInt();
if (age>=18 && age<60)
	{
	System.out.println(name+ ", You can donate your blood.");
	}
else
	{
	System.out.println(name+", You cannot donate your blood.");
	}
}
}