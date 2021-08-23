import java.util.*;

public class ProblemSolving {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int howMany = input.nextInt();
		input.nextLine();
		for (int i = 0; i <= howMany - 1; i++) {
			String result = input.nextLine();
			 char a = result.charAt(0);
			System.out.println(result.charAt(0) + result.charAt(result.length()-1) - '0' - '0');
		}
	}
}
