import java.util.Scanner;
import java.util.Arrays;

public class PolynomialSummation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] array1 = new int[100][2];
        int[][] array2 = new int[100][2];
        int[][] array3 = new int[100][2];

        int power1;
        int power2;
        do {
            power1 = in.nextInt();
            array1[100-power1-1][0] = power1;
            array1[100-power1-1][1] = in.nextInt();
        } while (power1!=0);

        do {
            power2 = in.nextInt();
            array2[100-power2-1][0] = power2;
            array2[100-power2-1][1] = in.nextInt();
        } while (power2!=0);

        for (int i=0; i<100; i++) {

            if (array1[i][0] != 0 && array2[i][0] != 0) {
                array3[i][0] = array1[i][0];

            }
            else {
                array3[i][0] = array1[i][0] + array2[i][0];
            }
            array3[i][1] = array1[i][1] + array2[i][1];


        }
        System.out.println(array2[99][1]);
        for (int i=0; i<100; i++) {
//            for (int j = 0; j < 2; j++) ;
            if (i!=98 && array3[i][1] != 0 && array3[i][0]!=0) {
                System.out.print(array3[i][1] + "x" + array3[i][0]);
            }
            else if (i==98 && array3[i][1] != 0 && array3[i][0]!=0) {
                System.out.print("+"+array3[i][1] + "x");
            }
            else if (array3[i][1] != 0 && array3[i][0]==0) {
                System.out.print("+"+array3[i][1]);
            }

        }

        // System.out.println(Arrays.toString());
    }
}