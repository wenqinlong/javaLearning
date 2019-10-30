import java.util.Arrays;
import java.util.Scanner;

public class GPSDataProcessing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = "";
        String time = "";

        while (true) {
            s = in.nextLine();
            if (s.equals("END")) {
                break;
            }
            String subString, subSubString;
            String[] stringList;
            String state;
            int validation = 0;

            int pos = s.lastIndexOf("$GPRMC");
            subString = s.substring(pos + 1);
            int starPos = subString.lastIndexOf("*");
            subSubString = subString.substring(0, starPos);
            stringList = subSubString.split(",");
            state = stringList[2];

            for (int i = 0; i < subSubString.length(); i++) {
                validation = validation ^ (int) subSubString.charAt(i);
            }
            Boolean flag;
            flag = state.equals("A");
            Boolean valid;
            valid = ((validation % 65536) == Integer.parseInt(subString.substring(starPos + 1, starPos + 3), 16));
            if (flag && valid) {
                time = stringList[1];
            }
        }
        if (time!="") {
            int hour = Integer.parseInt(time.substring(0, 2));
            String minute = time.substring(2, 4);
            String second = time.substring(4, 6);
            int hourBJ;
            hourBJ = (hour + 8) % 24;

            if (hourBJ < 10) {
                System.out.print("0" + hourBJ + ":");
            } else {
                System.out.print(hourBJ + ":");
            }
            System.out.print(minute + ":" + second);
        }
    }
}
