import java.util.Arrays;
import java.util.Scanner;

public class ArrayAverage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double sum = 0;
        System.out.print("Please enter the array size: ");
        int count = in.nextInt();
        if (count>0) {
            int numbers[] = new int[count];
            for (int i=0; i<numbers.length; i++) {
                numbers[i] = in.nextInt();
                sum += numbers[i];
            }

            System.out.println(Arrays.toString(numbers));
            System.out.println(sum/count);

        }
    }
}