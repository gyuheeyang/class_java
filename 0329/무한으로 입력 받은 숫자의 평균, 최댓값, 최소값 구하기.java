package gyuhee;

import java.util.Scanner;

public class A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int count = 1, max = 0, min = 0, mean = 0;
		float sum = 0; //��հ� �Ҽ��� 
		while (true) { // ���ѹݺ�
			System.out.println("Input number"); // input number �Է� ����
			int inputNumber = scanner.nextInt();

			sum += inputNumber; // mean �� ���ϱ� ����
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
