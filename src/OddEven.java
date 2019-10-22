import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int even = 0;
        int odd = 0;
        while (true) {
            int number = in.nextInt();
            if (number == -1) {
                break;
            }
            if (number % 2 == 0) {
                even = even + 1;
            }
            else {
                odd = odd + 1;
            }
        }
        System.out.println(odd+" "+even);
    }
}
