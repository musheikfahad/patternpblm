package com.Pattern;

public class Hill_Pattern {

	public static void main(String[] args) {
		int n=5;
		for (int i = 1; i <= n; i++) {
			
			for (int j = i; j <=n; j++) {
				System.out.print("  ");
				}
			for (int j =1; j <=i ; j++) {
				
				System.out.print("* ");
				}
			for (int j = 1; j <=i-1; j++) {
				System.out.print("* ");
			}
			// we can add -1 in any of incresing triangle loop  simple male <= into < only
			// if we delete - one then we loose peak
			System.out.println();
			
		}

	}

}
