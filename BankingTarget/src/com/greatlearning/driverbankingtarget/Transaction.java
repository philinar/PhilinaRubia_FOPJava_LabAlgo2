package com.greatlearning.driverbankingtarget;

import java.util.Scanner;

public class Transaction {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numOfTrans, target;

		// User Inputs
		System.out.println("Enter the number of transactions in an array:");
		numOfTrans = sc.nextInt();

		int[] transArray = new int[numOfTrans];

		System.out.println("Enter the transaction:");
		for (int i = 0; i < numOfTrans; i++) {
			transArray[i] = sc.nextInt();
		}

		System.out.println("What is the target needed to be achieved?");
		target = sc.nextInt();

		// logic to check target
		int checkVar = 0;
		int idx = 1;
		boolean checkCond = false;

		for (int i = 0; i < numOfTrans; i++) {
			checkVar += transArray[i];
			idx += i;
			if (checkVar >= target) {
				checkCond = true;
				break;
			}
		}
		if (checkCond == true) {
			System.out.println("Target is achieved after " + idx + " transactions");
		} else {
			System.out.println("Target is not achieved");
		}
	}
}
