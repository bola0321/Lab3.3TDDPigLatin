import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PigLatin {

	public static void main(String[] args) {
		//Scanner scnr = new Scanner(System.in);
		//System.out.print("Please Enter a word to translate into Pig Latin: ");
		//String pigLatin = scnr.nextLine().toLowerCase();
		
		String pigLatin = "anger";
		System.out.println(translate(pigLatin));

	}

	public static List<Character> translate(String word) {
		char[] wordToArray = word.toCharArray();
		
		List<Character> arrToArrayList = new ArrayList <Character>();
		for(char text : wordToArray) {
			arrToArrayList.add(text);
		}
		return arrToArrayList;
		//if ()
	}
}
