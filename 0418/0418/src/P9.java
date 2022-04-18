import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class P9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������ �޼ҵ�
		// 5�� 3�� �ǽ����� �ؾ� ��

		// ��ǰ
		String[] k24_itemName = { "����Ȩ SAFE365 �ڵ�", "(G)LH��������ȭ�� 10", "��������E", "���� ���Ϸ� �� ��", "����Ȩ SAFE �ڵ����",
				"��� �Ŷ�� 120*5", "(��)����������", "���ѱ� �� ����� 156g", "GAP ������ 4-6��", "�� ����� �ٳ���(��)", "����ũ ź�θ� �߰���",
				"(����)���� �߰���(g)", "DZ�ִϾ�縻3��C_BK", "DZ�ִϾ�縻3��C_WH", "�����̾��������ʹ�", "����ũ ����̿���500", "���� ���ִ� ���� GT ��",
				"���������÷�10��", "��������(��)65g*6", "�ɶ�ý� ���� Ʈ��Ʈ", "Ǫ���� �̼����� ����", "���Ϸν� ��������500g", "CJ ����Ĩ 20G",
				"���� ����̿���500", "����� ������ũƼ", "1+��޶� 10���� Ư", "������ݺ�����ġ��ȹ" };
		// �ܰ�
		int[] k24_price = { 7500, 6900, 5980, 3300, 5500, 3380, 6610, 2750, 10800, 5980, 2480, 7920, 4980, 4980, 7130,
				3980, 4480, 4980, 3210, 6950, 2980, 1990, 1980, 3980, 4480, 3480, 7980 };
		// ����
		int[] k24_num = { 2, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 2, 1, 1 };
		// �鼼 ����
		boolean[] k24_taxFree = { false, false, false, false, false, false, true, false, true, true, false, false,
				false, false, false, false, true, false, false, false, false, false, false, false, false, true, false };

		// ��ǥ
		DecimalFormat k24_df = new DecimalFormat("###,###,###,###,###");
		// ���� �ð�
		Calendar k24_calt = Calendar.getInstance();
		SimpleDateFormat k24_timeForParking = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss"); // �ڵ��� ������
		SimpleDateFormat k24_timeForPay = new SimpleDateFormat("YYYY/MM/dd HH:mm"); // ����

		// �� ǰ�� ����
		int k24_itemNum = 0;
		for (int i = 0; i < k24_num.length; i++) {
			k24_itemNum = k24_itemNum + k24_num[i];
		}
		// System.out.println("����" +k24_itemNum);

		// �鼼��ǰ, ������ǰ
		int k24_totalTaxFreeItem = 0;
		double k24_totalTaxItem = 0;
		for (int k24_i = 0; k24_i < k24_taxFree.length; k24_i++) {
			if (k24_taxFree[k24_i] == true) { // �鼼
				k24_totalTaxFreeItem = k24_totalTaxFreeItem + k24_price[k24_i];
			}
		}
		// System.out.println("�鼼:" + k24_df.format(k24_totalTaxFreeItem));

		// �հ�
		int k24_total = 0;
		for (int k24_j = 0; k24_j < k24_price.length; k24_j++) {
			k24_total = k24_total + k24_price[k24_j];
		}
		// System.out.println("�հ�" + k24_df.format(k24_total));

		// �ΰ���
		double k24_tax = 0;
		double k24_rate = 0.1;

		// ���� ��ǰ = (�հ� - �鼼)/ (1 + �ΰ���)
		k24_totalTaxItem = ((double) k24_total - (double) k24_totalTaxFreeItem) / (1.0 + k24_rate);
		if (k24_totalTaxItem / 10 == 0) {
			k24_totalTaxItem = k24_totalTaxItem;
		} else {
			k24_totalTaxItem = (int) k24_totalTaxItem ;
		}
		// System.out.println("������ǰ" + k24_df.format(k24_totalTaxItem));

		// �ΰ���
		k24_tax = k24_totalTaxItem / 10.0;
		// System.out.println("�ΰ���" + k24_df.format(k24_tax));

		///////////////////////// ��º�///////////////////////
		System.out.printf("Emart");
		System.out.printf("%29s\n", "�̸�Ʈ ������ (031)888-1234");
		System.out.printf("%37s\n", "206-86-50913 ����");
		System.out.printf("%31s\n", "���� ������ ������� 552");
		System.out.printf("\n");

		System.out.printf("������ �������� ��ȯ/ȯ�� �Ұ�\n");
		System.out.printf("�����ǰ�� ����, 30�� �̳� (�ż� 7��)\n");
		System.out.printf("�� �Ϻ� �귣����� ���� (���� ����������)\n");
		System.out.printf("��ȯ/ȯ�� ���������� ����(����ī�� ����)\n");
		System.out.printf("\n");
		System.out.printf("[�� ��]" + k24_timeForPay.format(k24_calt.getTime()));
		System.out.printf("%18s", "POS: 0011-9861\n");
		System.out.printf("----------------------------------------\n");
		System.out.printf("%11s %11s %3s %3s\n", "��ǰ��", "�� ��", "����", "�� ��");
		System.out.printf("----------------------------------------\n");
		
		//�鼼
		String k24_star ; 
		for (int k24_i = 0; k24_i < k24_itemName.length; k24_i++) {
			if (k24_taxFree[k24_i] == true) {
				k24_star = "*";
			}else {
				k24_star = " ";
			}
			
			// ������ �̸� ���
			System.out.printf(k24_star);
			System.out.printf("%s", k24_subStrByte(k24_itemName[k24_i],20));			
			System.out.printf("%7s", k24_df.format(k24_price[k24_i]));
			System.out.printf("%4d", k24_num[k24_i]);
			System.out.printf("%8s", k24_df.format(k24_price[k24_i] * k24_num[k24_i]));
			System.out.printf("\n");
			if ((k24_i + 1) % 5 == 0) {
				System.out.printf("----------------------------------------\n");
			}
		}
		
		
		System.out.printf("%25.25s", "�� ǰ�� ����");
		System.out.printf("%10d\n", k24_itemNum);
		System.out.printf("%26.26s", "(*)�� �� �� ǰ");
		System.out.printf("    " + k24_df.format(k24_totalTaxFreeItem));
		System.out.printf("\n");
		System.out.printf("%26.26s", "���� ��ǰ");
		System.out.printf("    " + k24_df.format(k24_totalTaxItem));
		System.out.printf("\n");
		System.out.printf("%27.27s", "�� �� ��");
		System.out.printf("     " + k24_df.format(k24_tax));
		System.out.printf("\n");
		System.out.printf("%28.28s", "��    ��");
		System.out.printf("   " + k24_df.format(k24_total));
		System.out.printf("\n");
		System.out.printf("----------------------------------------\n");
		System.out.printf("%-19s", "0012 KEB �ϳ�");
		System.out.printf("%19.19s\n", "541707**0484/35860658");
		System.out.printf("%-19s", "ī�����(IC)");
		System.out.printf("%7.7s", "�Ͻú�/");
		System.out.printf(k24_df.format(k24_total));
		System.out.printf("\n");
		System.out.printf("----------------------------------------\n");
		System.out.printf("          [�ż�������Ʈ ����]\n");
		System.out.printf("��*�� ������ ����Ʈ ��Ȳ�Դϴ�\n");
		System.out.printf("%-19s", "��ȸ�߻�����Ʈ");
		System.out.printf("%6.6s", "9350**9995");
		System.out.printf("%7.7s\n", "164");
		System.out.printf("%-19s", "����(����)����Ʈ");
		System.out.printf("%5.5s", k24_df.format(5637));
		System.out.printf("%1s%6.6s%1s\n", "(", k24_df.format(5473), ")");
		System.out.printf("*�ż�������Ʈ ��ȿ�Ⱓ�� 2���Դϴ�.\n");
		System.out.printf("----------------------------------------\n");
		System.out.printf("   ���űݾױ��� ���������ð� �ڵ��ο�\n");
		System.out.printf("%-14s", "������ȣ:");
		System.out.printf("%20.20s\n", "34��****");
		System.out.printf("%s", "�����ð�:");
		System.out.printf("%31.31s\n", k24_timeForParking.format(k24_calt.getTime()));
		System.out.printf("----------------------------------------\n");
		System.out.printf("%-19s", "ĳ��: 084599 �����");
		System.out.printf("%16.16s\n\n", "1150");
		System.out.printf("           20210303/00119861/00164980/31");
	}
	
	
	   public static String k24_subStrByte(String k24_source, int k24_cutLength) {
	         if (!k24_source.isEmpty()) {
	            k24_source = k24_source.trim();// 
	            if (k24_source.getBytes().length < k24_cutLength) {
	               for (int k24_i = k24_cutLength - k24_source.getBytes().length; k24_i > 0; k24_i--) {
	                  k24_source += " ";
	               }
	               return k24_source;
	            } else {
	               StringBuffer k24_sb = new StringBuffer(k24_cutLength);
	               int k24_cnt = 0;
	               for (char k24_ch : k24_source.toCharArray()) {
	                  k24_cnt += String.valueOf(k24_ch).getBytes().length;
	                  if (k24_cnt > k24_cutLength)
	                     break;
	                  k24_sb.append(k24_ch);
	               }
	               
	               if(k24_sb.toString().getBytes().length == 19) {
	                  k24_sb.append(" ");
	               }
	               
	               return k24_sb.toString();
	            }
	         } else {
	            return "";
	         }
	      }
	
	
	
}
