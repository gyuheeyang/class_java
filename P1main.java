import java.util.Scanner;

public class P1main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duplicate dulpicate = new Duplicate();

		while (true) {
			float[] array1 = dulpicate.getNumber1();
			float[] array2 = dulpicate.getNumber2();

			dulpicate.getDuplicate(array1, array2);
		}
	}

}
