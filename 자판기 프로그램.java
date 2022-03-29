import java.util.Scanner;

import javax.naming.AuthenticationException;

public class VendingMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("#Menu");
		System.out.println("1.Coke - 340");
		System.out.println("2.Orange - 500");
		System.out.println("3.Milk - 650");
		System.out.println("4.Water - 290");
		System.out.println("5.Coffe - 170");
		System.out.println("-->");

		Scanner scanner = new Scanner(System.in);
		int drink = scanner.nextInt();
		int price = 0;
		int change;
		int change1;
		switch (drink) {
		case 1:
			price = 340;
			break;
		case 2:
			price = 500;
			break;
		case 3:
			price = 650;
			break;
		case 4:
			price = 290;
			break;
		case 5:
			price = 170;
			break;
		default:
			System.out.println("Error");
			break;
		}

		if (drink < 6) {
			change1 = 1000 - price;
			change = 1000 - price;
			int change_100 = change / 100;
			change %= 100;
			int change_50 = change / 50;
			change %= 50;
			int change_10 = change / 10;
			System.out.println("The change is " + change1 + " (100 x" + change_100 + ", 50 x" + change_50 + ", 10 x "
					+ change_10 + ")");
		}

	}
}
