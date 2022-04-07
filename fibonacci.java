import java.util.ArrayList;
import java.util.Scanner;

public class fibonacci {

	public static int getNumber() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input number");
		int number = scanner.nextInt();
		return number;
	}

	public static void printFibo(int number) {
		ArrayList<Integer> fibonacci = new ArrayList<Integer>();
		int first = 0, second = 1;
		fibonacci.add(first);
		fibonacci.add(second);
		int fibNumber = 0;
		for (int i = 2; i < number; i++) {
			fibonacci.add(fibonacci.get(i - 1) + fibonacci.get(i - 2));
		}
		System.out.println(fibonacci);
	}
}
