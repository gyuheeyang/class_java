
public class P22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Array �̿� ��
		// ������ �� (���� �ָ���)�� �迭�� �̿��� �� ����
		
		//int (������) �迭 ����
		//�迭�� 0���� �����Ѵ� �� 1��: k24_iLMD[0] = 31 , 2��: k24_iLMD[1] = 28, 3��: k24_iLMD[2] = 31 ...
		int[] k24_iLMD = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		// �ݺ��� k24_i(month)�� 1�������� �����ؼ� 13�̸����� 1�� �����ϴ� �ݺ���
		// �ݺ��� �ȿ� �ݺ����� �ִ� ��ø �ݺ���
		for (int k24_i = 1; k24_i < 13; k24_i++) {
			// k24_i (month)�� ���
			System.out.printf("%d�� =>", k24_i);
			// �ݺ��� k24_j(date)�� 1���� ���� 32 �̸����� 1�� �����Ѵ�
			for (int k24_j = 1; k24_j < 32; k24_j++) {
				// k24_j (date)�� ���
				System.out.printf("%d", k24_j);
				//���ǹ� k24_iLMD �迭�� k24_i -1 ��°(�迭 0���� ����) �ε��� ���� k24_j(date)�� ���ٸ� break�� �ݺ��� Ż��
				if (k24_iLMD[k24_i - 1] == k24_j)
					break;
				//������ ������ , ����� break �ؿ� ��ġ 
				System.out.printf(",");
			}
			//�ٹٲ�
			System.out.println();
		}
	}

}
