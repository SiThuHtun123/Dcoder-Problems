import java.util.*;

public class ProblemSolving {
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		int howMany = input.nextInt();
		input.nextLine();
		String string = input.nextLine();
		String[] stringArray = string.split(" ");
		int result = 0;
		for (int i = 0; i <= howMany - 1; i++) {
			if (Integer.parseInt(stringArray[i]) > 0) {
				result += 0;
			} else {
				result += 1;
			}
		}
		if (result > 0) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
	}
}
