package com.day5;

public class Q2 {

	static void Ready(String chara) {
		if (chara == "a" || chara == "e" || chara == "i" || chara == "o" || chara == "u" || chara == "A" || chara == "E"
				|| chara == "I" || chara == "O" || chara == "U") {
			System.out.println("Vowel");
		} else if (chara == "b" || chara == "c" || chara == "d" || chara == "e" || chara == "f" || chara == "g"
				|| chara == "h" || chara == "i" || chara == "j" || chara == "k" || chara == "l" || chara == "m"
				|| chara == "n" || chara == "o" || chara == "p" || chara == "q" || chara == "r" || chara == "s"
				|| chara == "t" || chara == "v" || chara == "w" || chara == "x" || chara == "y" || chara == "z"
				|| chara == "B" || chara == "C" || chara == "D" || chara == "F" || chara == "G" || chara == "H"
				|| chara == "J" || chara == "K" || chara == "L" || chara == "M" || chara == "N" || chara == "P"
				|| chara == "Q" || chara == "R" || chara == "S" || chara == "T" || chara == "V" || chara == "W"
				|| chara == "X" || chara == "Y" || chara == "Z" || chara == "b") {

			System.out.println("Consonent");
		} else {
			System.out.println("Error");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ready("a");
		Ready("x");
		Ready("ygfsg");

	}

}
