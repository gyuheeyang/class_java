import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class P7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 영수증 출력
		int k24_Price = 33000;
		double k24_taxRate = 0.1;
		double k24_realPrice = 0;
		// 쉼표
		DecimalFormat k24_df = new DecimalFormat("###,###,###,###,###");
		// 현재 시간
		Calendar k24_calt = Calendar.getInstance();
		SimpleDateFormat k24_time = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
		//부가세 계산 
		k24_realPrice = k24_Price /(1 + k24_taxRate);
		if (k24_realPrice % 10 == 0) {
			//k24_realPrice = (int)k24_realPrice;
		}else {
			k24_realPrice = (int)k24_realPrice +1 ;
		}
		double tax =0;
		tax = k24_realPrice/ 10;
		System.out.println("부가세:@@@@@@@@@@@@@@" + tax);
		
		
//		System.out.println("금액: " + k24_df .format(k24_realPrice) );
//		System.out.println("부가세: " + k24_df .format(k24_Price - k24_realPrice));
//		System.out.println("합계: " + k24_df .format(k24_Price));
//		System.out.println(k24_time.format(k24_calt.getTime()));
		
		//출력부
		System.out.printf("신용승인\n");
		System.out.printf("단말기  : 2N68665898             전표 번호 : 041218\n");
		System.out.printf("가맹점  : 한양김치찌개\n");
		System.out.printf("주  소  : 경기 성남시 분당구 황새울로351번길 10 .\n");
		System.out.printf("1층\n");
		System.out.printf("대표자  : 유창신\n");
		System.out.printf("사업자  : 752-53-00558               TEL  : 7055695\n");
		
		System.out.printf("- - - - - - - - - - - - - - - - - - - - - - - - - -\n");
		System.out.printf("금액 %46s", k24_df .format(k24_realPrice) );
		System.out.println();
		System.out.printf("부가세 %44s", k24_df .format(k24_Price - k24_realPrice  ));
		System.out.println();
		System.out.printf("합계 %46s", k24_df .format(k24_Price) );
		System.out.println();
		System.out.printf("- - - - - - - - - - - - - - - - - - - - - - - - - -\n");
		
		System.out.printf("우리카드\n");
		System.out.printf("카드번호 : 5387-20**-****4613(S)             일시불\n");
		System.out.printf("거래일시 : " + k24_time.format(k24_calt.getTime()));
		System.out.println();
		System.out.printf("승인번호 : 70404427\n");
		System.out.printf("거래번호 : 357734873739\n");
		System.out.printf("매입 : 비씨카드사                   가맹 : 720068568\n");
		System.out.printf("알림 : EDC 매출표\n");
		System.out.printf("문의 : TEL)1544-4700\n");
		System.out.printf("- - - - - - - - - - - - - - - - - - - - - - - - - -\n");
		System.out.printf("                   * 감사합니다 * \n");
		System.out.printf("                                  표준V2.08_20200212\n");
	}
	

}
