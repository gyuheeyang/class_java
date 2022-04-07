import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Calculation {
	int count = 0; 
	int sum =0;
	int mean =0;
	
	public int getNumber() {
		
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		
		
		System.out.println("Input one word");
		int num = scanner.nextInt();
		numberList.add(num);
		
		count ++;
		sum += num;
		mean = sum / count;
		
		int max = Collections.max(numberList);
		int min = Collections.min(numberList);
		
		return int count int mean int max int min;
	}
	
	public static void printResult(int count, int mean, int max, int min) {
		System.out.print("Result: " + count + ", ");
		System.out.print("mean: " + mean+ ", ");
		System.out.print("max: " + max+ ", ");
		System.out.print("min: " + min);
		System.out.println();
	}
}
