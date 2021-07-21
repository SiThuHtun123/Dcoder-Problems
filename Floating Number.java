package Learning;

import java.util.Scanner;

public class ProblemSolving 
{
	static Scanner Times = new Scanner (System.in);
	
	public static void main (String[] args)
	{
		int T = Times.nextInt();
		
		while (T > 0)
		{
		
			Scanner userInput = new Scanner (System.in);
			
			System.out.print("");
			
			double decimalNumber = userInput.nextDouble();
			
			double roundingNumber = (double) Math.round(decimalNumber * 100) / 100;
			
			System.out.print(roundingNumber);
			T--;
		
		}
	}
}
