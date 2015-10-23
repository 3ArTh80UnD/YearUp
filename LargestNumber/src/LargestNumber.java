
public class LargestNumber 
{

	public static void main(String[] args) 
	{
		int[] numbersArray = new int[] {-1, 34, 57, 89, 69, 72, -83};
		FindLargestNumberUsingWhileLoop(numbersArray);
		LargestNumberUsingForLoop(numbersArray);
	}
	
	  public static void FindLargestNumberUsingWhileLoop(int[] numbers)
	{
		if (numbers != null)
		{
			if (numbers.length > 0)
			{
				int i = 1;
				int largestNumber = numbers[0];
				while (i < numbers.length)
				{
					if (largestNumber < numbers[i])
					{
						largestNumber = numbers[i];
					}
					i++;
				}
				 System.out.println("Largest number using while loop is " + largestNumber);
			}
		}
	}
	public static void LargestNumberUsingForLoop(int[] numbers)
	{
		if (numbers != null)
		{
			if (numbers.length > 0)
			{
				int i = 1;
				int largestNumber = numbers[0];
				
				for (i = 1; i < numbers.length; i++)
				{
					if (largestNumber < numbers[i])
					{
						largestNumber = numbers[i];
					}

				}
				 System.out.println("Largest number using while loop is " + largestNumber);

			}
			
		}
	}

}
