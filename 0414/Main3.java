
public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//#3 ������ ������ �������� ���� �������� ����ó��, �ø�ó�� 
		
		//kopo24_ii�� �������̱� ������ 1000�� 3���� ���� 333.33333...�� ������ ����
		int kopo24_ii = 1000/3;
		//kopo24_ii ���
		System.out.printf("#3-1 : %d\n", kopo24_ii);
		
		//1000dmf 3���� ���� ������ ���� ���Ѵ�
		kopo24_ii = 1000%3;
		//kopo24_ii ���
		System.out.printf("#3-2 : %d\n", kopo24_ii);
		
		//�ݺ����� ���� 0���� 19���� �ݺ�
		for (int i =0; i < 20; i++) {
			//0���� 19���� �ϳ��� ���
			System.out.printf("#3-3 : %d  ", i);
			//1���� 1�� ������ ���� 5�� ���� �������� 0�̸� �����ٷ� �Ѿ��
			if (((i + 1) % 5) == 0){
				System.out.printf("\n");
			}
		}
		
	}

}
