
public class P19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������ �� 1 (��� �ڵ�)
		// 1�� ~ 12�� �ش� ���� ���� ��� ���
		
		// �ݺ��� kopo24_i�� 1�̰� 13���� ������ �ݺ��� ������ 1�� Ŀ����
		// => 1 ~ 12���� �ݺ� kopo24_i�� ��(month)�� �ǹ���
		for (int kopo24_i = 1; kopo24_i < 13; kopo24_i++) {
			System.out.printf(" %d��=>", kopo24_i);
			{ // kopo24_i (��)�� ���� ���
				// �ݺ��� kopo24_j�� 1�̰� 32���� ������ �ݺ��� ������ 1�� Ŀ����
				// => 1���� 31���� �ݺ� kopo24_j�� ��(date)�� �ǹ��Ѵ�
				for (int kopo24_j = 1; kopo24_j < 32; kopo24_j++) {
					System.out.printf("%d,", kopo24_j); // kopo24_j(date)�� ���

					// ���ǹ�
					if (kopo24_i == 1 && kopo24_j == 31)
						break; // kopo24_i(month)�� 1�̶�� kopo24_j(date)�� 31�� �� break�� �ݺ��� Ż��
					if (kopo24_i == 2 && kopo24_j == 28)
						break; // kopo24_i(month)�� 2�̶�� kopo24_j(date)�� 28�� �� break�� �ݺ��� Ż��
					if (kopo24_i == 3 && kopo24_j == 31)
						break; // kopo24_i(month)�� 3�̶�� kopo24_j(date)�� 31�� �� break�� �ݺ��� Ż��
					if (kopo24_i == 4 && kopo24_j == 30)
						break; // kopo24_i(month)�� 4�̶�� kopo24_j(date)�� 30�� �� break�� �ݺ��� Ż��
					if (kopo24_i == 5 && kopo24_j == 31)
						break; // kopo24_i(month)�� 5�̶�� kopo24_j(date)�� 31�� �� break�� �ݺ��� Ż��
					if (kopo24_i == 6 && kopo24_j == 30)
						break; // kopo24_i(month)�� 6�̶�� kopo24_j(date)�� 30�� �� break�� �ݺ��� Ż��
					if (kopo24_i == 7 && kopo24_j == 31)
						break; // kopo24_i(month)�� 7�̶�� kopo24_j(date)�� 31�� �� break�� �ݺ��� Ż��
					if (kopo24_i == 8 && kopo24_j == 31)
						break; // kopo24_i(month)�� 8�̶�� kopo24_j(date)�� 31�� �� break�� �ݺ��� Ż��
					if (kopo24_i == 9 && kopo24_j == 30)
						break; // kopo24_i(month)�� 9�̶�� kopo24_j(date)�� 30�� �� break�� �ݺ��� Ż��
					if (kopo24_i == 10 && kopo24_j == 31)
						break; // kopo24_i(month)�� 10�̶�� kopo24_j(date)�� 31�� �� break�� �ݺ��� Ż��
					if (kopo24_i == 11 && kopo24_j == 30)
						break; // kopo24_i(month)�� 11�̶�� kopo24_j(date)�� 30�� �� break�� �ݺ��� Ż��
					if (kopo24_i == 12 && kopo24_j == 31)
						break; // kopo24_i(month)�� 12�̶�� kopo24_j(date)�� 31�� �� break�� �ݺ��� Ż��
				}
				System.out.printf("\n");	//�ٹٲٱ� 
			}
		}

	}

}
