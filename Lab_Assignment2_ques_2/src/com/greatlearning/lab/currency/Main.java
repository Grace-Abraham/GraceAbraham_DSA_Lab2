package com.greatlearning.lab.currency;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of currency denominations");
		int size = sc.nextInt();
		int[] denominations = new int[size];
		System.out.println("Enter Currency denominations");
		for (int i = 0; i < size; i++) {
			denominations[i] = sc.nextInt();

		}

		System.out.println("Enter the amount you want to pay");
		int payValue = sc.nextInt();
		System.out.println("");
		MergeSort sort = new MergeSort();
		sort.sort(denominations, 0, denominations.length - 1);

		Currency curr = new Currency();
		curr.CurrencyCount(denominations, payValue);

		sc.close();

	}
}
