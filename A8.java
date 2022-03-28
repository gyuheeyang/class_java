import java.util.Scanner;

public class A8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		int min = 0;
		int GCD = 0; // Greatest Common Divisor
		if (N <= M) {
			min = N;
		} else {
			min = M;
		}

		for (int i = 1; i < min + 1; i++) {
			if (N % i == 0 && M % i == 0) {
				GCD = i;
			}
		}
		System.out.println(GCD);
	}
}
