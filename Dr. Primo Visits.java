import java.util.*;

public class ProblemSolving {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int howMany = input.nextInt();
		int[] intArray = new int[howMany];
		for (int i = 0; i <= howMany - 1; i++) {
			intArray[i] = input.nextInt();
		}
		for (int j = 0; j <= intArray.length - 1; j++) {
			int[] result = null;
			if (intArray[j] > 2) {
				result = new int[intArray[j] - 2];
				for (int k = 2; k < intArray[j]; k++) {
					result[k - 2] = intArray[j] % k;
				}
				if (Arrays.stream(result).anyMatch(i -> i == 0)) {
					System.out.print("");
				} else {
					System.out.print(intArray[j] + " ");
				}
			}
		}
	}
}
