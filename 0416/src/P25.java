
public class P25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//띄어쓰기 연습 (띄어쓰고 싶은 만큼 빈칸 " "을 출력)
		//바깥 반복문 (k24_i)이 한번 돌 때 안쪽 반복문 (k24_j)은 k24_i번 돈다
		//k24_i가 0이면 빈칸 0개 출력 , k24_i가 1이면 빈칸 1개 출력 ... 
		
		//반복문 k24_i은 0에서부터 10 미만 까지 1씩 증가한다
		for (int k24_i =0; k24_i < 10; k24_i++) {
			//k24_j는 0에서부터 k24_i 미만 까지 1씩 증가한다 
			for (int k24_j =0; k24_j < k24_i; k24_j++) {
				//빈칸 출력
				System.out.print(" ");
			}
			//k24_i을 출력한다
			System.out.printf("%d\n", k24_i);
		}
	}

}
