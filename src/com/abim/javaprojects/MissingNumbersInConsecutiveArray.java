package com.abim.javaprojects;

import java.util.ArrayList;

public class MissingNumbersInConsecutiveArray {

	public static void main(String[] args) {
		int[] inputArray1 = {1,2,4,5};
		int n1 = 5;
		int[] inputArray2 = {3,1,4,6,8,8,8};
		int n2 = 10;

		ArrayList<Integer> missingList = new ArrayList<Integer>();
		
		missingList = findMissingNumbers(inputArray1, n1);
		System.out.println(missingList);
		
		missingList = findMissingNumbers(inputArray2, n2);
		System.out.println(missingList);

	}

	private static ArrayList<Integer> findMissingNumbers(int[] inputArray, int n) {
		ArrayList<Integer> missingList = new ArrayList<>();
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		for(int i : inputArray) {
			list1.add(i);
		}
		
		for(int i = 1; i <= n; i ++) {
			if(!list1.contains(i)) {
				missingList.add(i);
			}
		}
		
		return missingList;
	}

}
