package com.Number_Pattern;

public class Number_Pattern13 {

	public static void main(String[] args) {
//		int n = 5;
		for (int i = 1; i <= 3; i++) {
//
//			for (int j = 1, p = 1; j <= i; j++, p++) {
//
////				System.out.print("  ");
//
//			}
			for (int j = i, p = 1; j <= 3; j++, p++) {

				System.out.print(p + " ");

			}

			System.out.println();

		}

		
		
		System.out.println("========================================");

		for (int i = 1; i <=3; i++) {
	
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
	}

}
