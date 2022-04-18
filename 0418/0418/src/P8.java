
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class P8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��ǥ
		DecimalFormat k24_df = new DecimalFormat("###,###,###,###,###");
		// ���� �ð�
		Calendar k24_calt = Calendar.getInstance();
		SimpleDateFormat k24_time = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
		SimpleDateFormat k24_date = new SimpleDateFormat("M�� d��");
		
		k24_calt.setTime(new Date());
		k24_calt.add(Calendar.DATE, 14);
//		System.out.println(k24_date.format(k24_calt.getTime()));
		
		String k24_iteamName1 = "ǻ��� �����ܿ븶��ũ(�ְ����)";
		String k24_itemCode1 = "1031615";
		int k24_price1 = 3000;
		int k24_amount1 = 1;
		
		String k24_iteamName2 = "�����̵�ĸ���(������)(100ȣ)";
		String k24_itemCode2 = "11008152";
		int k24_price2 = 1000;
		int k24_amount2 = 1;
		
		String k24_iteamName3 = "�������� ���׸�����ũ(�˷�̴�Ÿ��)";
		String k24_itemCode3 = "1020800";
		int k24_price3 = 1000;
		int k24_amount3 = 1;
		
		double k24_k24_taxRate = 0.1;
		double k24_k24_taxTotal = 0;
		double k24_tax = 0;
		
		int total = k24_price1 + k24_price2 + k24_price3;
		//System.out.println("�Ǹ��հ�: " +  k24_df.format(total));
		
		//�����հ� ���ϱ� 
		k24_k24_taxTotal = total / (1 + k24_k24_taxRate);
		k24_k24_taxTotal = (int) k24_k24_taxTotal;
		//System.out.println("���� �հ�: " + k24_df.format(k24_k24_taxTotal));
		
		//�ΰ��� ���ϱ� 
		k24_tax = k24_k24_taxTotal / 10.0 ;
		if (k24_tax % 10 == 0) {
			k24_tax = k24_tax;
		}else {
			k24_tax = (int)k24_tax +1; 
		}
		//System.out.println("�ΰ���: " +  k24_df.format(k24_tax));
		
		//����ð� ���
		//System.out.println(k24_time.format(k24_calt.getTime()));
		
		////////////////////��º�////////////////
		
		System.out.printf("                \"���ΰ���, ���̼�\"              \n");
		System.out.printf("(��)�Ƽ����̼�_�д缭����\n");
		System.out.printf("��ȭ:031-702-6016\n");
		System.out.printf("����:���� ������ ���μ�ȯ�� 2748 (���)\n");
		System.out.printf("��ǥ:������, ��ȣ�� 231-81-82063\n");
		System.out.printf("����:��⵵ ������ �д籸 �д��53���� 11 (����\n");
		System.out.printf("��)\n");
		System.out.printf("===============================================\n");
		System.out.printf("          �Һ����߽ɰ濵(CCM) �������\n");
		//System.out.printf("%30s" , "�Һ����߽ɰ濵(CCM) �������\n");
		System.out.printf("        ISO 9001 ǰ���濵�ý��� �������\n");
		System.out.printf("===============================================\n");
		System.out.printf("          %s (%s) %s\n", "��ȯ/ȯ�� 14��", k24_date.format(k24_calt.getTime()),"�̳�,"  );
		System.out.printf("(����)������, ����ī�� ���� �� ���Ը��忡�� ����\n");
		System.out.printf("        ����/���� �� �Ѽս� ��ȯ/ȯ�� �Ұ�\n");
		System.out.printf("          üũī�� ��� �� �ִ� 7�� �ҿ�\n");
		System.out.printf("===============================================\n");
		System.out.printf("[POS 1058231]               ");
		System.out.printf(k24_time.format(k24_calt.getTime()));
		System.out.printf("\n");
		System.out.printf("===============================================\n");
		//ù��° ������ �κ�
		System.out.printf("%5.14s",k24_iteamName1 );
		System.out.printf("       " +k24_df.format( k24_price1) );
		System.out.printf("%4d", k24_amount1);
		System.out.printf("" +k24_df.format(k24_price1 * k24_amount1)+"\n");
		System.out.printf("[%4s]\n", k24_itemCode1);
		//�ι�° ������ �κ�
		System.out.printf("%5.14s",k24_iteamName2 );
		System.out.printf("         " + k24_df.format(k24_price2));
		System.out.printf("%4d", k24_amount2);
		System.out.printf(k24_df.format(k24_price2 * k24_amount2)+"\n");
		System.out.printf("[%4s]\n", k24_itemCode2);
		//����° ������ �κ�
		System.out.printf("%5.14s",k24_iteamName3 );
		System.out.printf("       " +k24_df.format(k24_price3));
		System.out.printf("%4d", k24_amount3);
		System.out.printf(k24_df.format( k24_price3 * k24_amount3)+"\n");
		System.out.printf("[%4s]\n", k24_itemCode3);
		
		System.out.printf("%20s", "�����հ�");
		System.out.printf("                  ");
		System.out.printf(k24_df.format(k24_k24_taxTotal));
		System.out.printf("\n");
		System.out.printf("%21s", "�ΰ���");
		System.out.printf("                    ");
		System.out.printf(k24_df.format(k24_tax));
		System.out.printf("\n");

		System.out.printf("-----------------------------------------------\n");
		System.out.printf("�Ǹ��հ�                                  ");
		System.out.printf(k24_df.format(total) +"\n");

		System.out.printf("===============================================\n");
		System.out.printf("�ſ�ī��                                  ");
		System.out.printf(k24_df.format(total) + "\n");
		System.out.printf("-----------------------------------------------\n");
		
		System.out.printf("�츮ī��");
		System.out.printf("%39s\n", "538720**********");
		System.out.printf("���ι�ȣ 77982843(0)");
		System.out.printf("%18s %4d\n", "���αݾ�", total);
		System.out.printf("===============================================\n");
		System.out.printf("        ");
		System.out.printf(k24_time.format(k24_calt.getTime()));		
		System.out.printf(" �д缭����\n");
		System.out.printf("��ǰ �� ��Ÿ ���� : 1522-4400\n");
		System.out.printf("����� �� �����̼� ���� ���� : 1599-2211\n");
		System.out.printf("%30s","211282061015231\n");
		
		System.out.printf("-----------------------------------------------\n");
		System.out.printf(" �� ���̼� ����� �� �Ǵ� Ȩ�������� �����ϼż�\n");
		System.out.printf(" ȸ������ �� �پ��� ������ ����������! �� ");
	}

}
