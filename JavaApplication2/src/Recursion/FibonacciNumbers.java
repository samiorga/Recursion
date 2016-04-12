/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

import java.util.Scanner;

/**
 *
 * @author samiorga
 */
public class FibonacciNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter a number: ");
        int number = input.nextInt();

        System.out.println("The Fibonacci number for " + number + " is ");
        System.out.println(fib(number));
    }

    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}