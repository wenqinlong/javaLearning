package clock;// 一个编译单元最多只能有一个 public 的类

public class Display {
    private int value = 0;   // private 只有在这个类内部可以访问。 是针对类，而不是针对对象
    private int limit = 0;   // 如果没有没有标明是 public 还是 private,只有在同一个包内可以访问
    private static int step = 0;  // 类变量，初始化和对象的创建时没有关系的

    public Display(int limit) {
        this.limit = limit;
    }

    public void increment() {
        value++;
        if (value==this.limit) {
            value = 0;
        }
    }

    public int getValue() {
        return this.value;  // 没有this 也可以
    }

    public static void f() {
        // this.value++;  // 语法错误，因为类函数只能方位类变量
        step++;   // 语法正确，因为step是类变量，并且不能用this.来调用
    }

    public static void main(String[] args) {    // 这里的 static 标明这个函数是类函数，
                                                // 不属于任意一个对象，和对象没有关系
//        Display d = new Display(24);
//        System.out.println(d.value);
//        d.value++;
//        System.out.println(d.value);
//
//        for (int i=0;i<24;i++) {
//            d.increment();
//            System.out.println(d.getValue());
//        }

        Display d1 = new Display(12);
        Display d2 = new Display(20);
        d1.increment();
        System.out.println(d1.getValue());
        System.out.println(d2.getValue());

        Display.step = 1;  // 类变量可以用类名直接访问和赋值，也可以用对象名字直接访问赋值

        System.out.println(d1.step);
        System.out.println(d2.step);

        d1.step = 2;
        System.out.println(d1.step);
        System.out.println(d2.step);
        System.out.println(Display.step);

        f();   // 类函数的调用不需要前边加对象
        d1.f();
    }
}
