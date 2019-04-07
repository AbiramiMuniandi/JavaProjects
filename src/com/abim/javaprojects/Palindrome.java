package com.abim.javaprojects;

public class Palindrome {

	public static void main(String[] args) {
		String inputString2 = "Malayalam";
		
		StringBuilder inputStringBuilder2 = new StringBuilder(inputString2.toLowerCase());
		
		String anotherString = "malayalan";

		if(inputStringBuilder2.equals(inputStringBuilder2.reverse())) {
			System.out.println("Palindrome");
		}
		int j = anotherString.length() - 1;
		char[] inputString2array = inputString2.toLowerCase().toCharArray();
		char[] anotherStringarray = anotherString.toLowerCase().toCharArray();
		boolean flag = true;
		
		if(inputString2.length() == anotherString.length()) {
			for(int i = 0; i < inputString2.length(); i ++) {
				if(inputString2array[i] == anotherStringarray[j]) {
					j--;
				}
				else {
					System.out.println("Not a palidrome");
					flag = false;
					break;
				}
			}
			if(flag) {
				System.out.println("Palindrome");
			}
		}
		
		if(checkPalindrome(inputString2.toLowerCase())) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
		System.out.println(checkPalindrome("abirami"));
		System.out.println(checkPalindrome("12321"));
	}

	static char[] inputcharacters;
	public static boolean checkPalindrome(String inputString2) {
		inputcharacters = inputString2.toCharArray();
		System.out.println(inputString2);
		System.out.println(inputString2.length());
		if(inputString2.length() <= 1) {
			return true;
		}
		else {
			if(inputcharacters[0] == inputcharacters[inputcharacters.length - 1]) {
				checkPalindrome(inputString2.substring(0, inputString2.length()-1));
				inputcharacters = null;
			}
			else {
				return false;
			}
		}
		
		return true;
	}

	@Override
	public boolean equals(Object o) { 
		  
        // If the object is compared with itself then return true   
        if (o == this) { 
            return true; 
        } 
        if(o == null) {
        	return false;
        }
        
        if (!(o instanceof String)) { 
            return false; 
        } 
        return o == this;
	} 
}
