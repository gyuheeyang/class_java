
public class P25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���� ���� (���� ���� ��ŭ ��ĭ " "�� ���)
		//�ٱ� �ݺ��� (k24_i)�� �ѹ� �� �� ���� �ݺ��� (k24_j)�� k24_i�� ����
		//k24_i�� 0�̸� ��ĭ 0�� ��� , k24_i�� 1�̸� ��ĭ 1�� ��� ... 
		
		//�ݺ��� k24_i�� 0�������� 10 �̸� ���� 1�� �����Ѵ�
		for (int k24_i =0; k24_i < 10; k24_i++) {
			//k24_j�� 0�������� k24_i �̸� ���� 1�� �����Ѵ� 
			for (int k24_j =0; k24_j < k24_i; k24_j++) {
				//��ĭ ���
				System.out.print(" ");
			}
			//k24_i�� ����Ѵ�
			System.out.printf("%d\n", k24_i);
		}
	}

}
