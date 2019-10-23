import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] data = {3,2,5,7,4,954,23,75};
        int x = in.nextInt();
        int location = -1;
        for (int i=0; i<data.length; i++) {
            if (x==data[i]) {
                location = i;
                break;
            }
        }
        if (location>-1) {
            System.out.println("We found it in the array, the location is "+location+".");
        }
        else {
            System.out.println("It's not in the array.");
        }
        // for-each loop, give the value, but doesn't give the index
        for (int k : data) {
            System.out.println(k);
        }
    }
}