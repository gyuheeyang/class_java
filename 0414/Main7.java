import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;



public class Main7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�ܼ� ȯ�� ���
		//������ ȯ���ϰ� ���� ��ȭ ��ü�ݾ� ���� ����
		int kopo24_MyWon = 1000000; 
		//�Ǽ��� �޷� ȯ�� ����
		double kopo24_MoneyEx = 1238.21;
		//�Ǽ��� ������ ����
		double kopo24_commission = 0.003;
		
		//ȯ�� �޴� ��ȭ(������)�� ��ȭ ��ü �ݾ��� ȯ���� ���� ���̴�, ���������� ����ó���Ѵ�
		int kopo24_usd = (int)(kopo24_MyWon/kopo24_MoneyEx);
		//�Ž����� (������)�� ��ü �ݾ׿��� ȯ���� ȯ�� ���� �ݾ��� ���� ���� �� ���̴�, ���������� ���� ó���Ѵ�
		int kopo24_remain = (int)(kopo24_MyWon - kopo24_usd*kopo24_MoneyEx);
		
		//���
		System.out.printf("**************************************************************************************************\n");
		System.out.printf("*                                        ������ ���� ���                                        *\n");
		System.out.printf(" �� ��ȭ ȯ�� �ݾ�: %d�� => ��ȭ: %d�޷�, �ܵ�: %d��\n", kopo24_MyWon, kopo24_usd, kopo24_remain);
		System.out.printf("**************************************************************************************************\n");
		
		
		//������ ���� ȯ�� ��� (1)
		
		//�Ǽ��� ���� kopo24_ComPerOne(1�޷� �� ������)�� kopo24_MoneyEx(�޷� ȯ��)�� kopo24_commission(������) ������ ���� ���̴�
		double kopo24_ComPerOne = kopo24_MoneyEx * kopo24_commission;
		//�Ǽ��� ���� kopo24_totalcom�� �� �����Ḧ �ǹ��ϸ� kopo24_usd(��ȭ)�� kopo24_ComPerOne(1�޷� �� ������)�� ���� ���̴� 
		double kopo24_totalcom = kopo24_usd * kopo24_ComPerOne;
		
		//���
		System.out.printf("**************************************************************************************************\n");
		System.out.printf("*                                          ������ ���                                            *\n");
		System.out.printf("�� ������ : %f�� => ��ȭ : %d�޷�, �޷��� ������ : %f��\n", kopo24_totalcom, kopo24_usd, kopo24_ComPerOne);
		System.out.printf("**************************************************************************************************\n");
		
		
		//������ ���� ȯ�� ��� (2)
		
		//�� �����Ḧ �ǹ��ϸ� �Ҽ��� �ڸ� �ø�ó���� ������ kopo24_i_totalcom ���� (�����Ḧ �Ҽ��� ������ ���� ���� ����!)
		int kopo24_i_totalcom;
		//�� ������ �ø� ó�� 
		//���ǹ� 47~48 line�� kopo24_totalcom(�Ǽ���)�� (double)((int)kopo24_totalcom))�� ���� ������ (int)kopo24_totalcomdp 1�� ���� �ø� ó���� �Ѵٴ� �ǹ��̴�
		// 49~50 line�� kopo24_totalcom(�Ǽ���)�� (double)((int)kopo24_totalcom))�� ������ �Ҽ����� ���� ���̱� ������ 1�� ���ϴ� �ø� ó���� ���� �ʴ´�
		if (kopo24_totalcom != (double)((int)kopo24_totalcom)) { //kopo24_totalcom�� double�̹Ƿ� �񱳸� ���� kopo24_totalcom�� ���������� ��ȯ�� ���� double�� �ٲ۴�
			kopo24_i_totalcom = (int)kopo24_totalcom + 1;
		}else {
			kopo24_i_totalcom = (int)kopo24_totalcom;
		}
		
		System.out.printf("**************************************************************************************************\n");
		System.out.printf("*                                         ������ ���� ȯ��                                       *\n");
		System.out.printf("�� ������ : %d�� => ��ȭ : %d�޷�, �޷��� ������ : %f��\n", kopo24_i_totalcom, kopo24_usd, kopo24_ComPerOne);
		
		
		//kopo24_remain(�Ž�����)�� ��ȭ - (��ȭ * ȯ��) - �� �����Ḧ �� ���� ������(int)���� �ٲ� ���̴�
		kopo24_remain = (int)( kopo24_MyWon - kopo24_usd * kopo24_MoneyEx - kopo24_i_totalcom);
		//���
		System.out.printf("�� ��ȭ ȯ�� �ݾ� : %d�� => ��ȭ : %d�޷�, ������ ¡�� : %d��, �ܵ� : %d��\n", kopo24_MyWon, kopo24_usd, kopo24_i_totalcom, kopo24_remain);
		System.out.printf("**************************************************************************************************\n");
		
		
		//������ ���� ȯ�� ��� (3)
		
		//kopo24_usd(��ȭ)�� ��ȭ ȯ�� �ݾ׿��� �޷� ȯ���� 1�޷��� �����Ḧ ���� ���� ������ ���������� ��ȯ�� ���̴� 
		//100���� �ȿ��� ȯ���� ����� �ϱ� ������ ...
		kopo24_usd = (int) (kopo24_MyWon / (kopo24_MoneyEx + kopo24_ComPerOne));
		//kopo24_totalcom(�� ������)��  kopo24_usd(��ȭ)���� kopo24_ComPerOne(1�޷��� �����Ḧ �� ���̴�)
		kopo24_totalcom = kopo24_usd * kopo24_ComPerOne;
		
		//������ �ø� ó�� 
		// kopo24_totalcom(�� ������)�� int(������)�� ����ȯ(�Ҽ��� ����� ����)�ϰ� �ٽ� double(�Ǽ���)���� ����ȯ(�� ����)�� ����
		//���� ������ 1�� ���Ѵ� (�Ҽ����� �ø� �Ϸ���)
		if (kopo24_totalcom != (double)((int) kopo24_totalcom)) {
			kopo24_i_totalcom = (int) kopo24_totalcom + 1;
		}else {											// �� ���� ������ �Ҽ��� �ڸ��� ���� ������ 1 ���� �ʿ� ����
			kopo24_i_totalcom = (int) kopo24_totalcom ;
		}
		//���
		System.out.printf("**************************************************************************************************\n");
		System.out.printf("*                                     (��Ȯ��) ������ ���� ȯ��                                  *\n");
		System.out.printf("�� ������ : %d�� => ��ȭ : %d�޷�, �޷� �� ������ : %f��\n", kopo24_i_totalcom, kopo24_usd, kopo24_ComPerOne);
		//kopo24_remain(�Ž�����)�� kopo24_MyWon(��ȭ) ���� kopo24_usd(�޷�)�� kopo24_MoneyEx(ȯ��) ���� ���� ���� �� ��������� �� ���� 
		//int ó���� ���̴�
		kopo24_remain = (int) (kopo24_MyWon - kopo24_usd * kopo24_MoneyEx - kopo24_i_totalcom);
		//���
		System.out.printf("�� ��ȭ ȯ�� �ݾ� : %d�� => ��ȭ : %d�޷�, ������ ¡��: %d��, �ܵ�: %d��\n", kopo24_MyWon, kopo24_usd, 
				kopo24_i_totalcom, kopo24_remain);
		System.out.printf("**************************************************************************************************\n");
		
		
		
		//�޸� ���
		//DecimalFormat Ŭ������ ����Ͽ� Format�� ������ �� �ִ� 
		//���� ���� �������� ���ڸ����� �޸��� ��� ������ �� ���˿� �°� ����
		DecimalFormat kopo24_df = new DecimalFormat(" ###,###,###,###,###,### ");
		
		System.out.printf("**************************************************************************************************\n");
		System.out.printf("*                                      �޸����, ��¥ ����                                       *\n");
		// DecimalFormat ������� ���� Ÿ���� �ƴ� String���� �ޱ� ������ %s�� ����Ѵ�
		System.out.printf("�� ������ : %s�� => ��ȭ : %s�޷�, �޷� �� ������ : %f��\n",
				kopo24_df.format(kopo24_i_totalcom),
				kopo24_df.format(kopo24_usd),
				kopo24_ComPerOne);
		
		kopo24_remain = (int) (kopo24_MyWon - kopo24_usd * kopo24_MoneyEx - kopo24_i_totalcom);
		System.out.printf("�� ��ȭ ȯ�� �ݾ� : %s�� => ��ȭ : %s�޷�, ������ ¡��: %s��, �ܵ�: %s��\n", kopo24_df.format(kopo24_MyWon), kopo24_df.format(kopo24_usd), 
				kopo24_df.format(kopo24_i_totalcom), kopo24_df.format(kopo24_remain));
		
		//���� ��¥, �ð� ���
		//Calendar�� �߻� Ŭ�����̱� ������ ���� new �Ͽ� ��ü ������ �Ұ��ϰ�, Calendar.getInstance() �޼ҵ带 �̿��Ѵ�
		Calendar kopo24_calt = Calendar.getInstance();
		//SimpleDateFormat Ŭ������ ���ϴ� �������� �������� �� dateŬ������ ���� �������ָ� �ȴ�
		//��ҹ��� ���� "YYYY(����)/MM(��)/dd(��) HH(�ð�):mm(��):ss(��)"
		SimpleDateFormat kopo24_sdt = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
		//���� ���� �ð��� ���ϱ� ���� kopo24_sdt�� ������ �������� getTime�� �Ѵ�
		System.out.printf("���� ���� �ð� %s\n", kopo24_sdt.format(kopo24_calt.getTime()));
		System.out.printf("**************************************************************************************************\n");
	
	}

}
