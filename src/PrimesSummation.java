import java.util.Scanner;

public class PrimesSummation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int count = 0;
        int sum = 0;
        OUT:
        for (int i=2; ; i++) {
            boolean isPrime = true;
            for (int j=2; j<i; j++) {
                if (i%j==0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count += 1;
                if (count >= n && count<=m) {
                    System.out.println("i is "+i);
                    sum += i;
                }
                }
            if (count==m) {
                break OUT;
            }

        }
        System.out.println(sum);
    }
}