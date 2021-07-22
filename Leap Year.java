package Learning;
import java.util.Scanner;

public class ProblemSolving
{
	
	static Scanner userInput = new Scanner (System.in);
	
	public static void main (String [] args)
	{
		
		int T = userInput.nextInt();
		
		while (T > 0)
		{
			
			Scanner userInput2 = new Scanner (System.in);
			
			int Year = userInput2.nextInt();
			
			if (Year % 4 == 0 && Year % 100 == 0 && Year % 400 == 0)
			{
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
			
			T--;
			
		}
		
	}
	
}
