package Learning;
import java.util.*;


public class ProblemSolving {
	
	static Scanner userInput = new Scanner (System.in);
	
	public static void main (String [] args)
	{

		int numberOfGroup = userInput.nextInt();
		
		String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
		String answer = "";
		for (int i = numberOfGroup - 1; i >= 0; i--)
		{		
			
			answer = alphabet[i];

			System.out.print(answer);

			
		}
		
	}
	
}
