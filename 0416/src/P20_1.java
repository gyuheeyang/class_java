
public class P20_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������ �� 3 (������ �� 1�� �ٸ� ������ § �ڵ�)
		
		// �ݺ��� kopo24_i(month)�� 1�������� �����ؼ� 13�̸����� 1�� �����ϴ� �ݺ���
		// �ݺ��� �ȿ� �ݺ����� �ִ� ��ø �ݺ���
		for (int kopo24_i = 1; kopo24_i < 13; kopo24_i++) {
			// kopo24_i (month)�� ���
			System.out.printf("%d�� = >", kopo24_i);
			// �ݺ��� kopo24_j(date)�� 1���� ���� 32 �̸����� 1�� �����Ѵ�
			for (int kopo24_j = 1; kopo24_j < 32; kopo24_j++) {
				// kopo24_j (date)�� ���
				System.out.printf("%d,", kopo24_j);
				// ���ǹ� kopo24_i(month)�� 4 or 6 or 7 or 11 �̸鼭 (AND) kopo24_j (date)�� 30�̸� break�� �ݺ��� Ż��
				// (4, 6, 7, 11���� 30�ϱ����� ����)
				// || �� OR && �� AND�̴�
				if ((kopo24_i == 4 || kopo24_i == 6 || kopo24_i == 9 || kopo24_i == 11) && (kopo24_j == 30)) {
					break;
				}
				// ���ǹ� kopo24_i(month)�� 2�̸鼭 (AND) kopo24_j (date)�� 28�̸� break�� �ݺ��� Ż��
				//(2���� 28�ϱ����� ����)
				if (kopo24_i == 2 && kopo24_j == 28) {
					break;
				}
			}
			System.out.printf("\n");
		}
	}

}
