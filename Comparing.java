import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.List;

public class Comparing {
	
	public static String getWord() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input one word");
		String w = scanner.next();
		//wordList.add(word);
		return w;
	}
	
	public static ArrayList<String> getArray(String Word){
		HashSet<String> set = new HashSet<String> ();
		for (int i =0; i < Word.length(); i++) {
			set.add(Word.substring(i, i+1));
		}
		ArrayList<String> list = new ArrayList<String>(set);
		return list;
	}
	public static void arraySize() {
		
	}
	
	public static void compare(ArrayList<String> fisrtWordList,ArrayList<String> secondWordList) {
		int count = 0; 
		for (int i =0; i< fisrtWordList.size(); i ++) {
			for (int j =0; j <secondWordList.size(); j++ ) {
				if (fisrtWordList.get(i).contains(secondWordList.get(j))) {
					count++;
				}
			}
		}
		
		System.out.println("Result : " + count);
	}
}
