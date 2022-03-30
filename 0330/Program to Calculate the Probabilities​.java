package gyuhee;

import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input number of dice");
		int dice = scanner.nextInt();
		System.out.println("Input sum");
		int sum = scanner.nextInt();
		
		for (int i =1; i<7 ; i++) {
			for (int j =1; j<7; j++) {
				if (i+j == sum) {
					System.out.println(i + ","+ j );
				}
			}
		}
		
		
		
	}

}
