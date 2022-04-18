
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class P8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 쉼표
		DecimalFormat k24_df = new DecimalFormat("###,###,###,###,###");
		// 현재 시간
		Calendar k24_calt = Calendar.getInstance();
		SimpleDateFormat k24_time = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
		SimpleDateFormat k24_date = new SimpleDateFormat("M월 d일");
		
		k24_calt.setTime(new Date());
		k24_calt.add(Calendar.DATE, 14);
//		System.out.println(k24_date.format(k24_calt.getTime()));
		
		String k24_iteamName1 = "퓨어에어 비말차단용마스크(최고급형)";
		String k24_itemCode1 = "1031615";
		int k24_price1 = 3000;
		int k24_amount1 = 1;
		
		String k24_iteamName2 = "슬라이드식명찰(가로형)(100호)";
		String k24_itemCode2 = "11008152";
		int k24_price2 = 1000;
		int k24_amount2 = 1;
		
		String k24_iteamName3 = "매직흡착 인테리어후크(알루미늄타입)";
		String k24_itemCode3 = "1020800";
		int k24_price3 = 1000;
		int k24_amount3 = 1;
		
		double k24_k24_taxRate = 0.1;
		double k24_k24_taxTotal = 0;
		double k24_tax = 0;
		
		int total = k24_price1 + k24_price2 + k24_price3;
		//System.out.println("판매합계: " +  k24_df.format(total));
		
		//과세합계 구하기 
		k24_k24_taxTotal = total / (1 + k24_k24_taxRate);
		k24_k24_taxTotal = (int) k24_k24_taxTotal;
		//System.out.println("과세 합계: " + k24_df.format(k24_k24_taxTotal));
		
		//부가세 구하기 
		k24_tax = k24_k24_taxTotal / 10.0 ;
		if (k24_tax % 10 == 0) {
			k24_tax = k24_tax;
		}else {
			k24_tax = (int)k24_tax +1; 
		}
		//System.out.println("부가세: " +  k24_df.format(k24_tax));
		
		//현재시간 출력
		//System.out.println(k24_time.format(k24_calt.getTime()));
		
		////////////////////출력부////////////////
		
		System.out.printf("                \"국민가게, 다이소\"              \n");
		System.out.printf("(주)아성다이소_분당서현점\n");
		System.out.printf("전화:031-702-6016\n");
		System.out.printf("본사:서울 강남구 남부순환로 2748 (도곡동)\n");
		System.out.printf("대표:박정부, 신호섭 231-81-82063\n");
		System.out.printf("매장:경기도 성남시 분당구 분당로53번길 11 (서현\n");
		System.out.printf("동)\n");
		System.out.printf("===============================================\n");
		System.out.printf("          소비자중심경영(CCM) 인증기업\n");
		//System.out.printf("%30s" , "소비자중심경영(CCM) 인증기업\n");
		System.out.printf("        ISO 9001 품질경영시스템 인증기업\n");
		System.out.printf("===============================================\n");
		System.out.printf("          %s (%s) %s\n", "교환/환불 14일", k24_date.format(k24_calt.getTime()),"이내,"  );
		System.out.printf("(전자)영수증, 결제카드 지참 후 구입매장에서 가능\n");
		System.out.printf("        포장/가격 택 훼손시 교환/환불 불가\n");
		System.out.printf("          체크카드 취소 시 최대 7일 소요\n");
		System.out.printf("===============================================\n");
		System.out.printf("[POS 1058231]               ");
		System.out.printf(k24_time.format(k24_calt.getTime()));
		System.out.printf("\n");
		System.out.printf("===============================================\n");
		//첫번째 아이템 부분
		System.out.printf("%5.14s",k24_iteamName1 );
		System.out.printf("       " +k24_df.format( k24_price1) );
		System.out.printf("%4d", k24_amount1);
		System.out.printf("" +k24_df.format(k24_price1 * k24_amount1)+"\n");
		System.out.printf("[%4s]\n", k24_itemCode1);
		//두번째 아이템 부분
		System.out.printf("%5.14s",k24_iteamName2 );
		System.out.printf("         " + k24_df.format(k24_price2));
		System.out.printf("%4d", k24_amount2);
		System.out.printf(k24_df.format(k24_price2 * k24_amount2)+"\n");
		System.out.printf("[%4s]\n", k24_itemCode2);
		//세번째 아이템 부분
		System.out.printf("%5.14s",k24_iteamName3 );
		System.out.printf("       " +k24_df.format(k24_price3));
		System.out.printf("%4d", k24_amount3);
		System.out.printf(k24_df.format( k24_price3 * k24_amount3)+"\n");
		System.out.printf("[%4s]\n", k24_itemCode3);
		
		System.out.printf("%20s", "과세합계");
		System.out.printf("                  ");
		System.out.printf(k24_df.format(k24_k24_taxTotal));
		System.out.printf("\n");
		System.out.printf("%21s", "부가세");
		System.out.printf("                    ");
		System.out.printf(k24_df.format(k24_tax));
		System.out.printf("\n");

		System.out.printf("-----------------------------------------------\n");
		System.out.printf("판매합계                                  ");
		System.out.printf(k24_df.format(total) +"\n");

		System.out.printf("===============================================\n");
		System.out.printf("신용카드                                  ");
		System.out.printf(k24_df.format(total) + "\n");
		System.out.printf("-----------------------------------------------\n");
		
		System.out.printf("우리카드");
		System.out.printf("%39s\n", "538720**********");
		System.out.printf("승인번호 77982843(0)");
		System.out.printf("%18s %4d\n", "승인금액", total);
		System.out.printf("===============================================\n");
		System.out.printf("        ");
		System.out.printf(k24_time.format(k24_calt.getTime()));		
		System.out.printf(" 분당서현점\n");
		System.out.printf("상품 및 기타 문의 : 1522-4400\n");
		System.out.printf("멤버십 및 샵다이소 관련 문의 : 1599-2211\n");
		System.out.printf("%30s","211282061015231\n");
		
		System.out.printf("-----------------------------------------------\n");
		System.out.printf(" ◈ 다이소 멤버십 앱 또는 홈페이지에 접속하셔서\n");
		System.out.printf(" 회원가입 후 다양한 혜택을 누려보세요! ◈ ");
	}

}
