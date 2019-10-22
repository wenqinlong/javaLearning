import java.util.Scanner;

public class TimeSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int bjt = in.nextInt();
        int utc = 000;
        if (bjt - 800 >= 0) {
            utc = bjt - 800;
            System.out.println(utc);
            }
//        else if (bjt - 800 >= 100) {
//            utc = bjt - 800;
//            String str1 = String.format("%03d", utc);
//            System.out.format("%03d", utc);
//        }

        else  {
            utc = bjt + 1600;
            }
        System.out.println(utc);
        in.close();
    }
}
