import java.util.*;

public class ProblemSolving {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int howMany = input.nextInt();
		
		input.nextLine();
		String[] stringArray = new String[howMany];
		for(int i = 0; i <= howMany - 1; i++) {
			stringArray[i] = input.nextLine();
		}
		for (int i = 0; i <= stringArray.length -1 ; i++) {
			System.out.println(stringArray[i].toUpperCase());
		}
	}
}
