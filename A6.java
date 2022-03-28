import java.util.Scanner;

public class A6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		for (int i = 1; i < N ; i++) {
			if (N % i == 0) {
				System.out.println(i);
			}
		}
	}
}
