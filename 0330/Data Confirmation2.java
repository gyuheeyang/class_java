package gyuhee;

import java.util.Scanner;

public class P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input id");
		String id = scanner.next();

		System.out.println("Input password");
		System.out.println("Password has to be an email adress and can't contain id.");
		String password = scanner.next();

		int passwordLength = password.length();

		// 5글자 이상, 50글자 이하, id 포함 금지, . 포함, @ 포함 -> 이메일 형식
		if (passwordLength > 5 && passwordLength < 50 && password.contains(".") && (!password.contains(id))
				&& password.contains("@")) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
	}
}
