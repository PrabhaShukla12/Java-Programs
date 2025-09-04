class Stringg
{

public static void main(String args[])
{
	char[] ch= {'J','a','v','a'};
	String s = new String(ch);
	String s1= "Welcome ";
	String s2= s1+s;
	String s3= "WELCOME ";
	System.out.println(s2);
	System.out.println(s1.equals(s3));
	System.out.println(s1.equalsIgnoreCase(s3));
	System.out.println(40+20+ "Software" + 70+ 20);
} 
}