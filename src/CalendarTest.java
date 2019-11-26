/**
 * @version 1.0 2019-11-25
 * @author Kiki
 */

import java.time.*;

public class CalendarTest {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();

        date = date.minusDays(today-1);  //  生成当前日期之后或之前n天的日期
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue(); // Mon-1, Tue-2, ..., Sun-7

        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for (int i=1; i<value; i++) {
            System.out.print("    ");
        }
        while (date.getMonthValue() == month) {
            System.out.printf("%3d", date.getDayOfMonth());
            if (date.getDayOfMonth() == today) {
                System.out.print("*");
            }
            else {
                System.out.print(" ");
            }
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() ==1) {
                System.out.println();
            }
        }
        if (date.getDayOfWeek().getValue() !=1) {
            System.out.println();
        }
    }
}
