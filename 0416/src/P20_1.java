
public class P20_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//비정형 비교 3 (비정형 비교 1을 다른 식으로 짠 코드)
		
		// 반복문 kopo24_i(month)는 1에서부터 시작해서 13미만까지 1씩 증가하는 반복문
		// 반복문 안에 반복문이 있는 중첩 반복문
		for (int kopo24_i = 1; kopo24_i < 13; kopo24_i++) {
			// kopo24_i (month)를 출력
			System.out.printf("%d월 = >", kopo24_i);
			// 반복문 kopo24_j(date)는 1에서 부터 32 미만까지 1씩 증가한다
			for (int kopo24_j = 1; kopo24_j < 32; kopo24_j++) {
				// kopo24_j (date)를 출력
				System.out.printf("%d,", kopo24_j);
				// 조건문 kopo24_i(month)가 4 or 6 or 7 or 11 이면서 (AND) kopo24_j (date)가 30이면 break로 반복문 탈출
				// (4, 6, 7, 11월은 30일까지만 있음)
				// || 는 OR && 은 AND이다
				if ((kopo24_i == 4 || kopo24_i == 6 || kopo24_i == 9 || kopo24_i == 11) && (kopo24_j == 30)) {
					break;
				}
				// 조건문 kopo24_i(month)가 2이면서 (AND) kopo24_j (date)가 28이면 break로 반복문 탈출
				//(2월은 28일까지만 있음)
				if (kopo24_i == 2 && kopo24_j == 28) {
					break;
				}
			}
			System.out.printf("\n");
		}
	}

}
