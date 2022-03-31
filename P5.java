package java0331;

import java.util.Scanner;

public class P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input number");
		int num = scanner.nextInt();
		int result = 0;

		if (num > 1 && num < 10) {
			for (int i = 2; i < 10; i++) {
				result = num * i;
				System.out.println(num + " x " + i + " = " + result);
			}
		} else {
			System.out.println("Error");
		}

	}

}
