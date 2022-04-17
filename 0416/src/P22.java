
public class P22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Array 이용 비교
		// 비정형 비교 (룰이 애매한)는 배열을 이용할 수 있음
		
		//int (정수형) 배열 선언
		//배열을 0부터 시작한다 즉 1월: k24_iLMD[0] = 31 , 2월: k24_iLMD[1] = 28, 3월: k24_iLMD[2] = 31 ...
		int[] k24_iLMD = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		// 반복문 k24_i(month)는 1에서부터 시작해서 13미만까지 1씩 증가하는 반복문
		// 반복문 안에 반복문이 있는 중첩 반복문
		for (int k24_i = 1; k24_i < 13; k24_i++) {
			// k24_i (month)를 출력
			System.out.printf("%d월 =>", k24_i);
			// 반복문 k24_j(date)는 1에서 부터 32 미만까지 1씩 증가한다
			for (int k24_j = 1; k24_j < 32; k24_j++) {
				// k24_j (date)를 출력
				System.out.printf("%d", k24_j);
				//조건문 k24_iLMD 배열의 k24_i -1 번째(배열 0부터 시작) 인덱스 값이 k24_j(date)와 같다면 break로 반복문 탈출
				if (k24_iLMD[k24_i - 1] == k24_j)
					break;
				//마지막 날에는 , 안찍게 break 밑에 위치 
				System.out.printf(",");
			}
			//줄바꿈
			System.out.println();
		}
	}

}
