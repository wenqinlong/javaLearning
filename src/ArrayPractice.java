import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        int[] b = a;
        int[] c = {1,2,3,4,5,6};
        int[] d = {2,3,4,5,6,7};
        System.out.println(a==b);  // a and b point to the same array.
        System.out.println(a==c);  // a and c point to different arrays.
        System.out.println(Arrays.equals(a,c));  // The values in a and c are equal, but they are not the same array.
        System.out.println(a==d);
    }
}
