package MyChar;

import java.util.Scanner;

public class MyCharRun {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the char");
		char obj = sc.next().charAt(0);
		
		MyChar alphabet=new MyChar(obj);
		
		System.out.println(alphabet.isVowel());
		
		System.out.println(alphabet.isConsonent());
		System.out.println(alphabet.isNumber());
		System.out.println(alphabet.isAlphabet());
		MyChar.printLowerCaseAlphabet();
		MyChar.printUpperCaseAlphabet();
		
	}
}
