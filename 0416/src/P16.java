
public class P16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������ ���� 2�� ����
		int kopo24_iA, kopo24_iB;
		// 0���� �� �ʱ�ȭ
		kopo24_iA = 0;
		//��ø while�� ������ while�� �ȿ� while���� �����Ѵ�
		while (true) {
			// kopo24_iB�� �ٱ� while���� �ѹ��� �������� �ʱ�ȭ �ȴ�
			kopo24_iB = 0;
			while (true) {
				// ���� �ݺ����� �ѹ� �� ������ �� 1���� ��´�
				System.out.printf("*");
				// kopo24_iA���� kopo24_iB�� ���� ������ break�� while���� �������´�
				// ex) kopo24_iA =3 �̰� kopo24_iB=3�̶�� A3 B1/A3 B2/A3 B3 �̷������� A�� ����ŭ ���� �ǹǷ�
				// ���ﰢ���� ���°� ���´�
				if (kopo24_iA == kopo24_iB) {
					break;
				}
				//kopo24_iB�� while���� �� �� �� ������ 1�� �����Ѵ�
				kopo24_iB++;
//						line 26~ 27ó�� sysout�� ���� �ݺ��� ���ذ� ���� 
//						System.out.print("A" +kopo24_iA);
//						System.out.print("B" +kopo24_iB);
			}
			// �ٹٲٱ�
			System.out.printf("\n");
			// kopo24_i���� �������� ��ȭ���� ����
			kopo24_iA++;
			// ������ kopo24_i���� 30�� �Ǹ� break�Ǿ� while���� Ż���Ѵ� ��,�� ���η� 30
			if (kopo24_iA == 30) {
				break;
			}
		}
	}

}
