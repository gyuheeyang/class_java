import java.util.Scanner;

public class Duplicate {

	public float[] getNumber1() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input one set of Numbers");
		String fisrstNumber = scanner.nextLine();
		String[] firstNumberArr = fisrstNumber.split("\\s+");	//문자열 공백으로 분할 후 저장
		
		float[] array1 = new float [firstNumberArr.length];
		
		for (int i =0; i <firstNumberArr.length; i++) {
			array1[i] = Float.parseFloat(firstNumberArr[i]);
			//System.out.println(array1[i]);
			
		}return array1;
	}
	public float[] getNumber2() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input one more set of Numbers");
		String secondNumber = scanner.nextLine();
		String[] secondNumberArr = secondNumber.split("\\s+");
	
		float[] array2 = new float [secondNumberArr.length];
		
		for (int i =0; i <secondNumberArr.length; i++) {
			array2[i] = Float.parseFloat(secondNumberArr[i]);
			//System.out.println(array2[i]);
		}return array2;
	}
	
	public void getDuplicate(float[]array1, float[]array2) {
		
		for (int i =0 ; i < array1.length; i++) {
			for (int j =0 ; j <array2.length; j++) {
				if (array1[i] == array2[j]) {
					System.out.println("Duplicate numbers: " + array1[i]);
				}
			}
		}
	}
}
