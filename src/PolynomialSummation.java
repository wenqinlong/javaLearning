import java.util.Arrays;
import java.util.Scanner;

public class PolynomialSummation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int power1;
        int power2;

        int maxPower1 = in.nextInt();
        int[][] array1 = new int[maxPower1 + 1][2];
        array1[0][0] = maxPower1;
        array1[0][1] = in.nextInt();

        if (maxPower1 != 0) {
            do {
                power1 = in.nextInt();
                array1[maxPower1 - power1][0] = power1;
                array1[maxPower1 - power1][1] = in.nextInt();
            } while (power1 != 0);
        }

        int maxPower2 = in.nextInt();
        int[][] array2 = new int[maxPower2 + 1][2];
        array2[0][0] = maxPower2;
        array2[0][1] = in.nextInt();
        if (maxPower2 != 0) {
            do {
                power2 = in.nextInt();
                array2[maxPower2 - power2][0] = power2;
                array2[maxPower2 - power2][1] = in.nextInt();
            } while (power2 != 0);
        }
//        System.out.println(Arrays.deepToString(array1));
//        System.out.println(Arrays.deepToString(array2));
        // 判断最大幂
        int maxPower;
        if (maxPower1 >= maxPower2) {
            maxPower = maxPower1;
        } else {
            maxPower = maxPower2;
        }

        int[][] sum = new int[maxPower + 1][2];

        if (maxPower1 >= maxPower2) {
            sum = array1;
//            System.out.println(Arrays.deepToString(sum));
            for (int i = maxPower; i>=maxPower1-maxPower2; i--) {
                if (sum[i][0] != 0 && array2[i-maxPower1+maxPower2][0] != 0) {
                    sum[i][0] = array1[i][0];
                } else {
                    sum[i][0] = array1[i][0] + array2[i-maxPower1+maxPower2][0];
                }
                sum[i][1] = array1[i][1] + array2[i-maxPower1+maxPower2][1];
            }
        } else {
            sum = array2;
            for (int i=maxPower; i>=maxPower2-maxPower1; i--) {
                if (sum[i][0] != 0 && array1[i-maxPower2+maxPower1][0] != 0) {
                    sum[i][0] = array2[i][0];
                } else {
                    sum[i][0] = array1[i-maxPower2+maxPower1][0] + array2[i][0];
                }
                sum[i][1] = array1[i-maxPower2+maxPower1][1] + array2[i][1];
            }
        }
//        System.out.println(Arrays.deepToString(sum));

        //数sum有多少空行
        int count = 0;
        for (int i = 0; i <= maxPower; i++) {
            if (sum[i][1] == 0) {
                count += 1;
            }
        }

        //删除空行
        int count2=0;
        int[][] simplySum = new int[maxPower+1-count][2];
        for (int i=0; i<maxPower+1; i++) {
            if (sum[i][1]!=0) {
                simplySum[i-count2][0] = sum[i][0];
                simplySum[i-count2][1] = sum[i][1];
            }
            else {
                count2 += 1;
            }
        }
//        System.out.println(Arrays.deepToString(simplySum));
//        System.out.println(simplySum.length);

        //输出
        if (count!=maxPower+1) {
            for (int i = 0; i < simplySum.length; i++) {
                if (i < simplySum.length - 2) {
                    if (i==0 || simplySum[i][1]<0) {
                        if (simplySum[i][1] == -1){
                            System.out.print("-x" + simplySum[i][0]);
                        }
                        else {
                            System.out.print(simplySum[i][1] + "x" + simplySum[i][0]);
                        }

                    }
                    else {
                        if (simplySum[i][1]==1){
                            System.out.print("+"+"x" + simplySum[i][0]);
                        }
                        else {
                            System.out.print("+"+simplySum[i][1]+"x" + simplySum[i][0]);
                        }
                    }
                }
                else {
                    if (simplySum[i][0] == 1) {
                        if (i == 0 || simplySum[i][1] < 0) {
                            if (simplySum[i][1]==-1){
                                System.out.print("-x");
                            }
                            else {
                                System.out.print(simplySum[i][1] + "x");
                            }
                        } else {
                            if (simplySum[i][1]==1) {
                                System.out.print("+" + "x");
                            }
                            else {
                                System.out.print("+" + simplySum[i][1] + "x");
                            }
                        }
                    } else if (simplySum[i][0] == 0) {
                        if (i == 0 || simplySum[i][1] < 0)
                            System.out.print(simplySum[i][1]);
                        else {
                            System.out.print("+" + simplySum[i][1]);
                        }
                    }
                }
            }
        }
        else {
            System.out.print(0);
        }
    }
}

/*
 *检查0，1，-1等特殊的数值
 */
