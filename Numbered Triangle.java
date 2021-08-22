import java.util.*;

public class ProblemSolving {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		
		for (int i=1; i<=number; i++) {
			for (int j=1; j<=number; j++) {
				if (j <= i) {
					System.out.print( (j==i) ? j : j+" " );
				}
			}
			System.out.println();
		}
	}
}
