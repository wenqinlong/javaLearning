import java.util.Scanner;

public class NumberFeature {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int digit;
        int place = 0;
        int result = 0;
        int feature = 0;
        int number = in.nextInt();
        do {
            digit = number % 10;
            place = place + 1;
            if (digit%2 == place%2) {
                feature = 1;
            }
            result = feature * (int)(Math.pow(2, place-1)) + result;

            number = number / 10;
            feature = 0;
        } while (number != 0);
        System.out.println(result);
    }
}
