package Java0331;

import java.util.Scanner;

public class A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		getNumber();
		int n = scanner.nextInt();
		getNumber();
		int r = scanner.nextInt();
		System.out.println(permutation(n) / permutation(n - r));

	}

	public static void getNumber() {
		System.out.println("Input number");
	}

	public static int permutation(int number) {
		if (number == 1) {
			System.out.println("1");
			return 1;
		} else {
			System.out.print(number + " x ");
			return number * permutation(--number);
		}
	}
}
