import java.util.Scanner;

/* This program reads a user input (integers) 
 * and determines which number is the largest, and which one is the smallest./*
 */

public class LargestAndSmallestIntegers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		int smallest = 0;
		int largest = 0;
		
		System.out.print("Enter how many numbers to enter: ");
		int n = input.nextInt();
		
		System.out.print("Enter integer 1: ");
		num = input.nextInt();
		smallest = num;
		
		for (int i = 2; i <= n; i++){
			System.out.printf("Enter integer %d: ", i);
			num = input.nextInt();
			
			if(num > largest){
				largest = num;
			}
			if(num < smallest){
				smallest = num;
			}
		}
		System.out.println("Largest integer is: " + largest);
		System.out.println("Smallest integer is: " + smallest);		
		
	}

}
