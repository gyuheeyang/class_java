
public class P17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �������� �������� ��

		// ������ ���� kopo24_iI ����
		int kopo24_iI;
		// �Ǽ��� ���� kopo24_iD ����
		double kopo24_iD;

		// kopo24_iI�� �������̱� ������ ������(3)���� ������
		kopo24_iI = 10 / 3;
		// kopo24_iD�� �Ǽ����̱� ������ �Ǽ��� (3.0)���� ������
		kopo24_iD = 10 / 3.0;

		// ���ǹ� ���� kopo24_iI (������int)�� kopo24_iD(�Ǽ��� double)�� ���ٸ�
		if (kopo24_iI == kopo24_iD) {
			System.out.printf("equal\n"); // "equal\n"�� ���
		} else { // ���� kopo24_iI (������int)�� kopo24_iD(�Ǽ��� double)�� ���� �ʴٸ�
			System.out.printf("Not equal [%f][%f]\n", (double) kopo24_iI, kopo24_iD);
			// 22 line���� kopo24_iI�� �������� �տ� (double)�� �ٿ� �Ǽ������� ���� ��ȯ�ߴ� => ��µǴ� ���� �Ǽ����̴�
		}

		// ���� ��ȿ���ڱ��� ǥ�õ� �� ������ ���� ���� �ٸ��� => kopo24_iD = 10 /3.0 �� kopo24_iD == 3.333333��
		// �ٸ� ���̴�
		// ���� kopo24_iD (double �Ǽ���)�� ���� 3.333333�̶��
		if (kopo24_iD == 3.333333) {
			System.out.printf("equal\n"); // "equal\n"�� ����Ѵ�
		} else { // kopo24_iD (double �Ǽ���)�� ���� 3.333333�� �ƴ϶��
			System.out.printf("Not equal [3.333333][%f]\n", kopo24_iD);
		} // "Not equal [3.333333][%f]\n", kopo24_iD�� ����Ѵ�

		// kopo24_iD(double �Ǽ���)�� kopo24_iD(int ������)���� ��ȯ�� ���� ���ٰ� ���� => kopo24_iD
		// =3.0�̴�(!!3.33333�� �ƴϴ�!!)
		kopo24_iD = (int) kopo24_iD;

		// ���� kopo24_iI(int ������)�� kopo24_iD(double �Ǽ���)�� ���ٸ�
		if (kopo24_iI == kopo24_iD) {
			System.out.printf("equal\n"); // "equal\n" ���
		} else { // ���� kopo24_iI(int ������)�� kopo24_iD(double �Ǽ���)�� ���� �ʴٸ�
			System.out.printf("Not equal [%f][%f]\n", (double) kopo24_iI, kopo24_iD); // kopo24_iI (double �Ǽ���),
																						// kopo24_iD(double �Ǽ���)���� ���
		}

		System.out.printf("Int�� �μ� [%d][%f]\n", kopo24_iI, kopo24_iD); // kopo24_iI�� int �������̰�(%d ���) kopo24_iD�� double
																		// �Ǽ����̴� (%f ���)
		System.out.printf("double�� �μ� [%f][%f]\n", (double) kopo24_iI, kopo24_iD); // int ������ kopo24_iI �տ� double�� �ٿ���
																					// double �Ǽ������� ���

		// ĳ���� kopo24_a�� 'c'�̴� char�� '' ���� ����ǥ ���
		char kopo24_a = 'c';

		if (kopo24_a == 'b') { // kopo24_a�� 'b'�̸� / char�� ���� ���� ==�� ����Ѵ�
			System.out.printf("a�� b�̴�\n"); // ���
		}
		if (kopo24_a == 'c') { // kopo24_a�� 'c'�̸� ////kopo24_a�� 'c'�̹Ƿ� 55line�� ��� �� ���̴�
			System.out.printf("a�� c�̴�\n"); // ���
		}
		if (kopo24_a == 'd') { // kopo24_a�� 'd'�̸�
			System.out.printf("a�� d�̴�\n"); // ���
		}

		// ���ڿ� kopo24_aa �� "abcd"�̴�
		String kopo24_aa = "abcd";
		if (kopo24_aa.equals("abcd")) { // string kopo24_aa�� "abcd"�� ���ٸ�
										// => ���ڿ��� ���� ���� ���ڿ� �̸�.equals("���ϰ���� ���ڿ�")�� ����Ѵ� (== ����� �� ����!!)
			System.out.printf("aa�� abcd�̴�\n"); // ���
		} else { //// string kopo24_aa�� "abcd"�� ���� �ʴٸ�
			System.out.printf("aa�� abcd�� �ƴϴ�\n");
		}

		boolean kopo24_bb = true; // ���� boolean�� true, false ���� ���´�, kopo24_bb�� true�̴�
		if (!!kopo24_bb) { // �������� !�� not�� �ǹ��̴� �� !kopo24_bb�� true�� �ƴ� �� false/ !!!kopo24_bb�� false�� �ƴ� ��
							// true�̴�
			System.out.printf("bb�� �ƴϰ� �ƴϸ� ���̴�\n");
		} else {
			System.out.printf("bb�� �ƴϰ� �ƴϸ� �����̴�\n");
		}
	}

}
