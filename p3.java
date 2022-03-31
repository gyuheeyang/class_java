package java0331;

import java.util.Scanner;

public class p3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("#Printing a Name");
		System.out.println("1. Father");
		System.out.println("2. Mother");
		System.out.println("3. son");
		System.out.println("4. Daughter");
		System.out.println("-->");

		int num = scanner.nextInt();

		if (num == 1) {
			System.out.println("Jacop");
		} else if (num == 2) {
			System.out.println("Olivia");
		} else if (num == 3) {
			System.out.println("Henry");
		} else if (num == 4) {
			System.out.println("Emma");
		} else {
			System.out.println("Error");
		}

	}

}
