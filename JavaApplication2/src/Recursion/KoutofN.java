/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

/**
 *
 * @author samiorga
 */
public class KoutofN {

    public static void main(String[] args) {
    }

    public static int numPlanets(int n, int k) {
        if (k == 0 || n == k) {
            return 1;
        } else if (k > n) {
            return 0;
        }
        return numPlanets(n - 1, k - 1) + numPlanets(n - 1, k);
    }
}
