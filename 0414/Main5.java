
public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
