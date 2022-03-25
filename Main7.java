package gyuhee;

import java.util.Scanner;

public class Main7 {

	public static void main(String[] args) {
		System.out.println("Input yout score");
		Scanner scanner=new Scanner(System.in);
		int score = scanner.nextInt();
		
		String grade="";
		switch(score/10) {
		case 10:
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "c";
			break;
		case 6:
			grade = "D";
			break;
		case 5,4,3,2,1,0:
			grade = "F";
			break;
		}
		System.out.println("Your score: "+grade);
	}
}
