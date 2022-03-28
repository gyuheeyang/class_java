import java.util.Scanner;

public class A5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int i;
		int j;
		int k;
		for (i = N; i > 0; i--) {
			for (j = N - i; j > 0; j--) {
				System.out.print(" "); // for black space
			}
			for (k = i * 2 - 1; k > 0; k--) {
				System.out.print("*"); // for *
			}
			System.out.println();
		}
	}
}
