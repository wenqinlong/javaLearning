import java.util.Scanner;
import java.math.BigInteger;

public class BigIntegerTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int n = in.nextInt();

        BigInteger lotteryOdds = BigInteger.valueOf(1);
        for (int i=1; i<=k; i++) {
            lotteryOdds = lotteryOdds.multiply(BigInteger.valueOf(n-i+1)).divide(BigInteger.valueOf(i)); // 计算组合数
        }
        System.out.println(lotteryOdds);
    }
}
