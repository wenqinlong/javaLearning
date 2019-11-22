import java.util.Scanner;

public class ToHex {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int dec = in.nextInt();
        String hex = toHex(dec);
        System.out.println(hex);

    }

    public static String toHex(int decimal) {
        char[] chars = new char[8];

        int index = chars.length;
        while(decimal!=0) {
            if (decimal == 0) {
                break;
            }
            int temp = decimal & 15;
            if (temp>9) {
                chars[--index] = (char)(temp-10+'A');
            }
            else {
                chars[--index] = (char) (temp + '0');
            }
            decimal = decimal>>>4;

        }

        return toString(chars, index);
    }

    public static String toString(char[] arr, int index) {
        String temp = "";
        for (int i=index; i<arr.length; i++) {
            temp += arr[i];
        }
        return "0x"+temp;
    }
}
