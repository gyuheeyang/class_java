import java.util.Scanner;

public class P1 {
////////////메일 짧게 while true로 무한반복 수정 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		//첫번째 배열 
		System.out.println("Input one set of Numbers");
		String fisrstNumber = scanner.nextLine();
		String[] firstNumberArr = fisrstNumber.split("\\s+");	//문자열 공백으로 분할 후 저장
		
		float[] array1 = new float [firstNumberArr.length];
		
		for (int i =0; i <firstNumberArr.length; i++) {
			array1[i] = Float.parseFloat(firstNumberArr[i]);
			//System.out.println(array1[i]);
		}
		
		//두번째 배열 
		System.out.println("Input one more set of Numbers");
		String secondNumber = scanner.nextLine();
		String[] secondNumberArr = secondNumber.split("\\s+");
	
		float[] array2 = new float [secondNumberArr.length];
		
		for (int i =0; i <secondNumberArr.length; i++) {
			array2[i] = Float.parseFloat(secondNumberArr[i]);
			//System.out.println(array2[i]);
		}
	
		//중복 값 찾기 
		for (int i =0 ; i < array1.length; i++) {
			for (int j =0 ; j <array2.length; j++) {
				if (array1[i] == array2[j]) {
					System.out.println("Duplicate numbers: " + array1[i]);
				}
			}
		}

	
	
	}

}
