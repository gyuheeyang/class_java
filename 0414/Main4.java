
public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//#4 ���ϴ� �ڸ��� �ݿø�, ���� ó��
		
		//12345���� 10�� ���� ������ ó���ϱ�
		int kopo24_ii = 12345;	
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
	}

}
