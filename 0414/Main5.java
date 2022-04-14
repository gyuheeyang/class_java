
public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//#5.소수점 이하에서는 어떻게 할까? 
		
		int kopo24_MyVal = 14 / 5;	//이 값은 2.8 , 소수점 이하 버리면 2, 반올림하면 3
		System.out.printf("#5-1 : %d\n", kopo24_MyVal);	//출력되는 값은 버린 값 2가 나온다
		
		//실수형 변수를 선언한다
		double kopo24_MyValF; 
		
		//식에서 0.0 double 형태로 쓰지 않았지 때문에 정확한 값이 나오지 않는다
		kopo24_MyValF = 14 / 5; 
		System.out.printf("#5-2 : %f\n", kopo24_MyValF);
		//double 형태로 사용 했기 때문에 소수점 값까지 나온다 
		kopo24_MyValF = 14.0 / 5; 
		System.out.printf("#5-3 : %f\n", kopo24_MyValF);
		//위의 값에서 0.5 를 더한 값이 출력된다
		kopo24_MyValF = (14.0)/5 + 0.5;  
		System.out.printf("#5-4 : %f\n", kopo24_MyValF);
		//14.0를 int(정수형)로 묶었기 때문에 2 + 0.5 한 값이 출력된다 
		kopo24_MyValF = (int)(14.0)/5 + 0.5;  
		System.out.printf("#5-5 : %f\n", kopo24_MyValF);
		
	}

}
