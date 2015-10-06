import java.util.Scanner;

public class TipCalculator
{
	static double tip15 = .15;
	static double tip20 = .20;
	static double tip25 = .25;
	public static void main(String[] args) 
	{
		System.out.println("Enter the amount for the check:");
		Scanner sc = new Scanner(System.in);
		double checkAmount = sc.nextDouble();
		
		double Tip15 = checkAmount * tip15;
		double Tip20 = checkAmount * tip20;
		double Tip25 = checkAmount * tip25;
		
		System.out.format("The 15 percent tip for this check is %3.2f%n", Tip15 );
		System.out.format("The 20 percent tip for this check is %3.2f%n", Tip20 );
		System.out.format("The 25 percent tip for this check is %3.2f%n", Tip25 );
		
		double Check15 = checkAmount + Tip15;
		double Check20 = checkAmount + Tip20;
		double Check25 = checkAmount + Tip25;
		
		System.out.format("The check with 15 percent tip is %3.2f%n", Check15 );
		System.out.format("The check with 20 percent tip is %3.2f%n", Check20 );
		System.out.format("The check with 25 percent tip is %3.2f%n", Check25 );
	}
	
}
