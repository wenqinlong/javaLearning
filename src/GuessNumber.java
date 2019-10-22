import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = (int)(Math.random()*100);
        int count = 0;
        int guess;
        do {
            guess = in.nextInt();
            count = count + 1;
            if (guess > number) {
                System.out.println("Your guess is bigger!");
            }
            else if (guess < number) {
                System.out.println("Your number is smaller!");
                }
            } while (guess != number);

        System.out.println("Count="+count+", Bingo!");
        }
    }
// 7 times (included)