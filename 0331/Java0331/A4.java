package Java0331;

import java.util.Scanner;

public class A4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		getNumber();
		int n = scanner.nextInt();
		for (int j = 0; j < n; j++) {
			System.out.print(fibonacci(j) + " ");
		}
	}

	public static void getNumber() {
		System.out.println("Input number");
	}

	public static int fibonacci(int i) {
		if (i == 0) {
			return 0;
		} else if (i == 1 || i == 2) {
			return 1;
		} else {
			return fibonacci(i - 1) + fibonacci(i - 2);
		}
	}
}
