package com.blz.java;
import java.util.Scanner;
public class DistanceJava {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double x1,y1,x2,y2;
		System.out.println("Enter the value for x1: ");
		x1=scan.nextDouble();
		System.out.println("Enter the value for x2: ");
		x2=scan.nextDouble();
		System.out.println("Enter the value for y1: ");
		y1=scan.nextDouble();
		System.out.println("Enter the value for y2: ");
		y2=scan.nextDouble();
		double side1=x2-x1;
		double side2=y2-y1;
		double distance = Math.sqrt(side1*side1 + side2*side2);
		System.out.println("Distance of the two points: "+distance);
		
	}

}
