import java.util.Scanner;
import java.util.Arrays;

public class ArrayInitial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] scores = {89, 88, 78, 97, 67, 90};
        System.out.println(scores.length);
        int[] a = scores;
        for (int i=0; i<scores.length; i++) {
            System.out.print(scores[i]+" ");
            a[i] = i;
        }
        System.out.println(Arrays.toString(scores));
    }
}