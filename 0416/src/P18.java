
public class P18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 범위를 주어 비교 (찾기)

		// 정수형 (int) kopo24_iVal을 선언
		int kopo24_iVal;
		// 조건문 0부터 300보다 작을 때까지 1씩 증가하겠다 => 300번 반복
		for (int kopo24_i = 0; kopo24_i < 300; kopo24_i++) {
			// kopo24_iVal은 kopo24_i에 5를 곱한 값(5의 배수)이다 => kopo24_iVal은 5 * 1, 5 * 2, 5 *3
			// ...
			// kopo24_i는 반복할 때마다 1씩 증가하므로!
			kopo24_iVal = 5 * kopo24_i;
			// 조건문 kopo24_iVal이 0보다 크거나 같고 (!!&&-> AND이다 OR 아님!!) kopo24_iVal이 10보다 작으면
			// 즉, 일의 자리 수 일 때 (1 ~ 9)
			if (kopo24_iVal >= 0 && kopo24_iVal < 10) {
				System.out.printf("일 %d\n", kopo24_iVal); // 일 해당 kopo24_iVal값 출력
			} else if (kopo24_iVal >= 10 && kopo24_iVal < 100) { // kopo24_iVal이 10보다 크거나 같고 (!!&&-> AND이다!!)
																	// kopo24_iVal이 100보다 작으면
																	// 즉, 십의 자리수 일 때 (10 ~ 99)
				System.out.printf("십 %d\n", kopo24_iVal); // 십 해당 kopo24_iVal값 출력
			} else if (kopo24_iVal >= 100 && kopo24_iVal < 1000) { // kopo24_iVal이 100보다 크거나 같고 (!!&&-> AND이다!!)
																	// kopo24_iVal이 1000보다 작으면
																	// 즉, 백의 자리수 일 때 (100 ~ 999)
				System.out.printf("백 %d\n", kopo24_iVal); // 백 해당 kopo24_iVal값 출력
			} else { // 위의 조건 모두에 해당하지 않는다면
				System.out.printf("천 %d\n", kopo24_iVal); // 천 해당 kopo24_iVal값 출력
			}
		}
		// 즉 이 코드의 결과값은 0부터 300까지의 숫자에 5를 곱한 값이 각 자리수 별로 표시되어 출력된다
	}

}
