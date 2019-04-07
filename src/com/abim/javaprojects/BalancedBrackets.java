package com.abim.javaprojects;

import java.util.Stack;

public class BalancedBrackets {
	
	public static void main(String[] args) {

		String inputSequence1 = "{[<()<{}>(<)>>]}";
		String inputSequence2 = "{<([{<()>}])>}";
		
		char[] inputSequence1Array = inputSequence1.toCharArray();
		char[] inputSequence2Array = inputSequence2.toCharArray();
		
		System.out.println(findIfBracketSequenceIsMatching(inputSequence1Array));
		System.out.println(findIfBracketSequenceIsMatching(inputSequence2Array));
	}

	public static boolean findIfBracketSequenceIsMatching(char[] inputSequenceArray) {
		
		Stack<Character> stack = new Stack<Character>();
		for(int i = 0; i < inputSequenceArray.length; i ++) {
			if(inputSequenceArray[i] == '{' || inputSequenceArray[i] == '(' || inputSequenceArray[i] == '[' || inputSequenceArray[i] == '<') {
				stack.push(inputSequenceArray[i]);
			}
			else {
				if(stack.peek() == '{') {
					if(!(inputSequenceArray[i] == '}')) {
						return false;
					}
				}
				else if(stack.peek() == '(') {
					if(!(inputSequenceArray[i] == ')')) {
						return false;
					}
				}
				else if(stack.peek() == '[') {
					if(!(inputSequenceArray[i] == ']')) {
						return false;
					}
				}
				else{
					if(!(inputSequenceArray[i] == '>')) {
						return false;
					}
				}
				stack.pop();
			}
		}
		
		return true;
	}

}
