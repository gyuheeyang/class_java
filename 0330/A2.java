import java.util.Scanner;

public class A2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Input text");
		String text = scanner.nextLine();
		String textWithoutSpace = text.replaceAll(" ", ""); // ���� ���� 
		textWithoutSpace = textWithoutSpace.toLowerCase(); // �ҹ��ڷ� ����
		char[] textArr = textWithoutSpace.toCharArray(); // �Է� ���� text string�� char �迭�� ��ȯ
		int vowel = 0;
		int consonant = 0;

		for (char c : textArr) {		//ascii �ڵ�� Ȯ�� 
			if ((int) c == 97 || (int) c == 101 || (int) c == 105 || (int) c == 111 || (int) c == 117) {
				vowel++;
			}
		}
		int length = textWithoutSpace.length();
		consonant = length - vowel;			//�������� : ���ڿ� ���� - ���� ����

		System.out.println("Num. of Consonant: " + consonant);
		System.out.println("Num. of Vowels: " + vowel);
	}

}
