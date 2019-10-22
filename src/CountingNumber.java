import java.util.Scanner;

public class CountingNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int counter = 0;
        do
         {
            number = number / 10;
            counter = counter + 1;
            System.out.println("Number="+number+", counter="+counter);
         } while (number >0);
        // difference between do-while and while
         System.out.println(counter);
    }

}