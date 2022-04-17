
public class P28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//피라미드 찍기 
		
		//정수형 변수 k24_n, k24_m 선언
		int k24_n, k24_m;
		//k24_m 은 20이고 k24_n 은 1이다 
		k24_m =20; k24_n =1;
		
		while(true) {	//무한반복 선언
			//반복문 k24_i은 0이고 k24_m보다 작을 때까지 1씩 증가 => " " 빈칸 출력
			for (int k24_i = 0; k24_i <k24_m; k24_i++) System.out.printf(" ");
			//반복문 k24_i은 0이고 k24_n보다 작을 때까지 1씩 증가 => "*" 별출력
			for (int k24_i = 0; k24_i <k24_n; k24_i++) System.out.printf("*");
			System.out.println();
			
			//while문이 돌 때마다 k24_m(빈칸)은 1씩 감소한다
			k24_m = k24_m - 1;
			//while문이 돌 때마다 k24_n(별)은 2씩 증가한다
			//이를 통해 한 줄씩 넘어갈 때마다 별은 증가하고 빈칸은 줄어들어 피라미드의 형태가 나오게 됨 
			k24_n = k24_n +2;
			
			//조건문 k24_m(빈칸)이 0보다 작다면 while문 탈출한다 
			if (k24_m < 0)
				break;
		}
	}

}
