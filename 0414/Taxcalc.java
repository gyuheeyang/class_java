
public class Taxcalc {

	public static int taxcal (int kopo24_val, int kopo24_rate) {
		//���� ���� ����
		int kopo24_ret;
		//(double)���ǰ� * (double)����/100.0�� ���ǰ�*����/100�� ���ٸ� �Ҽ��� ���� ���ٴ� ���̹Ƿ� �ø� ó�� �ʿ� ����
		if (((double)kopo24_val * (double)kopo24_rate / 100.0) == kopo24_val*kopo24_rate/100) {
			kopo24_ret = kopo24_val * kopo24_rate / 100;
		}else {	//���� �ʴٸ� �Ҽ��� ���� �ִٴ� ���̱� ������ �ø� ó���Ѵ�
			kopo24_ret = kopo24_val * kopo24_rate / 100 +1 ;	
		}
		return kopo24_ret;	//kopo24_ret ���� �����Ѵ�
	}


public static void main(String[] args) {
	// TODO Auto-generated method stub
	//���� ���ǰ� ���� ���� 
	int kopo24_val = 271;
	//���� 5% ���� ����
	int kopo24_rate = 5;
	//������ taxcal �޼ҵ��� return���̴� 
	int kopo24_tax = taxcal (kopo24_val,kopo24_rate);
	
	System.out.printf("**************************************\n");
	System.out.printf("*             �ܼ� ���� ���            *\n");
	//100�� double ���·� ���� ������ ��� �Ǽ� �߻��ϱ� ������ ���� 
	System.out.printf("�������ݰ��: %f\n", kopo24_val * kopo24_rate / 100.0);	
	System.out.printf("�������: %d ����: %d �����԰���: %d\n", kopo24_val, kopo24_tax, kopo24_val + kopo24_tax);
	System.out.printf("**************************************\n");
	}
}