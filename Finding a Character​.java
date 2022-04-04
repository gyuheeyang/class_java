package Package;

import java.util.Scanner;

public class A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 입력 받기
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input text");
		String text = scanner.nextLine();
		System.out.println("Input a character");
		char pickedChar = scanner.next().charAt(0);// char로 입력 받을 수 없음

		// string to charArr
		char[] textArr = text.toCharArray();
		for (int i = 0; i < textArr.length; i++) {
			if (textArr[i] == pickedChar) {
				System.out.println(i + 1);
				break;
			}
		}
		
	}
}
