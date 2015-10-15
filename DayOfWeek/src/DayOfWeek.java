import java.util.Scanner;

public class DayOfWeek 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a new day of the week:");
		String dayOfWeek = sc.nextLine();
		EvaluateDayOfWeek(dayOfWeek);
		sc.close();
	}

	public static void EvaluateDayOfWeek(String dayOfWeek)
	{
		if (dayOfWeek != null)
		{
			if (!dayOfWeek.isEmpty())
			{
				if(dayOfWeek.equalsIgnoreCase("Monday") ||
				   dayOfWeek.equalsIgnoreCase("Tuesday") ||
				   dayOfWeek.equalsIgnoreCase("Wednesday") ||
				   dayOfWeek.equalsIgnoreCase("Thursday") ||
				   dayOfWeek.equalsIgnoreCase("Friday"))
				{
					System.out.println(dayOfWeek + " is a weekday.");
				}
				else if(dayOfWeek.equalsIgnoreCase("Saturday") ||
						dayOfWeek.equalsIgnoreCase("Sunday"))
				{
					System.out.println(dayOfWeek + " is a weekend day.");
				}
				else
				{
					System.out.println("This is not a valid day of the week!");
				}
			}

			else
			{
				System.out.println("You have not entered anything!!");
			}
		}
		else
		{
			System.out.println("You have given a null string!!!");
		}

	}
}
