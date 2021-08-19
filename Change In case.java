package Learning;
import java.util.*;

class ProblemSolving {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int howMany = input.nextInt();

		input.nextLine();
		StringBuilder string = new StringBuilder(input.nextLine());

		String swapIndex = input.nextLine();
		String[] swapIndexArray = swapIndex.split(" ");

		char firstCharIndex = string.charAt(Integer.parseInt(swapIndexArray[1]));
		char secondCharIndex = string.charAt(Integer.parseInt(swapIndexArray[0]));

		string.deleteCharAt(Integer.parseInt(swapIndexArray[0]));
		string.insert(Integer.parseInt(swapIndexArray[0]), firstCharIndex);

		string.deleteCharAt(Integer.parseInt(swapIndexArray[1]));
		string.insert(Integer.parseInt(swapIndexArray[1]), secondCharIndex);
		
		System.out.println(string);

	}
}














