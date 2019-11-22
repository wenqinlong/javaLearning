public class MultiplicationTable {

    public static void main(String[] args) {
        multiplicationTable(9);
    }

    /*
    修饰符 返回值类型 函数名（参数类型 形参1，参数类型 形参2）{
        执行语句；
        return 返回值；
    }
     */
    static void multiplicationTable(int num) {
        for (int i = 1; i<=9; i++) {
            for (int j=1; j<=i; j++) {
                if (j<i) {
                    System.out.printf("%dx%d=%d, ", j, i, i * j);
                }
                else {
                    System.out.printf("%dx%d=%d\n", j, i, i * j);
                }
            }
        }
    }
}
