public class Overload {
    public static void main(String[] args) {
        int sumTwo;
        int sumThree;
        String sumStr;
        sumTwo = add(2, 5);
        sumThree = add(1,2, 5);
        sumStr = add("Hello", " world!");
        System.out.println(sumTwo);
        System.out.println(sumThree);
        System.out.println(sumStr);
    }

    /*重载
    *同名函数，参数列表（参数个数，参数类型）不一样，就是重载，和返回参数类型没关系。
    *  */
    public static int add(int a, int b) {
        return a + b;
    }
    public static int add(int a, int b, int c) {
        return a + b + c;
    }
    public static String add(String a, String b) {
        return a + b;
    }
}
