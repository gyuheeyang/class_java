
public class P21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// case�� �� (Switch,case�� �������� ���� ���, ���� break������ ���������� ���)
		
		// �ݺ��� k24_i(month)�� 1�������� �����ؼ� 13�̸����� 1�� �����ϴ� �ݺ���
		// �ݺ��� �ȿ� �ݺ����� �ִ� ��ø �ݺ���
		for (int k24_i = 1; k24_i < 13; k24_i++) {
			// k24_i (month)�� ���
			System.out.printf("%d�� => ", k24_i);
			// LOOP�� k24_j(date)�� 1���� ���� 32 �̸����� 1�� �����ϴ� �ݺ��� 
			LOOP: for (int k24_j = 1; k24_j < 32; k24_j++) {
				// k24_j (date)�� ���
				System.out.printf("%d,", k24_j);
				//switch/case ���� if ���� ��������� �� �� ����ȭ�� ���� �Ǵܹ��̴�
				//�Է� ���� k24_i�� 4�� �� , 6�� ��, 7�� ��, 9�� ��, 11�� �� -> line 26���� �̵�
				switch (k24_i) {
				case 4:
				case 6:
				case 7:
				case 9:
				case 11:
					//k24_j (date)�� 30�̶��
					if (k24_j == 30)
						//LOOP �ݺ����� Ż�� (�̷� ǥ���� ���� ������� ����)
						//LOOP��� ǥ���� �ݵ�� �ʿ��ϴ� 
						break LOOP;
					//�ݺ����� Ż��
					break;
				//�Է� ���� k24_i�� 2�� �� -> line 35���� �̵�
				case 2:
					//k24_j (date)�� 28�̶��
					if (k24_j == 28)
						//LOOP �ݺ����� Ż�� (�̷� ǥ���� ���� ������� ����)
						//LOOP��� ǥ���� �ݵ�� �ʿ��ϴ� 
						break LOOP;
					//�ݺ����� Ż��
					break;
				}

			}
			//�� �ٲ� 
			System.out.println();
		}
	}

}
