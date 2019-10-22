import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int type = in.nextInt();
        in.close();
        switch (type) {
            case 1:
                System.out.println("Good morning!");
                 break;
            case 2:
                System.out.println("Good afternoon");
                break;
            case 3:
                System.out.println("Good evening");
                break;
            case 4:
                System.out.println("Good night!");
            default:
                System.out.println("What the hell!");

        }
    }
}
