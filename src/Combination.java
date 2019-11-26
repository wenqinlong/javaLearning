/**
 * This is the combination formula.
 * @author Kiki
 * @version 1.0 11-23-2019
 */

import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = 1;
        int k = in.nextInt();
        for (int i=1; i<=k; i++) {
            result = (n-i+1) * result / i;
        }
        System.out.println(result);
    }
}
