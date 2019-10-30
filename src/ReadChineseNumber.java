import java.util.Scanner;

public class ReadChineseNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        String strNumber = String.valueOf(number);  // strNumber = Integer.toString(number);
        String[] ChiNumber = {"ling", "yi", "er", "san", "si", "wu", "liu", "qi", "ba", "jiu"};
        for (int i=0; i<strNumber.length(); i++) {
            String item = strNumber.substring(i,i+1);
            if (item.equals("-")) {
                System.out.print("fu"+" ");
            } else {
                if (i==strNumber.length()-1) {
                    System.out.print(ChiNumber[Integer.valueOf(item)]);
                } else {
                    System.out.print(ChiNumber[Integer.valueOf(item)] +" ");
                }
            }
        }
    }
}
