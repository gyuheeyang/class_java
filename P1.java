import java.util.Scanner;

public class P1 {
////////////���� ª�� while true�� ���ѹݺ� ���� 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		//ù��° �迭 
		System.out.println("Input one set of Numbers");
		String fisrstNumber = scanner.nextLine();
		String[] firstNumberArr = fisrstNumber.split("\\s+");	//���ڿ� �������� ���� �� ����
		
		float[] array1 = new float [firstNumberArr.length];
		
		for (int i =0; i <firstNumberArr.length; i++) {
			array1[i] = Float.parseFloat(firstNumberArr[i]);
			//System.out.println(array1[i]);
		}
		
		//�ι�° �迭 
		System.out.println("Input one more set of Numbers");
		String secondNumber = scanner.nextLine();
		String[] secondNumberArr = secondNumber.split("\\s+");
	
		float[] array2 = new float [secondNumberArr.length];
		
		for (int i =0; i <secondNumberArr.length; i++) {
			array2[i] = Float.parseFloat(secondNumberArr[i]);
			//System.out.println(array2[i]);
		}
	
		//�ߺ� �� ã�� 
		for (int i =0 ; i < array1.length; i++) {
			for (int j =0 ; j <array2.length; j++) {
				if (array1[i] == array2[j]) {
					System.out.println("Duplicate numbers: " + array1[i]);
				}
			}
		}

	
	
	}

}
