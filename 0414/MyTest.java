
public class MyTest {
	//netprice 세전가격 계산 메소드 선언
	
	public static int kopo24_netprice (int kopo24_price, double kopo24_rate) {
		//정수형 세전 가격 계산 값을 return한다
		return (int)(kopo24_price / (1 + kopo24_rate)); //소비자 가격 / (1 + 세율)
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//상품 가격 정수형 변수 선언
		int kopo24_price = 1234;
		//세율 실수형 변수 선언
		double kopo24_tax_rate = 0.1;
		
		//정수형 세전 가격 변수는 kopo24_netprice메소드에 kopo24_price, kopo24_tax_rate를 넣어 return되는 값이다  
		int kopo24_netprice = kopo24_netprice(kopo24_price, kopo24_tax_rate);
		//정수형 세금 가격 변수는 kopo24_price 에서 kopo24_netprice를 뺀 값이다 
		int kopo24_tax = kopo24_price - kopo24_netprice; 
		//출력부
		System.out.printf("*******************************************\n");
		System.out.printf("*      소비자가, 세전가격, 세금 계산      *\n");
		System.out.printf("소비자가격: %d, 세전: %d, 세금: %d\n", kopo24_price, kopo24_netprice, kopo24_tax);
		System.out.printf("*******************************************\n");
	}

}
