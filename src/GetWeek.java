import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class GetWeek {
    public static void main(String[] args) {
        System.out.println("Please enter a integer between 0 and 8: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(getWeek(num));
    }

    public static String getWeek(int num) {

        if (num<1 || num>7) {
            throw new RuntimeException(num+" is out of range.");
        }
        String[] weeks = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        return weeks[num-1];
    }
}
