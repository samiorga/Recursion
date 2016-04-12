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
public class TowerOfHanoi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the number of discs: ");
        int n = input.nextInt();

        String fromPeg = "A";
        String toPeg = "C";
        String tempPeg = "B";
        System.out.println("Tower of Hanoi problem");
        System.out.println("There are " + n + " discs on peg A");
        hanoi(fromPeg, toPeg, tempPeg, n);
    }
    public static void hanoi( String from, String to, String temp, int n){
        if (n == 0){
            System.out.println("Move disc " + n + " from " + from
                    + " to " + to);
        }else{
            hanoi(from, temp, to, n-1);
            System.out.println("Move disc " + n + " from " 
                    + from + " to " + to);
            hanoi(temp, to, from, n-1);
        }
    }
}
