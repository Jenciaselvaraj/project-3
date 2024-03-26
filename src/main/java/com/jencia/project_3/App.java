package com.jencia.project_3;
import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        
        int num1, num2, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        num1 = sc.nextInt();
        
        System.out.println("Enter Second Number: ");
        num2 = sc.nextInt();
        
        sc.close();
        sum = num1 + num2;
        System.out.println("Sum of these numbers: "+sum);
    }
}
// Java code to illustrate Subtraction operator

import java.io.*;

class Subtraction {
	public static void main(String[] args)
	{
		// initializing variables
		int num1 = 20, num2 = 10, sub = 0;

		// Displaying num1 and num2
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);

		// subtracting num1 and num2
		sub = num1 - num2;
		System.out.println("Subtraction = " + sub);
	}
}
// Java code to illustrate Multiplication operator

import java.io.*;

class Multiplication {
	public static void main(String[] args)
	{
		// initializing variables
		int num1 = 20, num2 = 10, mult = 0;

		// Displaying num1 and num2
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);

		// Multiplying num1 and num2
		mult = num1 * num2;
		System.out.println("Multiplication = " + mult);
	}
}
// Java code to illustrate Division operator

import java.io.*;

class Division {
	public static void main(String[] args)
	{
		// initializing variables
		int num1 = 20, num2 = 10, div = 0;

		// Displaying num1 and num2
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);

		// Dividing num1 and num2
		div = num1 / num2;
		System.out.println("Division = " + div);
	}
}
// Java code to illustrate Modulus operator

import java.io.*;

class Modulus {
	public static void main(String[] args)
	{
		// initializing variables
		int num1 = 5, num2 = 2, mod = 0;

		// Displaying num1 and num2
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);

		// Remaindering num1 and num2
		mod = num1 % num2;
		System.out.println("Remainder = " + mod);
	}
}
