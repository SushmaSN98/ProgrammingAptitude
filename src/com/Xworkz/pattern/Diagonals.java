package com.Xworkz.pattern;

public class Diagonals {

	public static void main(String[] args) {
		int num=4;
		for(int i=0;i<=num;i++)
		{
			for(int j=0;j<=num;j++) {
				if(i==j || i+j==num) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}
		

	}

}
