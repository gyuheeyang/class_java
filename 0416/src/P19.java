
public class P19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 비정형 비교 1 (깔끔 코딩)
		// 1월 ~ 12월 해당 달의 일을 모두 출력
		
		// 반복문 kopo24_i는 1이고 13보다 작으며 반복할 때마다 1씩 커진다
		// => 1 ~ 12까지 반복 kopo24_i은 달(month)을 의미함
		for (int kopo24_i = 1; kopo24_i < 13; kopo24_i++) {
			System.out.printf(" %d월=>", kopo24_i);
			{ // kopo24_i (달)의 값을 출력
				// 반복문 kopo24_j는 1이고 32보다 작으며 반복할 때마다 1씩 커진다
				// => 1부터 31까지 반복 kopo24_j는 일(date)을 의미한다
				for (int kopo24_j = 1; kopo24_j < 32; kopo24_j++) {
					System.out.printf("%d,", kopo24_j); // kopo24_j(date)를 출력

					// 조건문
					if (kopo24_i == 1 && kopo24_j == 31)
						break; // kopo24_i(month)이 1이라면 kopo24_j(date)가 31일 때 break로 반복문 탈출
					if (kopo24_i == 2 && kopo24_j == 28)
						break; // kopo24_i(month)이 2이라면 kopo24_j(date)가 28일 때 break로 반복문 탈출
					if (kopo24_i == 3 && kopo24_j == 31)
						break; // kopo24_i(month)이 3이라면 kopo24_j(date)가 31일 때 break로 반복문 탈출
					if (kopo24_i == 4 && kopo24_j == 30)
						break; // kopo24_i(month)이 4이라면 kopo24_j(date)가 30일 때 break로 반복문 탈출
					if (kopo24_i == 5 && kopo24_j == 31)
						break; // kopo24_i(month)이 5이라면 kopo24_j(date)가 31일 때 break로 반복문 탈출
					if (kopo24_i == 6 && kopo24_j == 30)
						break; // kopo24_i(month)이 6이라면 kopo24_j(date)가 30일 때 break로 반복문 탈출
					if (kopo24_i == 7 && kopo24_j == 31)
						break; // kopo24_i(month)이 7이라면 kopo24_j(date)가 31일 때 break로 반복문 탈출
					if (kopo24_i == 8 && kopo24_j == 31)
						break; // kopo24_i(month)이 8이라면 kopo24_j(date)가 31일 때 break로 반복문 탈출
					if (kopo24_i == 9 && kopo24_j == 30)
						break; // kopo24_i(month)이 9이라면 kopo24_j(date)가 30일 때 break로 반복문 탈출
					if (kopo24_i == 10 && kopo24_j == 31)
						break; // kopo24_i(month)이 10이라면 kopo24_j(date)가 31일 때 break로 반복문 탈출
					if (kopo24_i == 11 && kopo24_j == 30)
						break; // kopo24_i(month)이 11이라면 kopo24_j(date)가 30일 때 break로 반복문 탈출
					if (kopo24_i == 12 && kopo24_j == 31)
						break; // kopo24_i(month)이 12이라면 kopo24_j(date)가 31일 때 break로 반복문 탈출
				}
				System.out.printf("\n");	//줄바꾸기 
			}
		}

	}

}
