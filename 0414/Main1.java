
public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//#1 
		
		//정수형 변수 kopo24_ii를 선언한다
		int kopo24_ii;
		//kopo24_ii 는 1 + 2
		kopo24_ii = 1 + 2;
		//kopo24_ii 을 출력한다 
		System.out.printf("#1-1 : %d\n", kopo24_ii);
		
		//kopo24_ii는 1 + 2 * 3이다
		kopo24_ii = 1 + 2 * 3;
		//kopo24_ii 출력
		System.out.printf("#1-2 : %d\n", kopo24_ii);
		
		//#2. 누적하기, 합구하기 
		
		//정수형 변수 선언 
		int kopo24_sum;
		//변수 초기화
		kopo24_sum = 0;
		
		//반복문을 통해 1부터 100까지 합을 누적해 대입
		for (int i = 1; i < 101; i++) {
			kopo24_sum = kopo24_sum + i;
		}
		
		//결과값 출력
		System.out.printf("#2 : %d\n", kopo24_sum);
		//위의 결과값에서 100을 나눈 값 출력
		System.out.printf("#2-2 : %d\n", kopo24_sum/100);
		
		//정수형 배열 선언
		int [] kopo24_v = {1,2,3,4,5};
		//정수형 변수 선언
		int kopo24_vSum ;
		//변수 초기화
		kopo24_vSum = 0;
		
		//반복문을 통해 kopo23_v배열의 0부터 5 index의 값을 더한다
		for (int i =0; i < 5; i++) {
			kopo24_vSum = kopo24_vSum +kopo24_v[i];
		}
		
		//kopo24_vSum의 값을 출력
		System.out.printf("#2-3 : %d\n" , kopo24_vSum);
		
		
		//#3 정수형 변수의 나눗셈은 정수 범위에서 버림처리, 올림처림 
		
		//kopo24_ii는 정수형이기 때문에 1000을 3으로 나눈 333.33333...이 나오지 않음
		kopo24_ii = 1000/3;
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
			//i는 0부터 시작하기 때문에 1을 더한다 (line 64)
			if (((i + 1) % 5) == 0){
				System.out.printf("\n");
			}
		}
		
		//#4 원하는 자릿수 반올림, 버림 처리
		
		//12345원은 10원 이하 버려서 처리하기
		kopo24_ii = 12345;	
		//12345를 10으로 나눠 1234.5로 만들고 10을 곱해 1의 자리의 5을 버린다
		int kopo24_j = (kopo24_ii/10) * 10 ;	
		//값 출력
		System.out.printf( "#4-1 : %d\n", kopo24_j);

		//12345원은 10원 이하 반올림 처리하기
		kopo24_ii = 12345;
		//12345에서 5를 더하면 123450가 된다 1의 자리수가 5보다 크거나 같으면 10의 자리의 값이 바뀌기 때문에 반올림이 가능하다
		kopo24_j = ((kopo24_ii + 5)/ 10)* 10;
		//값을 출력한다
		System.out.printf("#4-2 : %d\n", kopo24_j);
		
		//위의 식 검증
		kopo24_ii = 12345;
		kopo24_j = ((kopo24_ii+5)/ 10)* 10;
		System.out.printf("#4-2 : %d\n", kopo24_j);
		
		//#4-X 100원 이하 버림 올림 ,  1000원 이하 버림 반올림을 구현하라
		
		//100원 이하 버림
		kopo24_ii = 12345;
		kopo24_j = (kopo24_ii/ 100) * 100;
		System.out.printf("#4-X-1 : %d\n", kopo24_j);
		
		//100원 이하 올림
		kopo24_ii = 12345;
		kopo24_j = ((kopo24_ii + 99)/ 100) * 100;
		System.out.printf("#4-X-2 : %d\n", kopo24_j);
		
		//1000원 이하 버림 
		kopo24_ii = 12345;
		kopo24_j = (kopo24_ii/ 1000) * 1000;
		System.out.printf("#4-X-3 : %d\n", kopo24_j);
		
		//1000원 이하 반올림 
		kopo24_ii = 12345;
		kopo24_j = ((kopo24_ii+500)/ 1000)* 1000;
		System.out.printf("#4-X-4  : %d\n", kopo24_j);
	
		
		//#5.소수점 이하에서는 어떻게 할까? 
		
		int kopo24_MyVal = 14 / 5;	//이 값은 2.8 , 소수점 이하 버리면 2, 반올림하면 3
		System.out.printf("#5-1 : %d\n", kopo24_MyVal);	//출력되는 값은 버린 값 2가 나온다
		
		//실수형 변수를 선언한다
		double kopo24_MyValF; 
		
		//식에서 0.0 double 형태로 쓰지 않았지 때문에 정확한 값이 나오지 않는다
		kopo24_MyValF = 14 / 5; 
		System.out.printf("#5-2 : %f\n", kopo24_MyValF);
		//double 형태로 사용 했기 때문에 소수점 값까지 나온다 
		kopo24_MyValF = 14.0 / 5; 
		System.out.printf("#5-3 : %f\n", kopo24_MyValF);
		//위의 값에서 0.5 를 더한 값이 출력된다
		kopo24_MyValF = (14.0)/5 + 0.5;  
		System.out.printf("#5-4 : %f\n", kopo24_MyValF);
		//14.0를 int(정수형)로 묶었기 때문에 2 + 0.5 한 값이 출력된다 
		kopo24_MyValF = (int)(14.0)/5 + 0.5;  
		System.out.printf("#5-5 : %f\n", kopo24_MyValF);
	}

}
