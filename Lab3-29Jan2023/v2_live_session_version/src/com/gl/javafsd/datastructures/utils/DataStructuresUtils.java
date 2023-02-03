package com.gl.javafsd.datastructures.utils;

import java.util.Queue;
import java.util.Random;

public class DataStructuresUtils {
	
	public static int[] generateRandomArray (int size) {
		
		int resultArray[] = new int[size];
		for (int index = 0; index < size ; index ++) {
			int randomNumber = generateRandomNumber();
			resultArray[index] = randomNumber;
		}
		return resultArray;
	} 

	public static int generateRandomNumber() {
		Random random = new Random();
		int randomNumber = random.nextInt(1, 1000);
		return randomNumber;
	}

	public static void printArray(int[] array) {
		System.out.print("{ ");
		int arrayLength = array.length;
		for (int index = 0; index < arrayLength; index++) {
			System.out.print(array[index]);
			if(index != arrayLength - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("} ") ;
	}
	
	public static int[] generateRandomSortedArray(int size) {
		
		int resultArray[] = new int [size];
		int firstValue = generateRandomNumber();
		resultArray[0] = firstValue;
		
		for (int index = 1; index < size; index ++) {
			int prevValue = resultArray[index -1];
			int randomValue = generateRandomNumber();
			int currentValue = prevValue + randomValue;
			resultArray[index] = currentValue;
		}
		return resultArray;
	}
	
	public static int getRandomElement(int[] array) {
		int arraySize = array.length;
		Random random = new Random(); 
		int randomIndex = random.nextInt(arraySize);
		int randomElement = array[randomIndex];
		return randomElement;
	}
	
	public static void printWithIndex(int[] array) {
		
		System.out.print("{ ");
		for (int index = 0; index < array.length; index ++) {	

			System.out.print("(" + index + ") ");

			System.out.print("[" + array[index] + "]");
			
			if (index != (array.length - 1)) {
				System.out.print(", ");
			}
		}
		System.out.println(" }");
	}
	public static void print(int[] array) {
		
		System.out.print("{ ");
		for (int index = 0; index < array.length; index ++) {	

			System.out.print(array[index]);
			
			if (index != (array.length - 1)) {
				System.out.print(", ");
			}
		}
		System.out.println(" }");
	}

	public static String printAndReturn(int[] array) {
		
		StringBuilder result = new StringBuilder();
		result.append("{ ");
		for (int index = 0; index < array.length; index ++) {	

			result.append(array[index]);

			if (index != (array.length - 1)) {
				result.append(", ");
			}
		}
		result.append(" }");
		return result.toString();
	}
	public static String concatenate(int[] array) {
		
		StringBuilder result = new StringBuilder();
		result.append("{ ");
		for (int index = 0; index < array.length; index ++) {	

			result.append(array[index]);

			if (index != (array.length - 1)) {
				result.append(", ");
			}
		}
		result.append(" }");
		return result.toString();
	}
	
	private static int generateInitialRandomNumber() {
		
		double random = (Math.random() * 10) + 1;
		return (int)random;
	}
	
	/*
	 * public static void main(String[] args) {
	 * 
	 * int array[] = DataStructuresUtils.generateRandomSortedArray(10);
	 * printWithIndex(array); }
	 */
	
	public static void printQueue(Queue<?> queue) {
		
		System.out.println("---------------------------------------------------------");
		StringBuilder result = new StringBuilder();
		
		while (!queue.isEmpty()) {
			
			Object anObject = queue.poll();
			
			result.append(anObject);
			result.append(System.getProperty("line.separator"));
			
		}		
		
		System.out.println(result.toString());
	}

	public static void printQueue(Queue<?> queue, String separator) {
		
		StringBuilder result = new StringBuilder();
		
		while (!queue.isEmpty()) {
			
			Object anObject = queue.poll();
			
			result.append(anObject);
			result.append(separator);
			
		}		
		
		System.out.println(result.toString());
	}
	
	public static void printArray(Object... array) {
		
		StringBuilder result = new StringBuilder();
		
		for (Object item : array) {
			
			result.append(item);
			result.append(" / ");
			
		}		
		
		System.out.println(result.toString());
	}
}
