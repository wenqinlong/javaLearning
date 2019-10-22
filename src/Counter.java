import java.util.Scanner;
import java.util.Arrays;

public class Counter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x;
        int[] numbers = new int[10];
        x = in.nextInt();
        while (x!=-1) {
            if (x>=0 && x<=9) {
                numbers[x]++;
            }
            x = in.nextInt();
        }
        System.out.println(Arrays.toString(numbers));
    }
}