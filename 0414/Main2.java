
public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
	}

}
