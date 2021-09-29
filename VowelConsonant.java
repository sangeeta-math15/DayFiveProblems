package com.day5programs;

public class VowelConsonant {
	static void Vowel_Conso(char ch) {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U')
			System.out.println("It is a Vowel.");
		else
			System.out.println("It is a Consonant.");
	}

	public static void main(String[] args) {
		Vowel_Conso('a');
		Vowel_Conso('s');

	}

}
