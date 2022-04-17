
public class P24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 숫자 읽기 고급 큰 단위의 숫자를 읽어 주는 프로그램을 짠다

		int kopo24_iNumVal = 2030200000;
		// int(kopo24_iNumVal)를 string(kopo24_sNumVal)으로 형변환한다
		String kopo24_sNumVal = String.valueOf(kopo24_iNumVal);
		// 문자열 형태 kopo24_sNumVoice를 선언하고 초기화한다.
		String kopo24_sNumVoice = "";
		// 해당 숫자가 몇 자리인지 알아내야 첫 글자의 단위를 알 수 있다
		// kopo24_sNumVal.length()를 통해 kopo24_sNumVal 문자열의 길이 즉, 단위를 알 수 있다.
		System.out.printf("==> %s [%d자리]\n", kopo24_sNumVal, kopo24_sNumVal.length());

		// 반복문에서 사용할 변수 선언
		int kopo24_i, kopo24_j;

		// 문자열 형태의 배열을 선언하고 문자열을 각각 배열에 넣는다
		// kopo24_units는 각 자리별 숫자를 의미하고 kopo24_unitx는 단위를 의미한다
		String[] kopo24_units = { "영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구" };
		String[] kopo24_unitx = { "", "십", "백", "천", "만", "십", "백", "천", "억", "십" };

		// 반복문에서 사용할 변수의 값을 넣어준다
		kopo24_i = 0;
		// kopo24_j는 kopo24_sNumVal의 길이에서 1을 뺀 값이다
		kopo24_j = kopo24_sNumVal.length() - 1;

		while (true) {
			// kopo24_i 값이 kopo24_sNumVal의 길이보다 크거나 같으면 while문을 탈출한다
			// 즉, kopo24_i는 0이기 때문에 kopo24_sNumVal 길이가 0이거나 -라면 while문을 탈출
			if (kopo24_i >= kopo24_sNumVal.length())
				break;
			// substring은 문자열을 자르는 함수이다
			// kopo24_sNumVal.substring(kopo24_i, kopo24_i + 1)은 kopo24_sNumVal을 kopo24_i,부터
			// kopo24_i + 1전까지의 문자열을 의미한다
			// 즉, 숫자의 단위별로 해당 자리의 숫자를 가져옴
			System.out.printf("%s[%s]", kopo24_sNumVal.substring(kopo24_i, kopo24_i + 1),
					// Integer.parseInt 함수를 사용하여 (kopo24_sNumVal.substring(kopo24_i, kopo24_i + 1))의
					// 값을 int형태로 가져온다
					// kopo24_units의 Integer.parseInt(kopo24_sNumVal.substring(kopo24_i, kopo24_i +
					// 1))번째 인덱스의 값을 가져온다
					// 즉, 숫자의 단위별로 해당 자리의 숫자를 읽는 법을 가져옴
					kopo24_units[Integer.parseInt(kopo24_sNumVal.substring(kopo24_i, kopo24_i + 1))]);
			// equals 함수를 사용해서 해당 문자열에 "0"이 있는지를 확인한다
			if (kopo24_sNumVal.substring(kopo24_i, kopo24_i + 1).equals("0")) {
				// 만일 0이 존재하고 kopo24_unitx 배열의 kopo24_j번째 인덱스에 "만"이 있거나 "억"이 있다면 단위만 붙인다
				if (kopo24_unitx[kopo24_j].equals("만") | kopo24_unitx[kopo24_j].equals("억")) {
					kopo24_sNumVoice = kopo24_sNumVoice + "" + kopo24_unitx[kopo24_j];
					//오류수정 파트 
					//천만(kopo24_sNumVal.length() - 8)에서 만(kopo24_sNumVal.length() - 4) 사이가 0("0000")이면  => string 비교 equals 사용
					//문자열에서 만을 뺀다(replace("만", "") => stirng 문자열 바꾸기 replace 사용
					if (kopo24_sNumVal.substring(kopo24_sNumVal.length() - 8, kopo24_sNumVal.length() - 4)
							.equals("0000")) {
						kopo24_sNumVoice = kopo24_sNumVoice.replace("만", "");
					}
				} else { // 만일 0이 존재하고 kopo24_unitx 배열의 kopo24_j번째 인덱스에 "만"이 있거나 "억"이 없다면 넘어간다

				}
			} else { //// equals 함수를 사용해서 해당 문자열에 "0"이 존재하지 않는다면
				// kopo24_sNumVoice(숫자를 읽는 변수)는 각 단위의 자리의 숫자와 단위를 의미한다
				kopo24_sNumVoice = kopo24_sNumVoice
						+ kopo24_units[Integer.parseInt(kopo24_sNumVal.substring(kopo24_i, kopo24_i + 1))]
						+ kopo24_unitx[kopo24_j];
			}
			// kopo24_i는 반복이 될 때마다 1씩 증가하고
			// kopo24_j는 반복이 될 때마다 1씩 감소한다 (kopo24_j= kopo24_sNumVal.length() - 1에서부터 시작했기 때문
			kopo24_i++;
			kopo24_j--;
		}
		// 출력
		System.out.printf("\n %s [%s]\n", kopo24_sNumVal, kopo24_sNumVoice);
	}

}
