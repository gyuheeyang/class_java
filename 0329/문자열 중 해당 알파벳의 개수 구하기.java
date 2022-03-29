package gyuhee;

import java.util.Scanner;

public class A2phone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = " I go to school";
		text = text.toUpperCase(); //대문자로 변경
		//I GO TO SCHOOL
		
		int countForC= 0, countForG=0, countForH=0, 
				countForI=0,countForL=0,countForO=0,countForS=0,countForT=0;
		for (int i =0; i < text.length(); i++) {
			if (text.charAt(i) == 'C') {
				countForC++;
			}if (text.charAt(i) == 'G') {
				countForG++;
			}if (text.charAt(i) == 'H') {
				countForH++;
			}if (text.charAt(i) == 'I') {
				countForI++;
			}if (text.charAt(i) == 'L') {
				countForL++;
			}if (text.charAt(i) == 'O') {
				countForO++;
			}if (text.charAt(i) == 'S') {
				countForS++;
			}if (text.charAt(i) == 'T') {
				countForT++;
			}
		}

		System.out.println("C -" + countForC);
		System.out.println("G -" + countForG);
		System.out.println("H -" + countForH);
		System.out.println("I -" + countForI);
		System.out.println("L -" + countForL);
		System.out.println("O -" + countForO);
		System.out.println("S -" + countForS);
		System.out.println("T -" + countForT);
		
	}
}
