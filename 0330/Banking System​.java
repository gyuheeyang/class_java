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

			if (choise > 2) { // ����� �� �ٸ� ���� �Է½� ����
				System.out.println("Error");
				break;
			} else if (choise == 1) { // �Ա� ���ý� balance�� �� �߰�
				balance += money;

			} else { // ��� ���ý� balance�� �� ����
				balance -= money; // Withdrawal
			}
		}
	}
}
