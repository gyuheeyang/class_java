package gyuhee;

import java.util.Scanner;

public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 암호화 알고리즘 암호화 해석 조건문
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("#Menu");
			System.out.println("1. Encryption");
			System.out.println("2. Decryption");
			System.out.println("->");
			int choise = scanner.nextInt(); // 암호화, 복호화 중 선택
			System.out.println("Input text");
			String text = scanner.next();
			char[] textArr = text.toCharArray(); // string to char

			int key = 6;

			if (choise > 2) {
				System.out.println("Error");
				break;
			} else if (choise == 1) { // 암호화
				for (char c : textArr) {
					c += key;
					System.out.print(c);
				}
			} else { // 복호화
				for (char c : textArr) {
					c -= key;
					System.out.print(c);
				}
			}
			System.out.println();
		}
	}
}
