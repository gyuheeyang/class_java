package Java0331;

import java.util.Scanner;

public class A3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		getNumber();
		int firstNum = scanner.nextInt();
		multiTable(firstNum, 2);
	}

	public static void getNumber() {
		System.out.println("Input number");
	}

	public static void multiTable(int firstNum, int i) {
		if (i > 9) {
			return;
		}
		System.out.println(firstNum + " x " + i + " = " + firstNum * i);
		multiTable(firstNum, i + 1);
	}
}
