
public class P23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���� �б� (������ �ִ� ��, ���� �ڸ��� )
		
		// kopo24_units�� ���ڿ� �迭���� ���� �д� ����� �����ϰ� �ִ�
		// ex)kopo24_units[0]�� "��" , kopo24_units[1]�� "��" ...
		String[] kopo24_units = { "��", "��", "��", "��", "��", "��", "��", "ĥ", "��", "��" };
		// �ݺ������� 0�������� 100���� 100�� �ݺ�
		for (int kopo24_i = 0; kopo24_i < 101; kopo24_i++) {
			// ���� kopo24_i�� 0���� ũ�ų� �۰� 10���� ���� �� => �� ���� �ڸ��� ��
			if (kopo24_i >= 0 && kopo24_i < 10) {
				// kopo24_units �迭�� kopo24_i��° �ε����� ���� ����Ѵ�
				// kopo24_i[0] = "��",  kopo24_i[1] = "��",  kopo24_i[2] = "��" ....
				System.out.printf("���� �ڸ�: %s\n", kopo24_units[kopo24_i]);
			// ���� kopo24_i�� 10���� ũ�ų� �۰� 100���� ���� �� => �� ���� �ڸ��� ��	
			} else if (kopo24_i >= 10 && kopo24_i < 100) {
				//int ������ kopo24_i10, kopo24_i0�� ���� 
				int kopo24_i10, kopo24_i0;
				//kopo24_i10�� kopo24_i�� 10���� ���� ������ ���� �ڸ� ���� �޴´�
				kopo24_i10 = kopo24_i / 10; // ���� �ڸ�
				//kopo24_i0�� kopo24_i�� 10���� ���� �������� ���� �ڸ� ���� �޴´�
				kopo24_i0 = kopo24_i % 10; // ���� �ڸ�
				//���ǹ� kopo24_i0�� 0�̸� ���� �ڸ��� ���� ������ ���� �ڸ��� ���
				if (kopo24_i0 == 0) {
					System.out.printf("���� �ڸ� : %s��\n", kopo24_units[kopo24_i10]);
				} else {	//kopo24_i0�� 0�� �ƴϸ� ���� �ڸ��� �ֱ� ������ ���� �ڸ� ���� �ڸ� ��� ��� 
					System.out.printf("���� �ڸ� : %s��%s\n", kopo24_units[kopo24_i10], kopo24_units[kopo24_i0]);

				}
			//line 14�� 19 ���ǿ� ��� ���� �ʴ� ��� (���ǹ� if, else if, else) 
			// => ���ǹ� line 12���� kopo24_i�� 0�������� 100���� 1�� Ŀ���Ƿ� else�� �ش��ϴ� ���� 100�̴�
			} else {
				//kopo24_i = 100 , ���
				System.out.printf("==> %d\n", kopo24_i);
			}
		}
		
	}

}
