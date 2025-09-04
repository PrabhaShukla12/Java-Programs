class Str
{
public static void main(String args[])
{
	String s= "I am learning software testing";
	System.out.println(s);

	String s1= " I am Prabha Shukla ";
	System.out.println(s1);
	
	String s2= s.concat(s1);
	System.out.println(s2);

	System.out.println(s.length());
	System.out.println(s1.length());
	System.out.println(s2.length());

	System.out.println(s.toUpperCase());
	System.out.println(s1.toLowerCase());
	System.out.println(s1.trim());

	System.out.println(s2.replace("software", "selenium"));
	
	System.out.println(s.startsWith("I"));
	System.out.println(s1.endsWith("l"));

	System.out.println(s1.charAt(6));
}
}