/*
 * Write a section of Java code that identifies the smallest odd number in the 
 * following array.  For the array shown the program output would be 3.
 * 
 * int y[] = {2,6,7,9,10,11,4,3,7};
 */

import java.util.Random;

public class SmallestOddNumberFinder {
	
	int smallestOddNumber;
	int[] numArray;
	
	public SmallestOddNumberFinder() {
	}
	
	public SmallestOddNumberFinder(int[] numArr) {
		numArray = numArr;
		smallestOddNumber = findSmallestOddNumber(numArray);
	}
	
	public SmallestOddNumberFinder(int arraySize, int smallestNum) {
		populateArray(arraySize, smallestNum);
		smallestOddNumber = findSmallestOddNumber(numArray);
	}
	
	public int findSmallestOddNumber(int[] numArr) {
		int smallest = 100000000;
		for (int i = 0; i < numArr.length; i++) {
			if(numArr[i] % 2 != 0 && numArr[i] < smallest) {
				smallest = numArr[i];
			}
		}
		return smallest;
	}
	
	public void populateArray(int size, int smallest) {
		numArray = new int[size];		
		Random randomGenerator = new Random();
		
		for(int i = 0; i < numArray.length; i++) {
			numArray[i] = randomGenerator.nextInt(smallest);
		}
	}
	
	public int getSmallestOddNumber() {
		return smallestOddNumber;
	}
	
	public int[] getNumArray() {
		return numArray;
	}
	
	public void printArrayContents() {
		System.out.println("Printing array contents...");
		System.out.print("[");
		for(int i = 0; i < numArray.length; i++) {
			if(i != numArray.length-1){
				System.out.print(numArray[i] + ", ");
			}
			else {
				System.out.print(numArray[i]);
			}
		}
		System.out.println("]");
		System.out.println();
	}
}