
public class P27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// sin �׷��� �׸���
		//360�� : 2�� = 1��: x 
		
		//�Ǽ��� (double) kopo24_fSin�� ����
		double kopo24_fSin;
		//�ݺ��� kopo24_i�� 0�̰� 360 �̸��̸� 1�� Ŀ���� (360�� �ݺ�)
		//0���� 360���� kopo24_fSin �� Ȯ���ϱ� ���� 
		for (int kopo24_i = 0; kopo24_i < 360; kopo24_i++) {
			//Math.sin �Լ��� ��ȣ �� double���� ������ �޴´�.  �̶� ������ ������ �����̿��� �Ѵ�. 
			// 1 ���� : 180�� / �� 
			kopo24_fSin = Math.sin(kopo24_i * 3.141592 / 180);
			//��� (sin �Լ��� -1 ~ 1���� ���´�)
			System.out.printf("%d sin ==>  %f\n", kopo24_i, kopo24_fSin);
		}
		
		//0���� 360���� kopo24_fSin �Լ� �׷����� �׸��� ���� ���� for�� ��� (��ĭ ���)
		for (int kopo24_i = 0; kopo24_i < 360; kopo24_i++) {
			kopo24_fSin = Math.sin(kopo24_i * 3.141592 / 180);
			//������ (int) kopo24_iSpace�� (1.0 - kopo24_fSin)���� 50�� ���� ���� (int)�� ����ȯ�� ���̴� 
			//kopo24_fSin�� �Ǽ��� (double)�̱� ������ ��Ģ ���� �� 1.0�� ���� ���� ���� �������
			int kopo24_iSpace = (int) ((1.0 - kopo24_fSin) * 50);
			//��ĭ ����� ���� �ݺ��� kopo24_j�� 0�̸� kopo24_iSpace ���� �۰� 1�� Ŀ����
			for (int kopo24_j = 0; kopo24_j < kopo24_iSpace; kopo24_j++) {
				System.out.printf(" ");
			}
			//kopo24_fSin�� kopo24_iSpace�� ��� 
			System.out.printf("*[%f][%d]\n", kopo24_fSin, kopo24_iSpace);
		}
	}

}
