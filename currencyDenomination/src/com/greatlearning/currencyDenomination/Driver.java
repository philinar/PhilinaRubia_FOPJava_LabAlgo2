package com.greatlearning.currencyDenomination;
import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// User Inputs
		System.out.println("Enter the size of Currency Denominations:");
		int size = sc.nextInt();
		int[] count = new int[size];
		int[] array = new int[size];
		System.out.println("Enter the Currency Denominations:");
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("Enter the amount you want to pay:");
		int amtPayable = sc.nextInt();
		
		//sort array first
		Sort mSort = new Sort();
		array = mSort.sort(array);
		
		//logic for currency denomination
                for (int i = 0; i < size; i++) {
			if (amtPayable >= array[i]) {
				count[i] = amtPayable / array[i];
				amtPayable = amtPayable - count[i] * array[i];
			}
		}
		// output
		if (amtPayable == 0) {
			System.out.println("Your payment approach in order to give min no of notes will be:");
		}
		for (int i = 0; i < size; i++) {
			if (count[i] > 0) {
				System.out.println(array[i] + " : " + count[i]);
			} else {
				System.out.println("Amount cannot be printed with the given denominations");
			}
		}
	}
}
