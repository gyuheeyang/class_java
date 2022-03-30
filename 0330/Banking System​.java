package gyuhee;

import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int balance = 0;
		int count = 0;
		while (true) {
			System.out.println("#Menu");
			System.out.println("1. Deposit");
			System.out.println("2. Withdrawal");
			System.out.println("Balance: " + balance);
			System.out.println("-->");

			int choise = scanner.nextInt();
			int money = scanner.nextInt();
			count++;

			if (choise > 2) { // 입출금 외 다른 숫자 입력시 오류
				System.out.println("Error");
				break;
			} else if (choise == 1) { // 입급 선택시 balance에 돈 추가
				balance += money;

			} else { // 출금 선택시 balance에 돈 빼기
				balance -= money; // Withdrawal
			}
		}
	}
}
