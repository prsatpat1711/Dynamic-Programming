package main;

import java.util.Scanner;

import codes.KnapSack;
import codes.EditDistance;
import codes.MinimumOperations;

public class AppsForPractice {

	public static void main(String[] args) {
		System.out.println("Choose the code you want to try out! \n 1. KnapSack \n 2. Edit Distance \n 3. Minimum Operations");
		Scanner scanner = new Scanner(System.in);
		int a = 100;
		a = scanner.nextInt();
		switch (a) {
		case 1:
			int W = 50;
			int val[] = { 60, 100, 120 };
			int wt[] = { 10, 20, 30 };
			int n = val.length;
			KnapSack.knapSack(W, wt, val, n);
			break;

		case 2:
			String str1 = "abcdef";
			String str2 = "ghijkl";
			EditDistance.editDistance(str1, str2);
			break;

		case 3:
			int b = 9;
			System.out.println(MinimumOperations.minimumOperations(b));
			break;
			
		}
	}

}
