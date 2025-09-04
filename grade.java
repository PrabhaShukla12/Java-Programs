import java.util.*;
class grade
{
public static void main(String args[])
	{
		int marks;
		Scanner sc=new Scanner (System.in);
		System.out.println("Hi Student !!");
		System.out.print("Kindly enter your name: ");
		String name= sc.nextLine();
		System.out.print("Now, Enter your marks to know the grades: ");
		marks=sc.nextInt();
		if (marks>=250 && marks<=300)
		{
			System.out.println("Congratulations !! You have got grade A");
		}
		else if (marks>=200 && marks<250)
		{
			System.out.println("Great !! You have got grade B");
		}
		else if (marks>=150 && marks<200)
		{
			System.out.println("Good !! You have got grade C");
		}
		else if (marks>=100 && marks<150)
		{
			System.out.println("You have got grade D");
		}
		else if (marks>=50 && marks<100)
		{
			System.out.println("You have got grade E");
		}
		else if (marks>=0 && marks<50)
		{
			System.out.println("Sorry to say but you are fail");
		}
		else
		{
			System.out.println("Invalid entry, kindly enter the correct marks");
		}
	}
}