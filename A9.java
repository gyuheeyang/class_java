import java.util.Scanner;

public class A9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();

		for (int i = 2; i <= N; i++) {
			for (int j = 2; j <= i; j++) {
				if (i != j && i % j == 0)
					break;
				if (i == j) {
					System.out.println(i);
				}
			}
		}

	}
}
