package com.abim.javaprojects;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PrintVersion {

	public static void main(String[] args) {
		/*		String[] input = {"1.2.34", "$5.j8", "3.4#", "3.45"}; 
		float[] newInputs = new float[input.length];

		String s = "";
		char[] chars;
		int dotCount = 0;
		Pattern pattern = Pattern.compile("[^0-9\\.]");

		//String number = matcher.replaceAll("");
		for(int i = 0; i < input.length; i ++) {
			chars = input[i].toCharArray();
			for(int j = 0; j < chars.length; j ++) {
				if(chars[j] >= '0' && chars[j] <= '9' || chars[j] == '.') {
					if(chars[j] == '.') {
						dotCount ++;
					}
					if(dotCount <= 1) {
						s = s + chars[j];
					}
				}
			}
			dotCount = 0;
			System.out.println(s);
			newInputs[i] = Float.parseFloat(s);
			s = "";
		}

		int[] output = new int[input.length];
		for(int i = 0; i < input.length; i ++) {
			s = input[i];
			Matcher matcher = pattern.matcher(s);
			s = matcher.replaceAll("");
			//System.out.println(s);
			output[i] = Integer.parseInt(s);
		}

		Arrays.sort(newInputs);
		System.out.println(java.util.Arrays.toString(newInputs));
		System.out.println(java.util.Arrays.toString(output));*/

		checkGreater("1.1","1");
		checkGreater("2.1","1");
		checkGreater("2.1","1.2.3");
		checkGreater("1.1.1.1.1","1.1.2");
		checkGreater("1.2.3.4","1.2.3.4.5");//this will be a special case
		checkGreater("1.2.3.3","1.2.3.4.5");
		checkGreater("1.1","1.0");
		checkGreater("1", "1.0");//this will be a special case
	}

	public static void checkGreater(String s1, String s2) {
		System.out.println(s1 + "--------------" + s2);
		String[] as1 = s1.split("\\.");
		String[] as2 = s2.split("\\.");
		int greaterNumber = 0;
		int iterationLength;

		if(as1.length == 1 || as2.length == 1) {
			if(as1.length == 1) {
				if(Integer.parseInt(as1[0]) <= Integer.parseInt(as2[0]))
					greaterNumber = 2;
				else
					greaterNumber = 1;
			}
			else {
				if(Integer.parseInt(as1[0]) <= Integer.parseInt(as2[0]))
					greaterNumber = 1;
				else
					greaterNumber = 2;
			}
		}
		else{
			if(as1.length <= as2.length) {
				iterationLength = as1.length;
			}
			else {
				iterationLength = as2.length;
			}

			int i;
			for(i = 0; i < iterationLength; i ++) {
				if(Integer.parseInt(as1[i]) == Integer.parseInt(as2[i]))
					continue;
				else if(Integer.parseInt(as1[i]) < Integer.parseInt(as2[i])) {
					greaterNumber = 2;
					break;
				}
				else {
					greaterNumber = 1;
					break;
				}
			}
			
			if(i == iterationLength && greaterNumber == 0) {
				if(as1.length < as2.length)
					greaterNumber = 2;
				else
					greaterNumber = 1;
			}

		}

		System.out.println(greaterNumber);
	}
}
