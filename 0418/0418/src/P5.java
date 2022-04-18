
public class P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//구구단 인쇄(2) 세로로 3단씩 출력되는 구구단 
		
		//반복문 정수형 변수 k24_i는 1이며 4보다 작고 1씩 커진다 => 3번 반복
		for (int k24_i = 1; k24_i < 4 ; k24_i ++) {
			System.out.println("******************\t******************\t******************");
			//구구단 단 출력 
			//단수가 3씩 커지게 출력하면 되므로 3씩 더해준다
			System.out.printf("   구구단 %d 단   \t   구구단 %d 단   \t   구구단 %d 단   \t\n", k24_i, k24_i+3, k24_i+6);
			System.out.println("******************\t******************\t******************");
			//반복문 정수형 변수 k24_j는 1이며 10보다 작고 1씩 증가한다 =>9번 반복 (구구단이므로.. j는 1부터 9여야함)
			for (int k24_j = 1 ;k24_j <10; k24_j++ ) {
				//line 15와 같이 가로로 3씩 커져야 되므로 k24_i에 0, 3, 6씩 더해준다 
				System.out.print( k24_i +"*"+ k24_j + "=" + k24_i*k24_j +"\t\t\t");	
				System.out.print( (k24_i+3) +"*"+ k24_j  + "=" +(k24_i+3)*k24_j+"\t\t\t");
				System.out.println( (k24_i+6) +"*"+ k24_j+ "=" + (k24_i+6)*k24_j +"\t\t\t");
			}
				
			  
		}
		
		
	}

}
