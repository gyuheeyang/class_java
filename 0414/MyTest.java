
public class MyTest {
	//netprice �������� ��� �޼ҵ� ����
	
	public static int kopo24_netprice (int kopo24_price, double kopo24_rate) {
		//������ ���� ���� ��� ���� return�Ѵ�
		return (int)(kopo24_price / (1 + kopo24_rate)); //�Һ��� ���� / (1 + ����)
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��ǰ ���� ������ ���� ����
		int kopo24_price = 1234;
		//���� �Ǽ��� ���� ����
		double kopo24_tax_rate = 0.1;
		
		//������ ���� ���� ������ kopo24_netprice�޼ҵ忡 kopo24_price, kopo24_tax_rate�� �־� return�Ǵ� ���̴�  
		int kopo24_netprice = kopo24_netprice(kopo24_price, kopo24_tax_rate);
		//������ ���� ���� ������ kopo24_price ���� kopo24_netprice�� �� ���̴� 
		int kopo24_tax = kopo24_price - kopo24_netprice; 
		//��º�
		System.out.printf("*******************************************\n");
		System.out.printf("*      �Һ��ڰ�, ��������, ���� ���      *\n");
		System.out.printf("�Һ��ڰ���: %d, ����: %d, ����: %d\n", kopo24_price, kopo24_netprice, kopo24_tax);
		System.out.printf("*******************************************\n");
	}

}
