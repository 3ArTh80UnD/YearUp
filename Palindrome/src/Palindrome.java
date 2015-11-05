import java.util.Scanner;
public class Palindrome 
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		String inputNoSpaces = input.replace(" ", ""); //Gets rid of all the empty spaces in the input before checking if it's a palindrome
		PalindromeCheck(inputNoSpaces);
		
	}

	private static void PalindromeCheck(String input) 
	{
		if (input != null) //null check
		{
			char[] inputChars = input.toCharArray(); //creates a variable to be used in this method
			boolean isPalindrome = true;
			
			//Parameters. Establishes the variables that will stand for positions in the array to be checked by the program.
			for (int i = 0, j = input.length() - 1; i < inputChars.length/2; i++, j--)
			{
				if (inputChars[i] != inputChars[j])
				{
					isPalindrome = false;
					break;
				}
			}
			
			System.out.println(input + " is a palindrome: " + isPalindrome + ".");
		}
	}

}
