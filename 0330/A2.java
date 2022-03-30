import java.util.Scanner;

public class A2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Input text");
		String text = scanner.nextLine();
		String textWithoutSpace = text.replaceAll(" ", ""); // 공백 삭제 
		textWithoutSpace = textWithoutSpace.toLowerCase(); // 소문자로 변경
		char[] textArr = textWithoutSpace.toCharArray(); // 입력 받은 text string을 char 배열로 변환
		int vowel = 0;
		int consonant = 0;

		for (char c : textArr) {		//ascii 코드로 확인 
			if ((int) c == 97 || (int) c == 101 || (int) c == 105 || (int) c == 111 || (int) c == 117) {
				vowel++;
			}
		}
		int length = textWithoutSpace.length();
		consonant = length - vowel;			//자음길이 : 문자열 길이 - 모음 길이

		System.out.println("Num. of Consonant: " + consonant);
		System.out.println("Num. of Vowels: " + vowel);
	}

}
