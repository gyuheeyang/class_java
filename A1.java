
public class A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = 0;

		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				result = i * j;
				if (i >1 && j>1) {
					System.out.println(i + "x" + j + "=" + result);
				}
			}
		}
	}
}
