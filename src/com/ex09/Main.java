/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Daniel Thew
 */
package com.ex09;

import java.util.Scanner;

import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        final int gallon_coverage = 350;
	    Scanner newScanner = new Scanner(System.in);
        int length, width, area, gallons;
        System.out.print("Enter a length in feet: ");
        length = newScanner.nextInt();
        System.out.print("Enter a width in feet: ");
        width = newScanner.nextInt();
        area = length*width;
        gallons = (int)Math.ceil((double)area/gallon_coverage);
        System.out.printf("You will need to purchase %d gallons of paint to cover %d square feet.", gallons, area);
    }
}
