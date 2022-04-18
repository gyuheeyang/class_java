
public class P6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//달력 출력 
		
		//1월 1일이 처음 시작하는 요일은 금요일이다 = > 
		int k24_Weekday = 5;
		int[] k24_End = {31,29,31,30,31,30,31,31,30,31,30,31};
		for (int k24_Mon = 0; k24_Mon < 12; k24_Mon++) {
			System.out.printf("%14d월\t\n", k24_Mon + 1);
			System.out.printf("=============================\n");
			System.out.printf("%3s%3s%3s%3s%3s%3s%3s\n","일","월","화","수","목","금","토");			
			 for (int k24_i = 1; k24_i <= k24_Weekday; k24_i++) { // 1월 1일은 금요일 => 문자 "금" 앞까지
		            System.out.printf("%4s"," "); //빈칸 출력해서 일자 출력위치 조정 +=> 4 * 5 = 20칸
		         }
			 for (int k24_i = 1; k24_i <= k24_End[k24_Mon]; k24_i++) { //1부터 각 월의 마지막 일자까지 반복
		            System.out.printf("%4d", k24_i);
				
		         // k24_Weekday는 매일 늘어난다
					k24_Weekday++;    
		            
		        // k24_Weekday 를 7로 나눈값이 0이면 "\n"으로 한 줄 띄우기
				if ((k24_Weekday) % 7 == 0) {
					System.out.println();
				}
			}
			 k24_Weekday %= 7; 
			 System.out.println();
		}
	}

}
