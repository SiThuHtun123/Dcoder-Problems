package Learning;
import java.util.*;

class ProblemSolving
{
	public static void main (String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		int howMany = input.nextInt();
		
		input.nextLine();
		
		String integer = input.nextLine();
		
		String[] result = integer.split(" ");
		
		int result2 = 0;

		for (int i = 0; i <= howMany - 1; i++)
		{

			result2 = result2 + Integer.parseInt(result[i]);

		}
		
		int max = Integer.parseInt(result[0]);
		
		for (int i = 0; i < result.length; i++)
		{

			if (Integer.parseInt(result[i]) > max)
			{
				max = Integer.parseInt(result[i]);
			}
			
		}
		
		System.out.print(result2 % max);
	
	}
}










