package gyuhee;

public class starplease {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int random = 0;
		// random = (int)(Math.random() * 9); //������

		for (int i = 1; i < 6; i++) {
			// int random =0;
			random = (int) (Math.random() * 9); // ������
			System.out.print(random + "*");
			if (i % 2 != 0) { // Ȧ��
				for (int j = 1; j < random + 1; j++) {
					System.out.print("*"); // �� ���
				}
				for (int k = 1; k < 9 - random; k++) {
					System.out.print(" ");
				}
				System.out.println("*"); // �� �ٲٱ�
			} else { // ¦��
				for (int �� = 1; �� < 9 - random; ��++) {
					System.out.print(" "); // ���� ���
				}
				for (int m = 1; m < random + 1; m++) {
					System.out.print("*"); // �����
				}
				System.out.println("*");
			}
		}
	}
}
