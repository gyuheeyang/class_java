package gyuhee;

public class starplease {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int random = 0;
		// random = (int)(Math.random() * 9); //·£´ý°ª

		for (int i = 1; i < 6; i++) {
			// int random =0;
			random = (int) (Math.random() * 9); // ·£´ý°ª
			System.out.print(random + "*");
			if (i % 2 != 0) { // È¦¼ö
				for (int j = 1; j < random + 1; j++) {
					System.out.print("*"); // º° Âï±â
				}
				for (int k = 1; k < 9 - random; k++) {
					System.out.print(" ");
				}
				System.out.println("*"); // ÁÙ ¹Ù²Ù±â
			} else { // Â¦¼ö
				for (int ¤Ó = 1; ¤Ó < 9 - random; ¤Ó++) {
					System.out.print(" "); // °ø¹é Âï±â
				}
				for (int m = 1; m < random + 1; m++) {
					System.out.print("*"); // º°Âï±â
				}
				System.out.println("*");
			}
		}
	}
}
