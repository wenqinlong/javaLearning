import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int digit;
        int count = 0;
        int results = 0;
        do {
            digit = number % 10;
            results = results * 10 + digit;
            count = count + 1;
            number = number / 10;
        } while (number != 0);    // Condition
        System.out.println(results);
    }
}