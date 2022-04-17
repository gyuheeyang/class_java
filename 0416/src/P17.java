
public class P17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 숫자형과 문자형의 비교

		// 정수형 변수 kopo24_iI 선언
		int kopo24_iI;
		// 실수형 변수 kopo24_iD 선언
		double kopo24_iD;

		// kopo24_iI은 정수형이기 때문에 정수형(3)으로 나눈다
		kopo24_iI = 10 / 3;
		// kopo24_iD은 실수형이기 때문에 실수형 (3.0)으로 나눈다
		kopo24_iD = 10 / 3.0;

		// 조건문 만약 kopo24_iI (정수형int)와 kopo24_iD(실수형 double)이 같다면
		if (kopo24_iI == kopo24_iD) {
			System.out.printf("equal\n"); // "equal\n"을 출력
		} else { // 만약 kopo24_iI (정수형int)와 kopo24_iD(실수형 double)이 같지 않다면
			System.out.printf("Not equal [%f][%f]\n", (double) kopo24_iI, kopo24_iD);
			// 22 line에서 kopo24_iI는 정수지만 앞에 (double)을 붙여 실수형으로 형을 변환했다 => 출력되는 값은 실수형이다
		}

		// 단지 유효숫자까지 표시된 것 뿐이지 실제 값은 다르다 => kopo24_iD = 10 /3.0 과 kopo24_iD == 3.333333은
		// 다른 값이다
		// 조건 kopo24_iD (double 실수형)의 값이 3.333333이라면
		if (kopo24_iD == 3.333333) {
			System.out.printf("equal\n"); // "equal\n"을 출력한다
		} else { // kopo24_iD (double 실수형)의 값이 3.333333이 아니라면
			System.out.printf("Not equal [3.333333][%f]\n", kopo24_iD);
		} // "Not equal [3.333333][%f]\n", kopo24_iD을 출력한다

		// kopo24_iD(double 실수형)을 kopo24_iD(int 정수형)으로 변환한 값과 같다고 선언 => kopo24_iD
		// =3.0이다(!!3.33333이 아니다!!)
		kopo24_iD = (int) kopo24_iD;

		// 조건 kopo24_iI(int 정수형)과 kopo24_iD(double 실수형)이 같다면
		if (kopo24_iI == kopo24_iD) {
			System.out.printf("equal\n"); // "equal\n" 출력
		} else { // 조건 kopo24_iI(int 정수형)과 kopo24_iD(double 실수형)이 같지 않다면
			System.out.printf("Not equal [%f][%f]\n", (double) kopo24_iI, kopo24_iD); // kopo24_iI (double 실수형),
																						// kopo24_iD(double 실수형)으로 출력
		}

		System.out.printf("Int로 인쇄 [%d][%f]\n", kopo24_iI, kopo24_iD); // kopo24_iI은 int 정수형이고(%d 사용) kopo24_iD은 double
																		// 실수형이다 (%f 사용)
		System.out.printf("double로 인쇄 [%f][%f]\n", (double) kopo24_iI, kopo24_iD); // int 정수형 kopo24_iI 앞에 double을 붙여서
																					// double 실수형으로 출력

		// 캐릭터 kopo24_a는 'c'이다 char는 '' 작은 따옴표 사용
		char kopo24_a = 'c';

		if (kopo24_a == 'b') { // kopo24_a가 'b'이면 / char를 비교할 때는 ==을 사용한다
			System.out.printf("a는 b이다\n"); // 출력
		}
		if (kopo24_a == 'c') { // kopo24_a가 'c'이면 ////kopo24_a는 'c'이므로 55line이 출력 될 것이다
			System.out.printf("a는 c이다\n"); // 출력
		}
		if (kopo24_a == 'd') { // kopo24_a가 'd'이면
			System.out.printf("a는 d이다\n"); // 출력
		}

		// 문자열 kopo24_aa 는 "abcd"이다
		String kopo24_aa = "abcd";
		if (kopo24_aa.equals("abcd")) { // string kopo24_aa가 "abcd"과 같다면
										// => 문자열을 비교할 때는 문자열 이름.equals("비교하고싶은 문자열")을 사용한다 (== 사용할 수 없음!!)
			System.out.printf("aa는 abcd이다\n"); // 출력
		} else { //// string kopo24_aa가 "abcd"과 같지 않다면
			System.out.printf("aa는 abcd가 아니다\n");
		}

		boolean kopo24_bb = true; // 논리형 boolean은 true, false 값만 갖는다, kopo24_bb은 true이다
		if (!!kopo24_bb) { // 논리연산자 !는 not의 의미이다 즉 !kopo24_bb은 true가 아닌 값 false/ !!!kopo24_bb는 false가 아닌 값
							// true이다
			System.out.printf("bb가 아니고 아니면 참이다\n");
		} else {
			System.out.printf("bb가 아니고 아니면 거짓이다\n");
		}
	}

}
