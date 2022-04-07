import java.util.Scanner;


public class A3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		while (true) {
			int rps = inputRps();
			rpsResult(rps);
			int randomNumber = comRps();
			rpsResult(randomNumber);
			System.out.println();
			winOrLose(rps, randomNumber);
		}

	}

	public static void rpsResult(int zeroOneTwo) { // print
		if (zeroOneTwo == 0) {
			System.out.print("Rock  ");
		} else if (zeroOneTwo == 1) {
			System.out.print("paper  ");
		} else {
			System.out.print("Scissor  ");
		}
	}

	public static int comRps() {
		int randomNumber = (int) (Math.random() * 3);
		return randomNumber;
	}

	public static int inputRps() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input a number (0: Rock, 1 : Paper, 2 : Scissor)");
		int rps = scanner.nextInt(); // rps 입력 받기
		if (rps > 2) {
			System.out.println("You can input only (0: Rock, 1 : Paper, 2 : Scissor)");
		}
		return rps;
	}

	public static void winOrLose(int rps, int randomNumber) {
		if (rps == randomNumber) {
			System.out.println("Draw!");
		} else if (rps == 0 && randomNumber == 1 || rps == 1 && randomNumber == 2 || rps == 2 && randomNumber == 0) {
			System.out.println("Lose!");
		} else if (rps == 0 && randomNumber == 2 || rps == 1 && randomNumber == 0 || rps == 2 && randomNumber == 1) {
			System.out.println("Win!");
		} else {
			System.out.println("Error");
		}
	}
}
