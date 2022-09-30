package com.interview.prep.q02;

import java.util.HashMap;
import java.util.Map;

public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		findPairsFromTwoArrays();

	}

	private static void findPairsFromTwoArrays() {
		// TODO Auto-generated method stub

		int[] arr1 = {1, 2, 4, 5, 7};
		int[] arr2 = {5, 6, 3, 4, 8};
		
		int x = 9;
		
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (int i : arr1)
			map.put(i, null);
		
		for (int i : arr2) {
			if(map.containsKey(x - i)) {
				System.out.println((x-i) + ", " + i);
			}
		}

	}

}
