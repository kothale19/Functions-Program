package com.blz.java;
import java.util.Scanner;
public class Functions2Darray {

	public static void main(String[] args) {
		System.out.println("Welcome to the Computation 2D Array Computation Program!!");
		int a[][]=new int[2][2];
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Array Elements:");
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				a[i][j]=scan.nextInt();
			}
		}
		System.out.print("Matrix:\n");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println("\n");
		}
	}

			
		

	}


