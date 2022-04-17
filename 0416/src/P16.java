
public class P16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정수형 변수 2개 선언
		int kopo24_iA, kopo24_iB;
		// 0으로 값 초기화
		kopo24_iA = 0;
		//중첩 while문 구조로 while문 안에 while문이 존재한다
		while (true) {
			// kopo24_iB는 바깥 while문이 한번씩 돌때마다 초기화 된다
			kopo24_iB = 0;
			while (true) {
				// 안쪽 반복문이 한번 돌 때마다 별 1개를 찍는다
				System.out.printf("*");
				// kopo24_iA값과 kopo24_iB의 값이 같으면 break로 while문을 빠져나온다
				// ex) kopo24_iA =3 이고 kopo24_iB=3이라면 A3 B1/A3 B2/A3 B3 이런식으로 A의 값만큼 실행 되므로
				// 역삼각형의 형태가 나온다
				if (kopo24_iA == kopo24_iB) {
					break;
				}
				//kopo24_iB는 while문이 한 번 돌 때마다 1씩 증가한다
				kopo24_iB++;
//						line 26~ 27처럼 sysout을 찍어보면 반복문 이해가 쉽다 
//						System.out.print("A" +kopo24_iA);
//						System.out.print("B" +kopo24_iB);
			}
			// 줄바꾸기
			System.out.printf("\n");
			// kopo24_i값을 증가시켜 변화문의 역할
			kopo24_iA++;
			// 증가된 kopo24_i값이 30이 되면 break되어 while문을 탈출한다 즉,별 세로로 30
			if (kopo24_iA == 30) {
				break;
			}
		}
	}

}
