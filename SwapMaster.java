package Learning;
import java.util.*;

class ProblemSolving
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner (System.in);
		int howMany = input.nextInt();
		
		input.nextLine();
		
		String string = input.nextLine();
		
		String[] reverse = string.split(" ");
		
		for (int i = howMany - 1; i >= 0; i--)
		{
			System.out.print(reverse[i] + " ");
		}
		
	}
}
