package com.abim.javaprojects;

public class ReplaceCharsinString {

	public static void main(String[] args) {
		String inputString = "My name is Abirami";
		char from = 'a';
		char to = '*';
		
		inputString = inputString.toLowerCase();
		inputString.replace(from, to);
		System.out.println(inputString.replace(from, to));
		
		char[] stringArray = inputString.toCharArray();
		// modified;
		for(int i = 0; i < stringArray.length; i ++) {
			if(stringArray[i] == from) {
				stringArray[i] = to;
			}
		}
		System.out.println(String.valueOf(stringArray));
		
		System.out.println(replace(inputString, from, to));
	
	}
	
	public static String replace(String s, char from, char to){
	    if (s.length() < 1) {
	      return s;
	    }
	    else {
	    	char character;
	    	if(s.charAt(0) == from) {
	    		character = to;
	    	}
	    	else {
	    		character = s.charAt(0);
	    	}
	    	return character + replace(s.substring(1), from, to);
	    }
	  }


}
