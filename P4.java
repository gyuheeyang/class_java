package java0331;

import java.util.Scanner;

public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input an equation");
		String equation = scanner.nextLine(); // ������ �Է� �ޱ�
		double result;
		
	public static double 
		
		
		
		if (equation.contains("+")) {			// +�� �� ������ ���
			String num1 = equation.substring(0, equation.indexOf("+"));
			String num2 = equation.substring(equation.lastIndexOf("+") + 1);
			double numFirst = Double.parseDouble(num1); //String to double
			double numSecond = Double.parseDouble(num2);
			result = numFirst + numSecond; 
			System.out.println(result); 
			
			
			
		} else if (equation.contains("-")) {	// -�� �� ������ ���
			String num1 = equation.substring(0, equation.indexOf("-"));
			String num2 = equation.substring(equation.lastIndexOf("-") + 1);
			double numFirst = Double.parseDouble(num1); //String to double
			double numSecond = Double.parseDouble(num2);
			result = numFirst - numSecond; 
			System.out.println(result); 
		} else if (equation.contains("*")) {	// *�� �� ������ ���
			String num1 = equation.substring(0, equation.indexOf("*"));
			String num2 = equation.substring(equation.lastIndexOf("*") + 1);
			double numFirst = Double.parseDouble(num1); //String to double
			double numSecond = Double.parseDouble(num2);
			result = numFirst * numSecond; 
			System.out.println(result); 
		} else if (equation.contains("/")) {	// /�� �� ������ ���
			String num1 = equation.substring(0, equation.indexOf("/"));
			String num2 = equation.substring(equation.lastIndexOf("/") + 1);
			double numFirst = Double.parseDouble(num1); //String to double
			double numSecond = Double.parseDouble(num2);
			result = numFirst / numSecond; 
			System.out.println(result); 
		} else {
			System.out.println("Error");
		}
		
	}

}
