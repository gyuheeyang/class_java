
public class Main6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		////p.16
		//������ �����ϴ� ���ڿ� �迭�� �����Ѵ� 
		String [] kopo24_item = {"Ȩ����", "����", "�������","���޴���","���Ͻ�"}; 
		//���� ���� ����(�ܰ�)�� �����ϴ� ���� �迭�� �����Ѵ�
		int[] kopo24_price = {2500,1500,2000,500,1500};
		//���� ���� ������ �����ϴ� ���� �迭�� �����Ѵ�
		int[]kopo24_amount = {10,2,1,3,5};
		//�Ǽ��� ������ �����Ѵ�
		double kopo24_tax_rate = 0.1;
		//������ ���� �ݾ��� �����ϸ鼭 0���� �ʱ�ȭ�Ѵ�
		int kopo24_total_sum = 0;
		
		System.out.printf("*********************************************\n"); 
		System.out.printf("             ���� ���� ���ڵ�\n\n");
		System.out.printf("�׸�              �ܰ�     ����         �հ�\n");
		//�ݺ��� 0���� kopo24_item �迭�� ���̸�ŭ �ݺ��Ѵ�(��������...), i�� 1�� �����Ѵ�
		for (int i = 0; i < kopo24_item.length; i++) {
			//������ kopo24_sum ������ ���� kopo24_sum�� i��° kopo24_price(�ܰ�)�� ���� i��° kopo24_amount(����)�� ���� ���̴�
			int kopo24_sum = kopo24_price[i] * kopo24_amount[i];
			//�հ�� kopo24_sum�� ��� �ݺ��ؼ� ���� ���̴� 
			kopo24_total_sum = kopo24_total_sum + kopo24_sum;
			//kopo24_item�� i��° �ε���, kopo24_price i��° �ε���, kopo24_amount i��° �ε���, kopo24_sum�� ����Ѵ�
			System.out.printf("%-10s\t %5d\t %5d %13d\n", kopo24_item[i], kopo24_price[i], kopo24_amount[i], kopo24_sum);
		}
		System.out.printf("*********************************************\n");
		System.out.printf("���ұݾ� : %33d\n", kopo24_total_sum);
		
		//������ �����ݾ� ������ ���ұݾ��� (���� + 1)�� ���� ������ ���̴� 
		int kopo24_total_net_price = (int)(kopo24_total_sum/ (1 + kopo24_tax_rate));
		System.out.printf("�����ݾ� : %33d\n", kopo24_total_net_price);
		//������ ������ ���ұݾ׿��� �����ݾ��� �� �����̴� 
		int kopo24_tax = kopo24_total_sum - kopo24_total_net_price;
		System.out.printf("��    �� : %33d\n", kopo24_tax);
	}

}
