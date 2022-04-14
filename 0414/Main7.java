import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;



public class Main7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//단순 환전 계산
		//정수형 환전하고 싶은 한화 전체금액 변수 선언
		int kopo24_MyWon = 1000000; 
		//실수형 달러 환율 선언
		double kopo24_MoneyEx = 1238.21;
		//실수형 수수료 선언
		double kopo24_commission = 0.003;
		
		//환언 받는 미화(정수형)은 한화 전체 금액을 환율로 나눈 값이다, 정수형으로 버림처리한다
		int kopo24_usd = (int)(kopo24_MyWon/kopo24_MoneyEx);
		//거스름돈 (정수형)은 전체 금액에서 환율과 환전 받은 금액을 곱한 값을 뺀 값이다, 정수형으로 버림 처리한다
		int kopo24_remain = (int)(kopo24_MyWon - kopo24_usd*kopo24_MoneyEx);
		
		//출력
		System.out.printf("**************************************************************************************************\n");
		System.out.printf("*                                        수수료 없이 계산                                        *\n");
		System.out.printf(" 총 한화 환전 금액: %d원 => 미화: %d달러, 잔돈: %d원\n", kopo24_MyWon, kopo24_usd, kopo24_remain);
		System.out.printf("**************************************************************************************************\n");
		
		
		//수수료 포함 환전 계산 (1)
		
		//실수형 변수 kopo24_ComPerOne(1달러 당 수수료)는 kopo24_MoneyEx(달러 환율)과 kopo24_commission(수수료) 선언을 곱한 값이다
		double kopo24_ComPerOne = kopo24_MoneyEx * kopo24_commission;
		//실수형 변수 kopo24_totalcom는 총 수수료를 의미하며 kopo24_usd(미화)와 kopo24_ComPerOne(1달러 당 수수료)을 곱한 값이다 
		double kopo24_totalcom = kopo24_usd * kopo24_ComPerOne;
		
		//출력
		System.out.printf("**************************************************************************************************\n");
		System.out.printf("*                                          수수료 계산                                            *\n");
		System.out.printf("총 수수료 : %f원 => 미화 : %d달러, 달러당 수수료 : %f원\n", kopo24_totalcom, kopo24_usd, kopo24_ComPerOne);
		System.out.printf("**************************************************************************************************\n");
		
		
		//수수료 포함 환전 계산 (2)
		
		//총 수수료를 의미하며 소수점 자리 올림처리할 정수형 kopo24_i_totalcom 선언 (수수료를 소수점 단위로 받을 수는 없다!)
		int kopo24_i_totalcom;
		//총 수수료 올림 처리 
		//조건문 47~48 line은 kopo24_totalcom(실수형)과 (double)((int)kopo24_totalcom))가 같지 않으면 (int)kopo24_totalcomdp 1을 더해 올림 처리를 한다는 의미이다
		// 49~50 line은 kopo24_totalcom(실수형)과 (double)((int)kopo24_totalcom))가 같으면 소수점이 없는 값이기 때문에 1을 더하는 올림 처리를 하지 않는다
		if (kopo24_totalcom != (double)((int)kopo24_totalcom)) { //kopo24_totalcom는 double이므로 비교를 위해 kopo24_totalcom을 정수형으로 변환한 값을 double로 바꾼다
			kopo24_i_totalcom = (int)kopo24_totalcom + 1;
		}else {
			kopo24_i_totalcom = (int)kopo24_totalcom;
		}
		
		System.out.printf("**************************************************************************************************\n");
		System.out.printf("*                                         수수료 적용 환전                                       *\n");
		System.out.printf("총 수수료 : %d원 => 미화 : %d달러, 달러당 수수료 : %f원\n", kopo24_i_totalcom, kopo24_usd, kopo24_ComPerOne);
		
		
		//kopo24_remain(거스름돈)은 한화 - (미화 * 환율) - 총 수수료를 뺀 값을 정수형(int)으로 바꾼 값이다
		kopo24_remain = (int)( kopo24_MyWon - kopo24_usd * kopo24_MoneyEx - kopo24_i_totalcom);
		//출력
		System.out.printf("총 한화 환전 금액 : %d원 => 미화 : %d달러, 수수료 징구 : %d원, 잔돈 : %d원\n", kopo24_MyWon, kopo24_usd, kopo24_i_totalcom, kopo24_remain);
		System.out.printf("**************************************************************************************************\n");
		
		
		//수수료 포함 환전 계산 (3)
		
		//kopo24_usd(미화)는 한화 환전 금액에서 달러 환율과 1달러당 수수료를 더한 값을 나누고 정수형으로 변환한 값이다 
		//100만원 안에서 환전을 해줘야 하기 때문에 ...
		kopo24_usd = (int) (kopo24_MyWon / (kopo24_MoneyEx + kopo24_ComPerOne));
		//kopo24_totalcom(총 수수료)는  kopo24_usd(미화)에서 kopo24_ComPerOne(1달러당 수수료를 뺀 값이다)
		kopo24_totalcom = kopo24_usd * kopo24_ComPerOne;
		
		//수수료 올림 처리 
		// kopo24_totalcom(총 수수료)가 int(정수형)로 형변환(소수점 지우기 위해)하고 다시 double(실수형)으로 형변환(비교 위해)한 값과
		//같지 않으면 1을 더한다 (소수점을 올림 하려고)
		if (kopo24_totalcom != (double)((int) kopo24_totalcom)) {
			kopo24_i_totalcom = (int) kopo24_totalcom + 1;
		}else {											// 두 값이 같으면 소수점 자리가 없기 때문에 1 더할 필요 없음
			kopo24_i_totalcom = (int) kopo24_totalcom ;
		}
		//출력
		System.out.printf("**************************************************************************************************\n");
		System.out.printf("*                                     (정확한) 수수료 적용 환전                                  *\n");
		System.out.printf("총 수수료 : %d원 => 미화 : %d달러, 달러 당 수수료 : %f원\n", kopo24_i_totalcom, kopo24_usd, kopo24_ComPerOne);
		//kopo24_remain(거스름돈)은 kopo24_MyWon(한화) 에서 kopo24_usd(달러)와 kopo24_MoneyEx(환율) 곱한 값을 빼고 총 수수료까지 뺀 값을 
		//int 처리한 값이다
		kopo24_remain = (int) (kopo24_MyWon - kopo24_usd * kopo24_MoneyEx - kopo24_i_totalcom);
		//출력
		System.out.printf("총 한화 환전 금액 : %d원 => 미화 : %d달러, 수수료 징구: %d원, 잔돈: %d원\n", kopo24_MyWon, kopo24_usd, 
				kopo24_i_totalcom, kopo24_remain);
		System.out.printf("**************************************************************************************************\n");
		
		
		
		//콤마 찍기
		//DecimalFormat 클래스를 사용하여 Format을 변경할 수 있다 
		//돈은 영어 기준으로 세자리마다 콤마를 찍기 때문에 그 포맷에 맞게 변경
		DecimalFormat kopo24_df = new DecimalFormat(" ###,###,###,###,###,### ");
		
		System.out.printf("**************************************************************************************************\n");
		System.out.printf("*                                      콤마찍기, 날짜 적용                                       *\n");
		// DecimalFormat 결과값은 숫자 타입이 아닌 String으로 받기 때문에 %s를 사용한다
		System.out.printf("총 수수료 : %s원 => 미화 : %s달러, 달러 당 수수료 : %f원\n",
				kopo24_df.format(kopo24_i_totalcom),
				kopo24_df.format(kopo24_usd),
				kopo24_ComPerOne);
		
		kopo24_remain = (int) (kopo24_MyWon - kopo24_usd * kopo24_MoneyEx - kopo24_i_totalcom);
		System.out.printf("총 한화 환전 금액 : %s원 => 미화 : %s달러, 수수료 징구: %s원, 잔돈: %s원\n", kopo24_df.format(kopo24_MyWon), kopo24_df.format(kopo24_usd), 
				kopo24_df.format(kopo24_i_totalcom), kopo24_df.format(kopo24_remain));
		
		//현재 날짜, 시간 찍기
		//Calendar는 추상 클래스이기 때문에 직접 new 하여 객체 생성이 불가하고, Calendar.getInstance() 메소드를 이용한다
		Calendar kopo24_calt = Calendar.getInstance();
		//SimpleDateFormat 클래스를 원하는 형식으로 생성해준 뒤 date클래스를 포맷 변경해주면 된다
		//대소문자 주의 "YYYY(연도)/MM(달)/dd(일) HH(시간):mm(분):ss(초)"
		SimpleDateFormat kopo24_sdt = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
		//최종 실행 시간을 구하기 위해 kopo24_sdt로 설정한 포맷으로 getTime을 한다
		System.out.printf("최종 실행 시간 %s\n", kopo24_sdt.format(kopo24_calt.getTime()));
		System.out.printf("**************************************************************************************************\n");
	
	}

}
