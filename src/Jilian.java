import java.util.Scanner;

public class Jilian {
    public static void main(String[] args) {
        int f;
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if (x > 0) {
            f = 2 * x;
        } else if (x == 0) {
            f = 0;
        } else {
            f = -1;
        }
        System.out.println(f);
        in.close();
    }
}

