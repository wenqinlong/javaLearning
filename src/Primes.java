//import java.util.Scanner;
//
//public class Primes {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int count = 0;
//        boolean isPrimes = true;
//        int x = in.nextInt();
//        if (x == 1 || x % 2 == 0 && x != 2) {
//            isPrimes = false;
//        }
//        else {
//            for (int i=3; i<Math.sqrt(x); i+=2) {
//                if (x%i==0) {
//                    isPrimes = false;
//                    break;
//                }
//            }
//        }
//        if (isPrimes) {
//            System.out.println("x is a prime.");
//        }
//        else {
//            System.out.println("x is not a prime.");
//        }
//    }
//}
//
//// sqrt(n)
//// ! > && > || 优先级 非与或


// Second method to fine primes
import java.util.Scanner;

public class Primes{
    public static void main(String[] args) {
        // create a table including the first 50 primes
        Scanner in = new Scanner(System.in);
        boolean[] isPrimes = new boolean[100];
        for (int i=2; i<isPrimes.length; i++) {
            isPrimes[i] = true;
        }

        for (int i=2; i<isPrimes.length; i++) {
            if (isPrimes[i]) {
                for (int j=2; i*j<isPrimes.length; j++) {
                    isPrimes[i*j] = false;
                }
            }
        }
        for (int i=2; i<isPrimes.length; i++) {
            if (isPrimes[i]) {
                System.out.print(i+" ");
            }
        }

    }

}
