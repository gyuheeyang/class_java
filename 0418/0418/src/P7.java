import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class P7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������ ���
		int k24_Price = 33000;
		double k24_taxRate = 0.1;
		double k24_realPrice = 0;
		// ��ǥ
		DecimalFormat k24_df = new DecimalFormat("###,###,###,###,###");
		// ���� �ð�
		Calendar k24_calt = Calendar.getInstance();
		SimpleDateFormat k24_time = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
		//�ΰ��� ��� 
		k24_realPrice = k24_Price /(1 + k24_taxRate);
		if (k24_realPrice % 10 == 0) {
			//k24_realPrice = (int)k24_realPrice;
		}else {
			k24_realPrice = (int)k24_realPrice +1 ;
		}
		double tax =0;
		tax = k24_realPrice/ 10;
		System.out.println("�ΰ���:@@@@@@@@@@@@@@" + tax);
		
		
//		System.out.println("�ݾ�: " + k24_df .format(k24_realPrice) );
//		System.out.println("�ΰ���: " + k24_df .format(k24_Price - k24_realPrice));
//		System.out.println("�հ�: " + k24_df .format(k24_Price));
//		System.out.println(k24_time.format(k24_calt.getTime()));
		
		//��º�
		System.out.printf("�ſ����\n");
		System.out.printf("�ܸ���  : 2N68665898             ��ǥ ��ȣ : 041218\n");
		System.out.printf("������  : �Ѿ��ġ�\n");
		System.out.printf("��  ��  : ��� ������ �д籸 Ȳ�����351���� 10 .\n");
		System.out.printf("1��\n");
		System.out.printf("��ǥ��  : ��â��\n");
		System.out.printf("�����  : 752-53-00558               TEL  : 7055695\n");
		
		System.out.printf("- - - - - - - - - - - - - - - - - - - - - - - - - -\n");
		System.out.printf("�ݾ� %46s", k24_df .format(k24_realPrice) );
		System.out.println();
		System.out.printf("�ΰ��� %44s", k24_df .format(k24_Price - k24_realPrice  ));
		System.out.println();
		System.out.printf("�հ� %46s", k24_df .format(k24_Price) );
		System.out.println();
		System.out.printf("- - - - - - - - - - - - - - - - - - - - - - - - - -\n");
		
		System.out.printf("�츮ī��\n");
		System.out.printf("ī���ȣ : 5387-20**-****4613(S)             �Ͻú�\n");
		System.out.printf("�ŷ��Ͻ� : " + k24_time.format(k24_calt.getTime()));
		System.out.println();
		System.out.printf("���ι�ȣ : 70404427\n");
		System.out.printf("�ŷ���ȣ : 357734873739\n");
		System.out.printf("���� : ��ī���                   ���� : 720068568\n");
		System.out.printf("�˸� : EDC ����ǥ\n");
		System.out.printf("���� : TEL)1544-4700\n");
		System.out.printf("- - - - - - - - - - - - - - - - - - - - - - - - - -\n");
		System.out.printf("                   * �����մϴ� * \n");
		System.out.printf("                                  ǥ��V2.08_20200212\n");
	}
	

}
