import java.util.Scanner;

public class GCDandLCM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int m = in.nextInt();
        int n = in.nextInt();
        int temp;
        int a = m;
        int b = n;
        while (b!=0) {
            temp = a % b;
            a = b;
            b = temp;
        }
        System.out.println("The GCD of "+m+" and "+n+" is "+a+".");
        System.out.println("The LCM of "+m+" and "+n+" is "+m*n/a+".");

    }
}