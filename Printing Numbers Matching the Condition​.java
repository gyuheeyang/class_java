package Package;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class A2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number = { 123, 32, 356, 53, 2, 67, 31, 78, 41, 9, 29 };

		String[] numberStr = new String[number.length];
		for (int i = 0; i < number.length; i++) {
			numberStr[i] = String.valueOf(number[i]);
		}

		System.out.println(Arrays.toString(numberStr));

		Scanner scanner = new Scanner(System.in);
		System.out.println("Input number");
		// int inputNum = scanner.nextInt();
		String inputNum = scanner.next();

		for (int i = 0; i < numberStr.length; i++) {
			if (numberStr[i].contains(inputNum)) {
				System.out.print(numberStr[i] + " ");
			}
		}

	}

}
