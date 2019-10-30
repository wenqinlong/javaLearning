public class SummationFunc {


    public static void main(String[] args) {
        summation(1, 10);
        summation(20, 30);
        summation(35, 45);
    }

    public static void summation(int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
        }
        System.out.println(a+"到"+b+"的和是"+sum);
    }
}

// 避免在函数中使用多个return
