import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input text");
		String text = scanner.nextLine();
		String [] textArr = text.split("");

		int mid = (textArr.length /2);
		
		if (textArr.length % 2 !=0) {			//길이가 홀수일때
			System.out.println("the Characters in the Middle:  " + textArr[mid]);
		}else {
			System.out.println("the Characters in the Middle:  " + textArr[mid-1] + textArr[mid]);
		}
		
	}

}
