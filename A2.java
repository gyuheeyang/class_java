import java.util.Scanner;

public class A2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 2;
		int count = 0;
		while (i < 10) {
			int j = 2;
			while (j < 10) {
				switch (count) {
				case 0:
					System.out.println(i + "x" + j + "=" + i * j);
					j++;
					break;
				}
			}
			i++;
		}
		
	}
}
