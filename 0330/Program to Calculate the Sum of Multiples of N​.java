package gyuhee;

import java.util.Scanner;

public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 반복문
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input number 1");
		int num1 = scanner.nextInt();
		System.out.println("Input number 2");
		int num2 = scanner.nextInt();
		int i = 0;
		int sum = 0;
		if (num2 > num1) {
			System.out.println("Please input correct number");
		} else { // num1이 num2보다 무조건 크거나 같은 상황
			if (num1 % num2 != 0) {
				System.out.println("Please input correct number");
			} else {
				for (i = num2; i <= num1; i++) {
					if (i % num2 == 0) {
						sum += i;
						System.out.print(i + " ");
					}
				}
				System.out.print("SUM: " + sum);
			}
		}
	}
}
