import java.util.Scanner;

public class PerfectNumber {
    public static boolean isPerfect(int a) {
        int sum=1;
        for (int i=2; i<a/2+1; i++) {
            if (a%i==0) {
                sum += i;
            }
        }
        return (sum==a);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        String s="";
        for (int i=n; i<=m; i++) {
            // 1 is not a perfect number.
            if (i!=1 && isPerfect(i)) {
                s += (i+" ");
            }
        }
        System.out.println(s.trim());
    }
}
