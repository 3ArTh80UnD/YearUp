import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCart 
{
	public static ArrayList<Item> shoppingCart = new ArrayList<Item>();
	static Scanner itemSc = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		
		// this method prints an introduction message
		printIntroduction();
		
		//this method does all the work associated with the shopping cart
		shoppingCartWork();
	}
	
	public static void printIntroduction()
	{
		System.out.println("*************************************");
		System.out.println();
		System.out.println("*          Shopping Cart            *");
		System.out.println();
		System.out.println("*************************************");
	}
	
	public static void shoppingCartWork()
	{
		System.out.println("Do you want to input items? Type y/n");
		String reply = itemSc.nextLine();

		if (reply.equalsIgnoreCase("y"))
		{
			readItems();
			cleanUpCart();
			double totalWithTax = calculateTotalWithTax();
			printItemsAndTotal(totalWithTax);
			printCashOrCreditMessage(totalWithTax);
			
		}
		else
		{
			System.out.println("GoodBye!");
		}
	}

	private static void printItemsAndTotal(double totalWithTax) 
	{
		//WRITE CODE:  list all the items in the cart and print total with tax here
	}

	private static void printCashOrCreditMessage(double totalWithTax) 
	{
	//WRITE CODE: if total is over 100, they can use a credit card, otherwise they have to pay with cash.  Enter that code here
	}

	private static void readItems() 
	{	
		System.out.println("Enter next item name or 'quit' to stop:");
		String itemName = itemSc.nextLine();
		
		while(!itemName.equalsIgnoreCase("quit"))
		{			
			System.out.println("Enter next item price:");
			double itemPrice = itemSc.nextDouble();
			itemSc.nextLine();
			System.out.println("Enter next item quantity:");
			int quantity = itemSc.nextInt();
			itemSc.nextLine();
			
			//WRITE CODE: create a new item here and add to array list			
			System.out.println("Enter next item name or 'quit' to stop:");
			itemName = itemSc.nextLine();
		}		
	}
	
	private static void listItems() 
	{
		//WRITE CODE:  neatly format the list of items and print them
		//you should have it in this format:  
		//0: Name : Toothpaste Price: 4.56 Quantity: 3
	}
	
	private static void cleanUpCart() 
	{
		listItems();
	
		System.out.println("Do you wish to remove items, enter y or n:");
		String item = itemSc.nextLine();
		
		if (item.equalsIgnoreCase("y"))
		{
			System.out.println("Enter item number to remove, -1 to quit");
		
			int itemNumber = itemSc.nextInt();
			itemSc.nextLine();
		
			while(itemNumber != -1)
			{			
				//WRITE CODE:  if the item exists, remove it from the shopping cart					
			//WRITE CODE: re-list items (item indexes may have changed)
			
					System.out.println("Enter item number to remove from cart or -1 to stop:");
					itemNumber = itemSc.nextInt();
			}
		}
		
		
		itemSc.close();
	}


	private static double calculateTotalWithTax() 
	{
		//WRITE CODE:  Total up items as price * quantity for each item.  Add tax to the total for all items in cart and return total + tax.
	}

}
