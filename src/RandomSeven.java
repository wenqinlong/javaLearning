import java.util.Arrays;
import java.util.Scanner;

public class RandomSeven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[7];

        for (int i=0; i<a.length; i++) {
            OUT_WHILE:
            while (true) {
                a[i] = (int)(Math.random()*36+1);
                for (int j=0; j<i; j++) {
                    if (a[i]==a[j]) {
                        continue OUT_WHILE;
                    }
                }
                break;
            }
        }
        System.out.println(Arrays.toString(a));
    }

}
