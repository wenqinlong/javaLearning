import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = {3, 2, 2, 3};
        System.out.println(Arrays.toString(removeElement(arr, 3)));

    }

    public static int[] removeElement(int[] nums, int val) {
        int len = nums.length;
        int l = 0;
        int n = 0;
        for (int i=0; i<nums.length-l-n; i++) {

            if (nums[i] == val ) {
                l++;
                SecondFor:
                for (int j=nums.length-1-n; j>=0; j--) {
                    if (nums[j] == val) {
                        n++;
                    }
                    else {
                        nums[i] = nums[j];
                        nums[j] = val;
                        break SecondFor;
                    }
                }
            }
        }
        return nums;
    }
}
