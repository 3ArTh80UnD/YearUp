
public class Main 
{

	public static void main(String[] args) 
	{
		Person wrestler = new Person("Jared Covington", 55, "404-229-1298", "138 Winchester St");
		System.out.println("Wrestler's name is " + wrestler.GetName() + ".");
		System.out.println("Jared's age is " + wrestler.GetAge() + ".");
		System.out.println("Jared's phone number is " + wrestler.GetNumber() + ".");
		System.out.println("Jared's address is " + wrestler.GetAdress() + ".");
		System.out.println("It is Jun 28, 2015 today.");
		wrestler.GrowsOlder();
		System.out.println("Jared's age is now " + wrestler.GetAge() + ".");
	}

}
