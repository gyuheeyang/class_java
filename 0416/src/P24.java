
public class P24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� �б� ��� ū ������ ���ڸ� �о� �ִ� ���α׷��� §��

		int kopo24_iNumVal = 2030200000;
		// int(kopo24_iNumVal)�� string(kopo24_sNumVal)���� ����ȯ�Ѵ�
		String kopo24_sNumVal = String.valueOf(kopo24_iNumVal);
		// ���ڿ� ���� kopo24_sNumVoice�� �����ϰ� �ʱ�ȭ�Ѵ�.
		String kopo24_sNumVoice = "";
		// �ش� ���ڰ� �� �ڸ����� �˾Ƴ��� ù ������ ������ �� �� �ִ�
		// kopo24_sNumVal.length()�� ���� kopo24_sNumVal ���ڿ��� ���� ��, ������ �� �� �ִ�.
		System.out.printf("==> %s [%d�ڸ�]\n", kopo24_sNumVal, kopo24_sNumVal.length());

		// �ݺ������� ����� ���� ����
		int kopo24_i, kopo24_j;

		// ���ڿ� ������ �迭�� �����ϰ� ���ڿ��� ���� �迭�� �ִ´�
		// kopo24_units�� �� �ڸ��� ���ڸ� �ǹ��ϰ� kopo24_unitx�� ������ �ǹ��Ѵ�
		String[] kopo24_units = { "��", "��", "��", "��", "��", "��", "��", "ĥ", "��", "��" };
		String[] kopo24_unitx = { "", "��", "��", "õ", "��", "��", "��", "õ", "��", "��" };

		// �ݺ������� ����� ������ ���� �־��ش�
		kopo24_i = 0;
		// kopo24_j�� kopo24_sNumVal�� ���̿��� 1�� �� ���̴�
		kopo24_j = kopo24_sNumVal.length() - 1;

		while (true) {
			// kopo24_i ���� kopo24_sNumVal�� ���̺��� ũ�ų� ������ while���� Ż���Ѵ�
			// ��, kopo24_i�� 0�̱� ������ kopo24_sNumVal ���̰� 0�̰ų� -��� while���� Ż��
			if (kopo24_i >= kopo24_sNumVal.length())
				break;
			// substring�� ���ڿ��� �ڸ��� �Լ��̴�
			// kopo24_sNumVal.substring(kopo24_i, kopo24_i + 1)�� kopo24_sNumVal�� kopo24_i,����
			// kopo24_i + 1�������� ���ڿ��� �ǹ��Ѵ�
			// ��, ������ �������� �ش� �ڸ��� ���ڸ� ������
			System.out.printf("%s[%s]", kopo24_sNumVal.substring(kopo24_i, kopo24_i + 1),
					// Integer.parseInt �Լ��� ����Ͽ� (kopo24_sNumVal.substring(kopo24_i, kopo24_i + 1))��
					// ���� int���·� �����´�
					// kopo24_units�� Integer.parseInt(kopo24_sNumVal.substring(kopo24_i, kopo24_i +
					// 1))��° �ε����� ���� �����´�
					// ��, ������ �������� �ش� �ڸ��� ���ڸ� �д� ���� ������
					kopo24_units[Integer.parseInt(kopo24_sNumVal.substring(kopo24_i, kopo24_i + 1))]);
			// equals �Լ��� ����ؼ� �ش� ���ڿ��� "0"�� �ִ����� Ȯ���Ѵ�
			if (kopo24_sNumVal.substring(kopo24_i, kopo24_i + 1).equals("0")) {
				// ���� 0�� �����ϰ� kopo24_unitx �迭�� kopo24_j��° �ε����� "��"�� �ְų� "��"�� �ִٸ� ������ ���δ�
				if (kopo24_unitx[kopo24_j].equals("��") | kopo24_unitx[kopo24_j].equals("��")) {
					kopo24_sNumVoice = kopo24_sNumVoice + "" + kopo24_unitx[kopo24_j];
					//�������� ��Ʈ 
					//õ��(kopo24_sNumVal.length() - 8)���� ��(kopo24_sNumVal.length() - 4) ���̰� 0("0000")�̸�  => string �� equals ���
					//���ڿ����� ���� ����(replace("��", "") => stirng ���ڿ� �ٲٱ� replace ���
					if (kopo24_sNumVal.substring(kopo24_sNumVal.length() - 8, kopo24_sNumVal.length() - 4)
							.equals("0000")) {
						kopo24_sNumVoice = kopo24_sNumVoice.replace("��", "");
					}
				} else { // ���� 0�� �����ϰ� kopo24_unitx �迭�� kopo24_j��° �ε����� "��"�� �ְų� "��"�� ���ٸ� �Ѿ��

				}
			} else { //// equals �Լ��� ����ؼ� �ش� ���ڿ��� "0"�� �������� �ʴ´ٸ�
				// kopo24_sNumVoice(���ڸ� �д� ����)�� �� ������ �ڸ��� ���ڿ� ������ �ǹ��Ѵ�
				kopo24_sNumVoice = kopo24_sNumVoice
						+ kopo24_units[Integer.parseInt(kopo24_sNumVal.substring(kopo24_i, kopo24_i + 1))]
						+ kopo24_unitx[kopo24_j];
			}
			// kopo24_i�� �ݺ��� �� ������ 1�� �����ϰ�
			// kopo24_j�� �ݺ��� �� ������ 1�� �����Ѵ� (kopo24_j= kopo24_sNumVal.length() - 1�������� �����߱� ����
			kopo24_i++;
			kopo24_j--;
		}
		// ���
		System.out.printf("\n %s [%s]\n", kopo24_sNumVal, kopo24_sNumVoice);
	}

}
