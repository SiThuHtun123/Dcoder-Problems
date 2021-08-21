import java.util.*;

public class ProblemSolving {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String string = input.nextLine().toLowerCase();
		String[] stringArray = string.split("");

		String alphabet = "abcdefghijklmnopqrstuywxyz";
		int val = 0;

		for (int i = 0; i <= alphabet.length() - 1; i++) {
			if (Arrays.asList(stringArray).contains(Character.toString(alphabet.charAt(i)))) {
				val += i;
			}
		}

		if (val == 325) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}
}
