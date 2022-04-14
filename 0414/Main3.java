
public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//#3 정수형 변수의 나눗셈은 정수 범위에서 버림처리, 올림처림 
		
		//kopo24_ii는 정수형이기 때문에 1000을 3으로 나눈 333.33333...이 나오지 않음
		int kopo24_ii = 1000/3;
		//kopo24_ii 출력
		System.out.printf("#3-1 : %d\n", kopo24_ii);
		
		//1000dmf 3으로 나눈 나머지 값을 구한다
		kopo24_ii = 1000%3;
		//kopo24_ii 출력
		System.out.printf("#3-2 : %d\n", kopo24_ii);
		
		//반복문을 통해 0부터 19까지 반복
		for (int i =0; i < 20; i++) {
			//0부터 19까지 하나씩 출력
			System.out.printf("#3-3 : %d  ", i);
			//1부터 1씩 증가한 값을 5로 나눈 나머지가 0이면 다음줄로 넘어간다
			if (((i + 1) % 5) == 0){
				System.out.printf("\n");
			}
		}
		
	}

}
