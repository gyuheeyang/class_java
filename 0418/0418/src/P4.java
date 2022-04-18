
public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//구구단 실습
		//3단씩 출력되는 구구단 
		
		//기존 구구단 출력 반복문과 다르게 k24_i이 3씩 커지는 반복문을 만들어야 한다.
		//정수형 변수 k24_i는 1이며 (1단부터 출력) 10보다 작을 때까지 3씩 증가한다 => line 11의 반복문은 총 3번 돈다!
		for (int k24_i = 1; k24_i < 10 ; k24_i = k24_i + 3) {
			System.out.println("******************\t******************\t******************");
			//구구단 단 출력 부 
			System.out.printf("   구구단 %d 단   \t   구구단 %d 단   \t   구구단 %d 단   \t\n", k24_i, k24_i+1, k24_i+2);
			System.out.println("******************\t******************\t******************");
			//정수형 변수 k24_j는 1이며 10보다 작고 1씩 증가 => line 17의 반복문은 총 9번 돈다! (구구단이니까..)
			for (int k24_j =1; k24_j < 10 ; k24_j ++) {
				//line 14번과 같은 형태, k24_i는 3씩 증가하기 때문에 123단을 하나 하나 출력해준다 
				System.out.print( k24_i +"*"+ k24_j + "=" + k24_i*k24_j +"\t\t\t");
				System.out.print( (k24_i+1) +"*"+ k24_j  + "=" +(k24_i+1)*k24_j+"\t\t\t");
				System.out.println( (k24_i+2) +"*"+ k24_j+ "=" + (k24_i+2)*k24_j +"\t\t\t");
				
			}
		}System.out.println();	// 3단씩 반복될 때마다 줄바꾸기
		
	}

}
