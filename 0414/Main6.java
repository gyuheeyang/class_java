
public class Main6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		////p.16
		//과자을 저장하는 문자열 배열을 선언한다 
		String [] kopo24_item = {"홈런볼", "팝콘", "계란과자","새콤달콤","웨하스"}; 
		//각각 과자 가격(단가)을 저장하는 정수 배열을 선언한다
		int[] kopo24_price = {2500,1500,2000,500,1500};
		//각각 과자 수량을 저장하는 정수 배열을 선언한다
		int[]kopo24_amount = {10,2,1,3,5};
		//실수형 세율을 선언한다
		double kopo24_tax_rate = 0.1;
		//정수형 지불 금액을 선언하면서 0으로 초기화한다
		int kopo24_total_sum = 0;
		
		System.out.printf("*********************************************\n"); 
		System.out.printf("             규희가 지른 과자들\n\n");
		System.out.printf("항목              단가     수량         합계\n");
		//반복문 0부터 kopo24_item 배열의 길이만큼 반복한다(동적으로...), i는 1씩 증가한다
		for (int i = 0; i < kopo24_item.length; i++) {
			//정수형 kopo24_sum 변수를 선언 kopo24_sum은 i번째 kopo24_price(단가)의 값과 i번째 kopo24_amount(수량)을 곱한 값이다
			int kopo24_sum = kopo24_price[i] * kopo24_amount[i];
			//합계는 kopo24_sum를 계속 반복해서 더한 값이다 
			kopo24_total_sum = kopo24_total_sum + kopo24_sum;
			//kopo24_item의 i번째 인덱스, kopo24_price i번째 인덱스, kopo24_amount i번째 인덱스, kopo24_sum을 출력한다
			System.out.printf("%-10s\t %5d\t %5d %13d\n", kopo24_item[i], kopo24_price[i], kopo24_amount[i], kopo24_sum);
		}
		System.out.printf("*********************************************\n");
		System.out.printf("지불금액 : %33d\n", kopo24_total_sum);
		
		//정수형 과세금액 변수는 지불금액을 (세율 + 1)로 나눈 정수형 값이다 
		int kopo24_total_net_price = (int)(kopo24_total_sum/ (1 + kopo24_tax_rate));
		System.out.printf("과세금액 : %33d\n", kopo24_total_net_price);
		//정수형 세금은 지불금액에서 과세금액을 뺀 가격이다 
		int kopo24_tax = kopo24_total_sum - kopo24_total_net_price;
		System.out.printf("세    금 : %33d\n", kopo24_tax);
	}

}
