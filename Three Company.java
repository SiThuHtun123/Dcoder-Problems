package Learning;
import java.util.*;

class ProblemSolving
{
	public static void main(String[] args)
	{
		
		Scanner input = new Scanner (System.in);
		
		int howMany = input.nextInt();
		input.nextLine();
		
		String string = input.nextLine();
		
		String[] result = string.split("");
		
		for (int i = 0; i <= howMany - 1; i++)
		{
			System.out.print(result[i] + result[i] + result[i]);
		}
		
	}
}
