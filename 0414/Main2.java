
public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//#2. �����ϱ�, �ձ��ϱ� 
		
		//������ ���� ���� 
		int kopo24_sum;
		//���� �ʱ�ȭ
		kopo24_sum = 0;
		
		//�ݺ����� ���� 1���� 100���� ���� ������ ����
		for (int i = 1; i < 101; i++) {
			kopo24_sum = kopo24_sum + i;
		}
		
		//����� ���
		System.out.printf("#2 : %d\n", kopo24_sum);
		//���� ��������� 100�� ���� �� ���
		System.out.printf("#2-2 : %d\n", kopo24_sum/100);
		
		//������ �迭 ����
		int [] kopo24_v = {1,2,3,4,5};
		//������ ���� ����
		int kopo24_vSum ;
		//���� �ʱ�ȭ
		kopo24_vSum = 0;
		
		//�ݺ����� ���� kopo23_v�迭�� 0���� 5 index�� ���� ���Ѵ�
		for (int i =0; i < 5; i++) {
			kopo24_vSum = kopo24_vSum +kopo24_v[i];
		}
		
		//kopo24_vSum�� ���� ���
		System.out.printf("#2-3 : %d\n" , kopo24_vSum);
	}

}
