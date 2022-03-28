import java.util.Scanner;

public class A7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		int max;
		int LCM = 0; // Least Common Multiple

		if (N >= M) {
			max = N;
		} else {
			max = M;
		}

		for (int i = max; i >= max; i++) {
			if (i % N == 0 && i % M == 0) {
				LCM = i;
				break;
			}
		}
		System.out.println(LCM);
	}
}
