import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PigLatin {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.print("Please Enter a word to translate into Pig Latin: ");
		String pigLatin = scnr.nextLine().toLowerCase();

		System.out.println(translate(pigLatin));

	}

	// checks where to find the first vowel in the given String
	public static int indexOfFirstVowel(String word) {
		List<Character> vowels = List.of('a', 'e', 'i', 'o', 'u');
		for (int i = 0; i <= word.length() - 1; i++) {
			if (vowels.contains(word.charAt(i))) {
				return i;
			}
		}
		return -1;
	}

	// creates pig latinized String based on where the vowel is located.
	public static String translate(String word) {

		String wordlower = word.toLowerCase();

		if (indexOfFirstVowel(wordlower) == 0) {
			return word + "way";
		} else if (indexOfFirstVowel(wordlower) < 4) {
			String ConstFront = wordlower.substring(0, indexOfFirstVowel(wordlower));
			String ConstBack = wordlower.substring(indexOfFirstVowel(wordlower));
			return ConstBack + ConstFront + "ay";
		} else {
			return "Nope";
		}

	}
}
