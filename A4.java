import java.util.Scanner;

public class A4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int i;
		int j;
		int k;
		for (i = 0; i < N; i++) {
			for (j = 1; j < N - i; j++) {
				System.out.print(" "); // for black space
			}
			for (k = 0; k < i * 2 + 1; k++) {
				System.out.print("*"); // for *
			}
			System.out.println();
		}
	}
}
