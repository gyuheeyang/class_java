import java.text.DecimalFormat;

public class P29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ĭ ���� �μ� (������)
		
		//String(���ڿ�) ���� k24_item�� "���"�̴�
		String k24_item = "���";
		//int (������) ���� k24_unit_price, k24_num, k24_total ����� ���ÿ� ���� �ش� 
		int k24_unit_price = 5000;
		int k24_num = 500;
		int k24_total = 0;

		//DecimalFormat import �ʿ�
		//���� ��ǥ ���Ŀ� �°� �����Ѵ� 
		DecimalFormat k24_df = new DecimalFormat("###,###,###,###,###");

		// ������
		System.out.printf("==========================================================\n");
		System.out.printf("%20.20s%8.8s%8.8s%8.8s\n", "ǰ��", "�ܰ�", "����", "�հ�");
		System.out.printf("==========================================================\n");

		// �� ��� (D2 ��Ʈ ���) 
		//%20.20s -> k24_item , %10.10s->  k24_unit_price (k24_df.format ����), %10.10s->k24_num (k24_df.format ����)
		//%10.10s -> k24_unit_price(�ܰ�) * k24_num(����) (k24_df.format ����) 
		System.out.printf("%20.20s%10.10s%10.10s%10.10s\n", k24_item, k24_df.format(k24_unit_price), k24_df.format(k24_num),
				k24_df.format(k24_unit_price * k24_num));
		System.out.printf("==========================================================\n");

	}

}
