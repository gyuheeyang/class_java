package gyuhee;

import java.util.Scanner;

public class P5555 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input id");
		String id = scanner.next();
		
		System.out.println("Input password");
		String password = scanner.next();
		
		int passwordLength = password.length();
		
		if (passwordLength >5 && passwordLength <50 && password.contains(".") 
				&& password.contains(id) && password.contains("@")){
			System.out.println("PASS");
		}else {
			System.out.println("FAIL");
		}
		
	}

}
