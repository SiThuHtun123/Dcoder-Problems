import java.util.*;

public class ProblemSolving {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int howMany = input.nextInt();
		String[] result;
		String keeping = "";
		String[] testCases = new String[howMany];
		for (int i = 0; i <= howMany - 1; i++) {
			int series = input.nextInt();
			int[] secondTest = new int[series];
			input.nextLine();
			String sortNumbers = input.nextLine();
			String[] stringArray = sortNumbers.split(" ");
			for (int j = 0; j <= secondTest.length - 1; j++) {
				secondTest[j] = Integer.parseInt(stringArray[j]);
			}
			Arrays.sort(secondTest);
			for (int k = 1; k <= secondTest.length; k++) {
				keeping += secondTest[secondTest.length - k];
			}
			keeping += " ";
		}
		result = keeping.split(" ");
		for (int l = 0; l <= howMany - 1; l++) {
			System.out.println(result[l]);
		}
	}
}
