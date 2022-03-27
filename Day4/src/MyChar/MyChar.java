package MyChar;

public class MyChar {

	private char ch;

	public MyChar(char c) {
		this.ch=c;
	}

	public boolean isVowel() {
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
		System.out.println("Its vowel");
			return true;
		}else 
		
		if(ch=='c'||ch=='b'){
			
		System.out.println("Its Consonent");
		}
		return true;
	
	}

	public boolean  isNumber() {
		if(ch>='m'|| ch<='a'){//value 109 and 97 
		return true;
	}
		return true;

}

    public boolean isAlphabet() {
		if(ch==97||ch==109)//alphabet a and m
		return true;
		return false;
	}

	public boolean isConsonent() {
		if(isAlphabet() && !isVowel()){
		return true;
	}
		return false;

}

	public static void printLowerCaseAlphabet() {
        for (char ch='a';ch<='z';ch++){
         System.out.print(ch);
        
	}
	 System.out.println("\n");
}

	public static void printUpperCaseAlphabet() {
		for(char ch='A'; ch<='Z';ch++){
		System.out.print(ch);
		
	}
}
}
