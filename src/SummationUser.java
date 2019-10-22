import java.util.Scanner;

public class SummationUser {
    public static void main(String[] args) {    // 切记[]
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double sum = 0.0;
        int sign = 1;
        for (int i=1; i<=n; i++) {
            sum = sum + sign * 1./i;
            sign = -sign;
        }
        System.out.println(sum);
        System.out.printf("%.2f", sum);
    }
}
