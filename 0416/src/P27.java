
public class P27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// sin 그래프 그리기
		//360도 : 2π = 1도: x 
		
		//실수형 (double) kopo24_fSin을 선언
		double kopo24_fSin;
		//반복문 kopo24_i는 0이고 360 미만이며 1씩 커진다 (360번 반복)
		//0부터 360까지 kopo24_fSin 값 확인하기 위해 
		for (int kopo24_i = 0; kopo24_i < 360; kopo24_i++) {
			//Math.sin 함수는 괄호 한 double형인 변수를 받는다.  이때 변수의 단위는 라디안이여야 한다. 
			// 1 라디안 : 180도 / π 
			kopo24_fSin = Math.sin(kopo24_i * 3.141592 / 180);
			//출력 (sin 함수는 -1 ~ 1까지 나온다)
			System.out.printf("%d sin ==>  %f\n", kopo24_i, kopo24_fSin);
		}
		
		//0부터 360까지 kopo24_fSin 함수 그래프를 그리기 위해 이중 for문 사용 (빈칸 출력)
		for (int kopo24_i = 0; kopo24_i < 360; kopo24_i++) {
			kopo24_fSin = Math.sin(kopo24_i * 3.141592 / 180);
			//정수형 (int) kopo24_iSpace는 (1.0 - kopo24_fSin)에서 50을 곱한 값에 (int)로 형변환한 값이다 
			//kopo24_fSin은 실수형 (double)이기 때문에 사칙 연산 시 1.0과 같이 숫자 형식 맞춰야함
			int kopo24_iSpace = (int) ((1.0 - kopo24_fSin) * 50);
			//빈칸 출력을 위한 반복문 kopo24_j는 0이며 kopo24_iSpace 보다 작고 1씩 커진다
			for (int kopo24_j = 0; kopo24_j < kopo24_iSpace; kopo24_j++) {
				System.out.printf(" ");
			}
			//kopo24_fSin와 kopo24_iSpace값 출력 
			System.out.printf("*[%f][%d]\n", kopo24_fSin, kopo24_iSpace);
		}
	}

}
