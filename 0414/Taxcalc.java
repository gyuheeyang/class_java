
public class Taxcalc {

	public static int taxcal (int kopo24_val, int kopo24_rate) {
		//세금 변수 선언
		int kopo24_ret;
		//(double)물건값 * (double)세율/100.0이 물건값*세율/100과 같다면 소수점 값이 없다는 뜻이므로 올림 처리 필요 없다
		if (((double)kopo24_val * (double)kopo24_rate / 100.0) == kopo24_val*kopo24_rate/100) {
			kopo24_ret = kopo24_val * kopo24_rate / 100;
		}else {	//같지 않다면 소수점 값이 있다는 뜻이기 때문에 올림 처리한다
			kopo24_ret = kopo24_val * kopo24_rate / 100 +1 ;	
		}
		return kopo24_ret;	//kopo24_ret 값을 리턴한다
	}


public static void main(String[] args) {
	// TODO Auto-generated method stub
	//세전 물건값 변수 선언 
	int kopo24_val = 271;
	//세금 5% 변수 선언
	int kopo24_rate = 5;
	//세금은 taxcal 메소드의 return값이다 
	int kopo24_tax = taxcal (kopo24_val,kopo24_rate);
	
	System.out.printf("**************************************\n");
	System.out.printf("*             단순 세금 계산            *\n");
	//100을 double 형태로 하지 않으면 계산 실수 발생하기 때문에 주의 
	System.out.printf("실제세금계산: %f\n", kopo24_val * kopo24_rate / 100.0);	
	System.out.printf("세전계산: %d 세금: %d 세포함가격: %d\n", kopo24_val, kopo24_tax, kopo24_val + kopo24_tax);
	System.out.printf("**************************************\n");
	}
}