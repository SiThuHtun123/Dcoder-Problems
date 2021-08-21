import java.util.*;

public class ProblemSolving {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int howMany = input.nextInt();

		input.nextLine();
		String string = input.nextLine();

		String intValue = string.replaceAll("[^0-9]", "");
		String[] intArray = intValue.split("");

		for (int i = 0; i <= intArray.length - 1; i++) {
			System.out.print(intArray[i] + " ");
		}

	}
}
