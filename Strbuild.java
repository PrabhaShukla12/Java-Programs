class Strbuild
{
public static void main(String args[])
{
	StringBuilder s= new StringBuilder("I am learning software testing");
	System.out.println(s);

	StringBuilder s1= new StringBuilder(" I am Prabha Shukla");
	System.out.println(s1);
	
	s.append(s1);
	System.out.println(s);

	s.insert(14, "selenium");
	System.out.println(s);

	s1.replace(5,10, "anyway");
	System.out.println(s1);

	s1.delete(1,6);
	System.out.println(s1);

	s.reverse();
	System.out.println(s);
}
}