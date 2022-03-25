package gyuhee;

import java.util.Scanner;

public class Main6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("Input the 1st number!");
		num1 = scanner.nextInt();
		
		System.out.println("Input the 2nd number!");
		num2 = scanner.nextInt();
		
		System.out.printf("Result: %d + %d = %d", num1, num2, num1 +num2);
		
	}

}
