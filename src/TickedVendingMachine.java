import java.util.Scanner;

public class TickedVendingMachine {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);

        int balance = 0;
        while (true) {
            System.out.print("请投币：");
            int amount = in.nextInt();
            balance  = balance + amount;
            if (balance >= 10) {
                System.out.println("******************");
                System.out.println("* Java城际铁路专线 *");
                System.out.println("*   Price ￥10   *");
                System.out.println("******************");

                System.out.println("找零：" + (balance - 10));
                balance = 0;

            }
        }
    }
}
