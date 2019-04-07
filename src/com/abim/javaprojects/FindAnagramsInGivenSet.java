package com.abim.javaprojects;

import java.util.ArrayList;
import java.util.Arrays;

public class FindAnagramsInGivenSet {

	public static void main(String[] args) {
		//String[] stringsList = {"Abirami", "imariBA", "ganesh", "GAnesH", "vinayagar","abirami"};
		ArrayList<String> stringsList = new ArrayList<String>();
		stringsList.add("Abirami");
		stringsList.add("imariBA");
		stringsList.add("ganesh");
		stringsList.add("GAnesH");
		stringsList.add("vinayagar");
		stringsList.add("abirami");
		ArrayList<String> inputStrings = new ArrayList<String>();
		inputStrings.add("Tester");
		inputStrings.add("Setter");
		inputStrings.add("Retest");
		inputStrings.add("street");
		
		ArrayList<String> newList = new ArrayList<String>();

		int i = 0;
		char c[];

		ArrayList<String> stringListSorted = new ArrayList<String>();
		String temp;

		for(i = 0; i < stringsList.size(); i ++) {
			temp = stringsList.get(i).toLowerCase();
			c = temp.toCharArray();
			Arrays.sort(c);
			stringListSorted.add(String.valueOf(c));
			temp = null;
			c = null;
		}	
		
		System.out.println(stringListSorted);
		
		for(i = 0; i < stringListSorted.size(); i ++) {
			
			if(!newList.contains(stringListSorted.get(i))) {
				newList.add(stringListSorted.get(i));
			}			
		}
		
		System.out.println(newList);
		
		ArrayList<Integer> indeces = new ArrayList<Integer>();
		if(newList.size() == stringListSorted.size()) {
			System.out.println("No anagrams");
		}
		else {
			System.out.println("there are anagrams");
			for(i = 0; i < newList.size(); i ++) {
				for(int j = 0; j < stringListSorted.size(); j ++) {
					if(newList.get(i).equals(stringListSorted.get(j))) {
						indeces.add(j);
					}
				}
				if(!indeces.isEmpty() && indeces.size() > 1) {
					System.out.println(indeces + " are anagrams");
					indeces.clear();
				}
				
			}
		}
		
	}

}
