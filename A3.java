import java.util.Scanner;

public class A3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int i, j;

		for (i = 0; i < N; i++) {
			for (j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
