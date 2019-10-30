import java.util.Scanner;
public class PreZero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int res;
        int count = 0;
        if (number>=0) {
            while (number != 0) {
                number = number / 2;
                count += 1;
            }
            System.out.println(32 - count);
        } else {
            System.out.println(0);
        }
    }
}


