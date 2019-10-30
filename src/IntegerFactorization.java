import java.util.Scanner;

public class IntegerFactorization {
    public static boolean isPrime(int a) {
        boolean prime = true;
        for (int i=2; i <= (int)Math.sqrt(a); i++) {   // It is <=.
            if (a%i==0) {
                prime = false;
            }
        }
        return prime;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        if (isPrime(number)) {
            System.out.print(number+"="+number);
        }
        else {
            int[] primes;
            System.out.print(number+"=");

            for (int i=2; i<=number;) {
                if (number == i) {
                    System.out.print(number);
                    break;
                } else if (number%i==0) {
                    number = number / i;
                    System.out.print(i+"x");
                } else {
                    i++;
                }
            }
        }
    }
}
