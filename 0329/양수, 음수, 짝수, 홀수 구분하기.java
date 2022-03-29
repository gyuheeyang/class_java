package gyuhee;

import java.util.Scanner;

public class A2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int positive = 0, negative = 0, odd = 0, even = 0;
		while (true) {
			System.out.println("Input number"); 
			int inputNumber = scanner.nextInt();
			if (inputNumber == 0) { // input이 0일 때
				System.out.println("Error");
				break;
			} else if (inputNumber > 0) { // input이 양수일 때
				positive++;
				if (inputNumber % 2 == 0) {
					even++;
				} else {
					odd++;
				}
			} else { // input이 음수일 때
				negative++;
				inputNumber = inputNumber * -1;
				if (inputNumber % 2 == 0) {
					even++;
				} else {
					odd++;
				}
			}
			System.out.println("P - " + positive + ", N - " + negative + ", O - " + odd + ", E - " + even);
		}
	}
}
