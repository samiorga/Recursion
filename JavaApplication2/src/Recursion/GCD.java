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
public class GCD {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter 2 numbers to find their "
                + "Greatest Common Denominator (GCD): ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();

        int ans = gcd(n1, n2);
        System.out.println("The GCD of " + n1 + " and "
                + n2 + " is " + ans);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            System.out.println(a);
            return gcd(b, a % b);
        }
    }
}
