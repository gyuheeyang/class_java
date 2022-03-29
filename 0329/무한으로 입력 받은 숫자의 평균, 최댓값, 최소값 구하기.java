package gyuhee;

import java.util.Scanner;

public class A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int count = 1, max = 0, min = 0, mean = 0;
		float sum = 0; //평균값 소수점 
		while (true) { // 무한반복
			System.out.println("Input number"); // input number 입력 받음
			int inputNumber = scanner.nextInt();

			sum += inputNumber; // mean 값 구하기 위해
			if (count == 1) {
				max = inputNumber;
				min = inputNumber;
			} else {
				if (inputNumber > max) {
					max = inputNumber;
				}
				if (inputNumber < min) {
					min = inputNumber;
				}

			}
			System.out.println("Result: " + count + " - Mean " + sum / count + ", Max " + max + ", Min " + min);

			count++;
		}
	}
}
