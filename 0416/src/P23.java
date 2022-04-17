
public class P23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//숫자 읽기 (범위를 주는 것, 숫자 자르기 )
		
		// kopo24_units은 문자열 배열으로 숫자 읽는 방법을 포함하고 있다
		// ex)kopo24_units[0]은 "영" , kopo24_units[1]은 "일" ...
		String[] kopo24_units = { "영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구" };
		// 반복문으로 0에서부터 100까지 100번 반복
		for (int kopo24_i = 0; kopo24_i < 101; kopo24_i++) {
			// 만약 kopo24_i가 0보다 크거나 작고 10보다 작을 때 => 즉 일의 자리일 때
			if (kopo24_i >= 0 && kopo24_i < 10) {
				// kopo24_units 배열의 kopo24_i번째 인덱스의 값을 출력한다
				// kopo24_i[0] = "영",  kopo24_i[1] = "일",  kopo24_i[2] = "이" ....
				System.out.printf("일의 자리: %s\n", kopo24_units[kopo24_i]);
			// 만약 kopo24_i가 10보다 크거나 작고 100보다 작을 때 => 즉 십의 자리일 떄	
			} else if (kopo24_i >= 10 && kopo24_i < 100) {
				//int 정수형 kopo24_i10, kopo24_i0을 선언 
				int kopo24_i10, kopo24_i0;
				//kopo24_i10는 kopo24_i을 10으로 나눈 몫으로 십의 자리 값을 받는다
				kopo24_i10 = kopo24_i / 10; // 십의 자리
				//kopo24_i0는 kopo24_i을 10으로 나눈 나머지로 일의 자리 값을 받는다
				kopo24_i0 = kopo24_i % 10; // 일의 자리
				//조건문 kopo24_i0이 0이면 일의 자리가 없기 때문에 십의 자리만 출력
				if (kopo24_i0 == 0) {
					System.out.printf("십의 자리 : %s십\n", kopo24_units[kopo24_i10]);
				} else {	//kopo24_i0이 0이 아니면 일의 자리가 있기 때문에 십의 자리 일의 자리 모두 출력 
					System.out.printf("십의 자리 : %s십%s\n", kopo24_units[kopo24_i10], kopo24_units[kopo24_i0]);

				}
			//line 14와 19 조건에 모두 맞지 않는 경우 (조건문 if, else if, else) 
			// => 조건문 line 12에서 kopo24_i는 0에서부터 100까지 1씩 커지므로 else에 해당하는 값은 100이다
			} else {
				//kopo24_i = 100 , 출력
				System.out.printf("==> %d\n", kopo24_i);
			}
		}
		
	}

}
