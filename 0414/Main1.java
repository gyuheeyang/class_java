
public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//#1 
		
		//������ ���� kopo24_ii�� �����Ѵ�
		int kopo24_ii;
		//kopo24_ii �� 1 + 2
		kopo24_ii = 1 + 2;
		//kopo24_ii �� ����Ѵ� 
		System.out.printf("#1-1 : %d\n", kopo24_ii);
		
		//kopo24_ii�� 1 + 2 * 3�̴�
		kopo24_ii = 1 + 2 * 3;
		//kopo24_ii ���
		System.out.printf("#1-2 : %d\n", kopo24_ii);
		
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
		
		
		//#3 ������ ������ �������� ���� �������� ����ó��, �ø�ó�� 
		
		//kopo24_ii�� �������̱� ������ 1000�� 3���� ���� 333.33333...�� ������ ����
		kopo24_ii = 1000/3;
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
			//i�� 0���� �����ϱ� ������ 1�� ���Ѵ� (line 64)
			if (((i + 1) % 5) == 0){
				System.out.printf("\n");
			}
		}
		
		//#4 ���ϴ� �ڸ��� �ݿø�, ���� ó��
		
		//12345���� 10�� ���� ������ ó���ϱ�
		kopo24_ii = 12345;	
		//12345�� 10���� ���� 1234.5�� ����� 10�� ���� 1�� �ڸ��� 5�� ������
		int kopo24_j = (kopo24_ii/10) * 10 ;	
		//�� ���
		System.out.printf( "#4-1 : %d\n", kopo24_j);

		//12345���� 10�� ���� �ݿø� ó���ϱ�
		kopo24_ii = 12345;
		//12345���� 5�� ���ϸ� 123450�� �ȴ� 1�� �ڸ����� 5���� ũ�ų� ������ 10�� �ڸ��� ���� �ٲ�� ������ �ݿø��� �����ϴ�
		kopo24_j = ((kopo24_ii + 5)/ 10)* 10;
		//���� ����Ѵ�
		System.out.printf("#4-2 : %d\n", kopo24_j);
		
		//���� �� ����
		kopo24_ii = 12345;
		kopo24_j = ((kopo24_ii+5)/ 10)* 10;
		System.out.printf("#4-2 : %d\n", kopo24_j);
		
		//#4-X 100�� ���� ���� �ø� ,  1000�� ���� ���� �ݿø��� �����϶�
		
		//100�� ���� ����
		kopo24_ii = 12345;
		kopo24_j = (kopo24_ii/ 100) * 100;
		System.out.printf("#4-X-1 : %d\n", kopo24_j);
		
		//100�� ���� �ø�
		kopo24_ii = 12345;
		kopo24_j = ((kopo24_ii + 99)/ 100) * 100;
		System.out.printf("#4-X-2 : %d\n", kopo24_j);
		
		//1000�� ���� ���� 
		kopo24_ii = 12345;
		kopo24_j = (kopo24_ii/ 1000) * 1000;
		System.out.printf("#4-X-3 : %d\n", kopo24_j);
		
		//1000�� ���� �ݿø� 
		kopo24_ii = 12345;
		kopo24_j = ((kopo24_ii+500)/ 1000)* 1000;
		System.out.printf("#4-X-4  : %d\n", kopo24_j);
	
		
		//#5.�Ҽ��� ���Ͽ����� ��� �ұ�? 
		
		int kopo24_MyVal = 14 / 5;	//�� ���� 2.8 , �Ҽ��� ���� ������ 2, �ݿø��ϸ� 3
		System.out.printf("#5-1 : %d\n", kopo24_MyVal);	//��µǴ� ���� ���� �� 2�� ���´�
		
		//�Ǽ��� ������ �����Ѵ�
		double kopo24_MyValF; 
		
		//�Ŀ��� 0.0 double ���·� ���� �ʾ��� ������ ��Ȯ�� ���� ������ �ʴ´�
		kopo24_MyValF = 14 / 5; 
		System.out.printf("#5-2 : %f\n", kopo24_MyValF);
		//double ���·� ��� �߱� ������ �Ҽ��� ������ ���´� 
		kopo24_MyValF = 14.0 / 5; 
		System.out.printf("#5-3 : %f\n", kopo24_MyValF);
		//���� ������ 0.5 �� ���� ���� ��µȴ�
		kopo24_MyValF = (14.0)/5 + 0.5;  
		System.out.printf("#5-4 : %f\n", kopo24_MyValF);
		//14.0�� int(������)�� ������ ������ 2 + 0.5 �� ���� ��µȴ� 
		kopo24_MyValF = (int)(14.0)/5 + 0.5;  
		System.out.printf("#5-5 : %f\n", kopo24_MyValF);
	}

}
