package java0331;

import java.util.Scanner;

public class P6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input an equation");
		String equation = scanner.nextLine(); // 방정식 입력 받기
		double result;
	}
	
	
	
	
	
	
	
	public static double  addOperation(double a, double b) {
		double sum = a + b;
		System.out.println("add: " + sum);
		return  sum;
	}

	public static double  minOperation(double a, double b) {
		double sum = a - b;
		System.out.println("min: " + sum);
		return  sum;
	}

	public static double  mulOperation(double a, double b) {
		double sum = a * b;
		System.out.println("mul: " + sum);
		return  sum;
	}

	public static double  divOperation(double a, double b) {
		double sum =  a / b;
		if (a == 0 || b == 0) {
			System.out.println("Error");
			return  sum;	
		} else {
			System.out.println("div: " + sum);
		}
	public static char getOperation()	
		

	}

}
