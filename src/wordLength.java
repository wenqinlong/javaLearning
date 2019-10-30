import java.util.Arrays;
import java.util.Scanner;

public class wordLength {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s;
        s = in.nextLine();
        String[] stringList = s.split("\\s");

        for (String sp : stringList) {
            if (sp.length() != 0 && !s.trim().equals(".")) {
                if (sp.endsWith(".")) {
                    System.out.print(sp.length() - 1);
                } else {
                    System.out.print(sp.length() + " ");
                }
            }
        }
    }
}
