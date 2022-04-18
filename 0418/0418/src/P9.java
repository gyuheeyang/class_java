import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class P9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수와 메소드
		// 5강 3번 실습부터 해야 됨

		// 상품
		String[] k24_itemName = { "해피홈 SAFE365 핸드", "(G)LH원형유리화병 10", "상투과자E", "더블링 나일론 깡 롤", "해피홈 SAFE 핸드워시",
				"농심 신라면 120*5", "(대)국내산삼겹살찌개", "오뚜기 진 비빔변 156g", "GAP 죽장사과 4-6입", "순 유기농 바나나(봉)", "피코크 탄두리 닭가슴",
				"(달콤)순살 닭강정(g)", "DZ주니어양말3족C_BK", "DZ주니어양말3족C_WH", "프리미엄생연어초밥", "피코크 들깨미역국500", "남양 맛있는 우유 GT 저",
				"녹차원흑당시럽10입", "진라면소컵(매)65g*6", "케라시스 앰플 트리트", "푸르밀 미숫가루 우유", "자일로스 갈색설탕500g", "CJ 비비고칩 20G",
				"비비고 들깨미역국500", "흑원당 말차밀크티", "1+등급란 10개입 특", "동원양반볶음김치기획" };
		// 단가
		int[] k24_price = { 7500, 6900, 5980, 3300, 5500, 3380, 6610, 2750, 10800, 5980, 2480, 7920, 4980, 4980, 7130,
				3980, 4480, 4980, 3210, 6950, 2980, 1990, 1980, 3980, 4480, 3480, 7980 };
		// 수량
		int[] k24_num = { 2, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 2, 1, 1 };
		// 면세 유무
		boolean[] k24_taxFree = { false, false, false, false, false, false, true, false, true, true, false, false,
				false, false, false, false, true, false, false, false, false, false, false, false, false, true, false };

		// 쉼표
		DecimalFormat k24_df = new DecimalFormat("###,###,###,###,###");
		// 현재 시간
		Calendar k24_calt = Calendar.getInstance();
		SimpleDateFormat k24_timeForParking = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss"); // 자동차 입출차
		SimpleDateFormat k24_timeForPay = new SimpleDateFormat("YYYY/MM/dd HH:mm"); // 결제

		// 총 품목 수량
		int k24_itemNum = 0;
		for (int i = 0; i < k24_num.length; i++) {
			k24_itemNum = k24_itemNum + k24_num[i];
		}
		// System.out.println("수량" +k24_itemNum);

		// 면세물품, 과세물품
		int k24_totalTaxFreeItem = 0;
		double k24_totalTaxItem = 0;
		for (int k24_i = 0; k24_i < k24_taxFree.length; k24_i++) {
			if (k24_taxFree[k24_i] == true) { // 면세
				k24_totalTaxFreeItem = k24_totalTaxFreeItem + k24_price[k24_i];
			}
		}
		// System.out.println("면세:" + k24_df.format(k24_totalTaxFreeItem));

		// 합계
		int k24_total = 0;
		for (int k24_j = 0; k24_j < k24_price.length; k24_j++) {
			k24_total = k24_total + k24_price[k24_j];
		}
		// System.out.println("합계" + k24_df.format(k24_total));

		// 부가세
		double k24_tax = 0;
		double k24_rate = 0.1;

		// 과세 물품 = (합계 - 면세)/ (1 + 부가세)
		k24_totalTaxItem = ((double) k24_total - (double) k24_totalTaxFreeItem) / (1.0 + k24_rate);
		if (k24_totalTaxItem / 10 == 0) {
			k24_totalTaxItem = k24_totalTaxItem;
		} else {
			k24_totalTaxItem = (int) k24_totalTaxItem ;
		}
		// System.out.println("과세물품" + k24_df.format(k24_totalTaxItem));

		// 부가세
		k24_tax = k24_totalTaxItem / 10.0;
		// System.out.println("부가세" + k24_df.format(k24_tax));

		///////////////////////// 출력부///////////////////////
		System.out.printf("Emart");
		System.out.printf("%29s\n", "이마트 죽전점 (031)888-1234");
		System.out.printf("%37s\n", "206-86-50913 강희석");
		System.out.printf("%31s\n", "용인 수지구 포은대로 552");
		System.out.printf("\n");

		System.out.printf("영수증 미지참시 교환/환불 불가\n");
		System.out.printf("정상상품에 한함, 30일 이내 (신선 7일)\n");
		System.out.printf("※ 일부 브랜드매장 제외 (매장 고지물참조)\n");
		System.out.printf("교환/환불 구매점에서 가증(결제카드 지참)\n");
		System.out.printf("\n");
		System.out.printf("[구 매]" + k24_timeForPay.format(k24_calt.getTime()));
		System.out.printf("%18s", "POS: 0011-9861\n");
		System.out.printf("----------------------------------------\n");
		System.out.printf("%11s %11s %3s %3s\n", "상품명", "단 가", "수량", "금 액");
		System.out.printf("----------------------------------------\n");
		
		//면세
		String k24_star ; 
		for (int k24_i = 0; k24_i < k24_itemName.length; k24_i++) {
			if (k24_taxFree[k24_i] == true) {
				k24_star = "*";
			}else {
				k24_star = " ";
			}
			
			// 아이템 이름 출력
			System.out.printf(k24_star);
			System.out.printf("%s", k24_subStrByte(k24_itemName[k24_i],20));			
			System.out.printf("%7s", k24_df.format(k24_price[k24_i]));
			System.out.printf("%4d", k24_num[k24_i]);
			System.out.printf("%8s", k24_df.format(k24_price[k24_i] * k24_num[k24_i]));
			System.out.printf("\n");
			if ((k24_i + 1) % 5 == 0) {
				System.out.printf("----------------------------------------\n");
			}
		}
		
		
		System.out.printf("%25.25s", "총 품목 수량");
		System.out.printf("%10d\n", k24_itemNum);
		System.out.printf("%26.26s", "(*)면 세 물 품");
		System.out.printf("    " + k24_df.format(k24_totalTaxFreeItem));
		System.out.printf("\n");
		System.out.printf("%26.26s", "과세 물품");
		System.out.printf("    " + k24_df.format(k24_totalTaxItem));
		System.out.printf("\n");
		System.out.printf("%27.27s", "부 가 세");
		System.out.printf("     " + k24_df.format(k24_tax));
		System.out.printf("\n");
		System.out.printf("%28.28s", "합    계");
		System.out.printf("   " + k24_df.format(k24_total));
		System.out.printf("\n");
		System.out.printf("----------------------------------------\n");
		System.out.printf("%-19s", "0012 KEB 하나");
		System.out.printf("%19.19s\n", "541707**0484/35860658");
		System.out.printf("%-19s", "카드결제(IC)");
		System.out.printf("%7.7s", "일시불/");
		System.out.printf(k24_df.format(k24_total));
		System.out.printf("\n");
		System.out.printf("----------------------------------------\n");
		System.out.printf("          [신세계포인트 적립]\n");
		System.out.printf("양*희 고객님의 포인트 현황입니다\n");
		System.out.printf("%-19s", "금회발생포인트");
		System.out.printf("%6.6s", "9350**9995");
		System.out.printf("%7.7s\n", "164");
		System.out.printf("%-19s", "누계(가용)포인트");
		System.out.printf("%5.5s", k24_df.format(5637));
		System.out.printf("%1s%6.6s%1s\n", "(", k24_df.format(5473), ")");
		System.out.printf("*신세계포인트 유효기간은 2년입니다.\n");
		System.out.printf("----------------------------------------\n");
		System.out.printf("   구매금액기준 무료주차시간 자동부여\n");
		System.out.printf("%-14s", "차량번호:");
		System.out.printf("%20.20s\n", "34저****");
		System.out.printf("%s", "입차시간:");
		System.out.printf("%31.31s\n", k24_timeForParking.format(k24_calt.getTime()));
		System.out.printf("----------------------------------------\n");
		System.out.printf("%-19s", "캐셔: 084599 양규희");
		System.out.printf("%16.16s\n\n", "1150");
		System.out.printf("           20210303/00119861/00164980/31");
	}
	
	
	   public static String k24_subStrByte(String k24_source, int k24_cutLength) {
	         if (!k24_source.isEmpty()) {
	            k24_source = k24_source.trim();// 
	            if (k24_source.getBytes().length < k24_cutLength) {
	               for (int k24_i = k24_cutLength - k24_source.getBytes().length; k24_i > 0; k24_i--) {
	                  k24_source += " ";
	               }
	               return k24_source;
	            } else {
	               StringBuffer k24_sb = new StringBuffer(k24_cutLength);
	               int k24_cnt = 0;
	               for (char k24_ch : k24_source.toCharArray()) {
	                  k24_cnt += String.valueOf(k24_ch).getBytes().length;
	                  if (k24_cnt > k24_cutLength)
	                     break;
	                  k24_sb.append(k24_ch);
	               }
	               
	               if(k24_sb.toString().getBytes().length == 19) {
	                  k24_sb.append(" ");
	               }
	               
	               return k24_sb.toString();
	            }
	         } else {
	            return "";
	         }
	      }
	
	
	
}
