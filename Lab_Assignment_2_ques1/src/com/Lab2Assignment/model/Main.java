package com.Lab2Assignment.model;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Transaction transaction = new Transaction();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of transaction array: ");
		int size = sc.nextInt();
		int[] transactions = new int[size];
		
		System.out.println("Enter the values of array:");
		for (int i = 0; i < size; i++) {
			transactions[i] = sc.nextInt();
		}
		
		System.out.println("Enter the total no of targets that needs to be achieved: ");
		int targetSize = sc.nextInt();
		for (int i = 0; i < targetSize; i++) {
			System.out.println("Enter the value of target: ");
			int target = sc.nextInt();
			int res = transaction.targetCheck(transactions, target);
			if (res >= 0) {
				System.out.println("Target achieved after" + (int) (res + 1) + " transactions");
			} else {
				System.out.println("Given target is not achieved");
			}
			System.out.println("");
		}

		sc.close();

	}
}
