
public class P28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�Ƕ�̵� ��� 
		
		//������ ���� k24_n, k24_m ����
		int k24_n, k24_m;
		//k24_m �� 20�̰� k24_n �� 1�̴� 
		k24_m =20; k24_n =1;
		
		while(true) {	//���ѹݺ� ����
			//�ݺ��� k24_i�� 0�̰� k24_m���� ���� ������ 1�� ���� => " " ��ĭ ���
			for (int k24_i = 0; k24_i <k24_m; k24_i++) System.out.printf(" ");
			//�ݺ��� k24_i�� 0�̰� k24_n���� ���� ������ 1�� ���� => "*" �����
			for (int k24_i = 0; k24_i <k24_n; k24_i++) System.out.printf("*");
			System.out.println();
			
			//while���� �� ������ k24_m(��ĭ)�� 1�� �����Ѵ�
			k24_m = k24_m - 1;
			//while���� �� ������ k24_n(��)�� 2�� �����Ѵ�
			//�̸� ���� �� �پ� �Ѿ ������ ���� �����ϰ� ��ĭ�� �پ��� �Ƕ�̵��� ���°� ������ �� 
			k24_n = k24_n +2;
			
			//���ǹ� k24_m(��ĭ)�� 0���� �۴ٸ� while�� Ż���Ѵ� 
			if (k24_m < 0)
				break;
		}
	}

}
