import java.text.DecimalFormat;

public class P29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//칸 맞춰 인쇄 (영수증)
		
		//String(문자열) 변수 k24_item은 "사과"이다
		String k24_item = "사과";
		//int (정수형) 변수 k24_unit_price, k24_num, k24_total 선언과 동시에 값을 준다 
		int k24_unit_price = 5000;
		int k24_num = 500;
		int k24_total = 0;

		//DecimalFormat import 필요
		//숫자 쉼표 형식에 맞게 설정한다 
		DecimalFormat k24_df = new DecimalFormat("###,###,###,###,###");

		// 헤더찍기
		System.out.printf("==========================================================\n");
		System.out.printf("%20.20s%8.8s%8.8s%8.8s\n", "품목", "단가", "수량", "합계");
		System.out.printf("==========================================================\n");

		// 값 찍기 (D2 폰트 사용) 
		//%20.20s -> k24_item , %10.10s->  k24_unit_price (k24_df.format 형태), %10.10s->k24_num (k24_df.format 형태)
		//%10.10s -> k24_unit_price(단가) * k24_num(수량) (k24_df.format 형태) 
		System.out.printf("%20.20s%10.10s%10.10s%10.10s\n", k24_item, k24_df.format(k24_unit_price), k24_df.format(k24_num),
				k24_df.format(k24_unit_price * k24_num));
		System.out.printf("==========================================================\n");

	}

}
