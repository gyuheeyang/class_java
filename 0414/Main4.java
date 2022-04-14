
public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//#4 원하는 자릿수 반올림, 버림 처리
		
		//12345원은 10원 이하 버려서 처리하기
		int kopo24_ii = 12345;	
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
	}

}
