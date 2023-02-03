package com.gl.javafsd.datastructures.utils;

public class Main {
	public static void main(String[] args) {
		int arraySize = 7;
		
		/*
		 * for (int i=0 ; i< 10; i++) { int[] genArray =
		 * DataStructuresUtils.generateRandomArray(arraySize);
		 * DataStructuresUtils.printArray(genArray); }
		 */
		
		for (int i=0 ; i< 10; i++) {
			int[] sortedRandomArray = DataStructuresUtils.generateRandomSortedArray(arraySize);
			DataStructuresUtils.printArray(sortedRandomArray);
			int randomElement = DataStructuresUtils.getRandomElement(sortedRandomArray);
			System.out.println(String.format("Random element is %d ",randomElement));
		}
	}
}