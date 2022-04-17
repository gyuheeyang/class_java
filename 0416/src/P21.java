
public class P21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// case문 비교 (Switch,case가 적합하지 않은 사례, 또한 break문장이 복잡해지는 사례)
		
		// 반복문 k24_i(month)는 1에서부터 시작해서 13미만까지 1씩 증가하는 반복문
		// 반복문 안에 반복문이 있는 중첩 반복문
		for (int k24_i = 1; k24_i < 13; k24_i++) {
			// k24_i (month)를 출력
			System.out.printf("%d월 => ", k24_i);
			// LOOP는 k24_j(date)가 1에서 부터 32 미만까지 1씩 증가하는 반복문 
			LOOP: for (int k24_j = 1; k24_j < 32; k24_j++) {
				// k24_j (date)를 출력
				System.out.printf("%d,", k24_j);
				//switch/case 문은 if 문과 비슷하지만 좀 더 정형화된 조건 판단문이다
				//입력 변수 k24_i가 4일 때 , 6일 때, 7일 때, 9일 때, 11일 때 -> line 26으로 이동
				switch (k24_i) {
				case 4:
				case 6:
				case 7:
				case 9:
				case 11:
					//k24_j (date)가 30이라면
					if (k24_j == 30)
						//LOOP 반복문을 탈출 (이런 표현은 거의 사용하지 않음)
						//LOOP라는 표시자 반드시 필요하다 
						break LOOP;
					//반복문을 탈출
					break;
				//입력 변수 k24_i가 2일 때 -> line 35으로 이동
				case 2:
					//k24_j (date)가 28이라면
					if (k24_j == 28)
						//LOOP 반복문을 탈출 (이런 표현은 거의 사용하지 않음)
						//LOOP라는 표시자 반드시 필요하다 
						break LOOP;
					//반복문을 탈출
					break;
				}

			}
			//줄 바꿈 
			System.out.println();
		}
	}

}
