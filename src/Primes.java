import java.util.Scanner;

public class Primes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        for (int j=2; ;j++) {
            boolean isPrimes = true;
            for (int i = 2; i < j; i++) {
                if (j % i == 0) {
                    isPrimes = false;
                    break;
                }
            }
            if (isPrimes) {
                System.out.print(j + " ");
                count += 1;
            }
            if (count==10) {
                break;
            }
//        else {
//            System.out.println(n+" is not a Combined number.");
//        }
        }
    }
}

// ! > && > || 优先级 非与或
