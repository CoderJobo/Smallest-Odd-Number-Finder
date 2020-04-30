/*
 * The following program tests the LargestEvenNumberFinder class 
 * 
 * @Author: Joan Hickey
 * @Version: 30th April 2020
 */

import java.util.Scanner;

public class CheckSmallestOddNumberFinder {

	public static void main(String[] args) {
		
		System.out.println("Checking first constructor SmallestOddNumberFinder(int[] numArr)...\n");
		int y[] = {2,6,7,9,10,11,4,3,7};
		SmallestOddNumberFinder finder1 = new SmallestOddNumberFinder (y);
		finder1.printArrayContents();
		int smallest1 = finder1.getSmallestOddNumber();
		
		System.out.println("The smallest odd number in array y is " + smallest1);
		System.out.println("\n====================\n");
		System.out.println();
		
		System.out.println("Checking second constructor SmallestOddNumberFinder(int arraySize, int largestNum)...\n");
		Scanner scanUserInput = new Scanner(System.in);
		System.out.println("What size should the array be?");
		int arraySize = scanUserInput.nextInt();
		System.out.println("What is the maximum range of numbers the array may contain?");
		int smallestNum = scanUserInput.nextInt();
		System.out.println();
		SmallestOddNumberFinder finder2 = new SmallestOddNumberFinder(arraySize, smallestNum); 
		finder2.printArrayContents();
		int smallest2 = finder2.getSmallestOddNumber();
		
		System.out.println("The smallest odd number in the array is " + smallest2);
		System.out.println("\n====================\n");
		System.out.println();
		
		scanUserInput.close();
		System.out.println("END");
	}
}
