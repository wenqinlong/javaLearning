import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = 0;
        int sum = 0;
        int count = 0;
        double average = 0;
        while (true) {
            number = in.nextInt();
            if (number == -1) {
                break;
            }
            sum = sum + number;
            count = count + 1;

        }
        if (count > 0) {
            average = (double) (sum) / count;
            System.out.println(average);
        }
    }
}