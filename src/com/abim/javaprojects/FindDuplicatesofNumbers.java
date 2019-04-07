package com.abim.javaprojects;

import java.util.ArrayList;
import java.util.HashMap;

public class FindDuplicatesofNumbers {

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 1, 2, 3, 4, 1, 1, 2, 5};
		ArrayList<Integer> uniqueList = new ArrayList<Integer>();
		HashMap<Integer, Integer> numberandCount = new HashMap<Integer, Integer>();
		HashMap<Integer, ArrayList<Integer>> positionAndNumber = new HashMap<Integer, ArrayList<Integer>>();

		int count;
		for(int num : numbers) {
			count = 0;
			if(numberandCount.containsKey(num)) {
				numberandCount.put(num, numberandCount.get(num) + 1);
			}
			else {
				numberandCount.put(num, 1);
			}
			if(!uniqueList.contains(num)) {
				uniqueList.add(num);
			}
		}

		/*Multimap<String, Integer> multiMap = HashMultimap.create();
		for (Entry<Integer, String> entry : map.entrySet()) {
		  multiMap.put(entry.getValue(), entry.getKey());
		  this will give {num along with its positions}
		}*/

		System.out.println(numberandCount);
		ArrayList<Integer> positions = new ArrayList<Integer>();

		for(int uniquenum : uniqueList) {
			for(int i = 0; i < numbers.length; i ++) {
				if(uniquenum == numbers[i]) {
					positions.add(i);
				}
			}
			
			System.out.println("Number = " + uniquenum + "positions = " + positions);
			positions.clear();
		}

	}

}
