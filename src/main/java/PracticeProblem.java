/*
File Name: Arrays and iterating
Author: Jim Li
Date Created: May 4, 2026
Date Last Modified: May 4, 2026
*/

public class PracticeProblem {

	public static boolean isPalindrome(String word){
		word = word.toLowerCase();
		word = word.replace(" ", "");
		char[] array = new char[word.length()];
		for (int i = 0; i < word.length(); i++){
			array[i] = word.charAt(i);
		}
		for (int i = 0; i < word.length(); i++){
			if (array[i] != array[array.length - i - 1]){
				return false;
			}
		}
		return true;
	}

}
