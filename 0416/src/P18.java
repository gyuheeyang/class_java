
public class P18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������ �־� �� (ã��)

		// ������ (int) kopo24_iVal�� ����
		int kopo24_iVal;
		// ���ǹ� 0���� 300���� ���� ������ 1�� �����ϰڴ� => 300�� �ݺ�
		for (int kopo24_i = 0; kopo24_i < 300; kopo24_i++) {
			// kopo24_iVal�� kopo24_i�� 5�� ���� ��(5�� ���)�̴� => kopo24_iVal�� 5 * 1, 5 * 2, 5 *3
			// ...
			// kopo24_i�� �ݺ��� ������ 1�� �����ϹǷ�!
			kopo24_iVal = 5 * kopo24_i;
			// ���ǹ� kopo24_iVal�� 0���� ũ�ų� ���� (!!&&-> AND�̴� OR �ƴ�!!) kopo24_iVal�� 10���� ������
			// ��, ���� �ڸ� �� �� �� (1 ~ 9)
			if (kopo24_iVal >= 0 && kopo24_iVal < 10) {
				System.out.printf("�� %d\n", kopo24_iVal); // �� �ش� kopo24_iVal�� ���
			} else if (kopo24_iVal >= 10 && kopo24_iVal < 100) { // kopo24_iVal�� 10���� ũ�ų� ���� (!!&&-> AND�̴�!!)
																	// kopo24_iVal�� 100���� ������
																	// ��, ���� �ڸ��� �� �� (10 ~ 99)
				System.out.printf("�� %d\n", kopo24_iVal); // �� �ش� kopo24_iVal�� ���
			} else if (kopo24_iVal >= 100 && kopo24_iVal < 1000) { // kopo24_iVal�� 100���� ũ�ų� ���� (!!&&-> AND�̴�!!)
																	// kopo24_iVal�� 1000���� ������
																	// ��, ���� �ڸ��� �� �� (100 ~ 999)
				System.out.printf("�� %d\n", kopo24_iVal); // �� �ش� kopo24_iVal�� ���
			} else { // ���� ���� ��ο� �ش����� �ʴ´ٸ�
				System.out.printf("õ %d\n", kopo24_iVal); // õ �ش� kopo24_iVal�� ���
			}
		}
		// �� �� �ڵ��� ������� 0���� 300������ ���ڿ� 5�� ���� ���� �� �ڸ��� ���� ǥ�õǾ� ��µȴ�
	}

}
