import java.util.*;

public class ProblemSolving {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int howMany = input.nextInt();
		input.nextLine();
		String string = input.nextLine();
		String[] stringArray = string.split(" ");
		Collections.sort(Arrays.asList(stringArray), String.CASE_INSENSITIVE_ORDER);
		for (int i = 0; i <= howMany - 1; i++) {
			System.out.print(stringArray[i] + " ");
		}
	}
}
