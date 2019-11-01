package clock;// 一个编译单元最多只能有一个 public 的类

public class Display {
    private int value = 0;   // private 只有在这个类内部可以访问。 是针对类，而不是针对对象
    private int limit = 0;   // 如果没有没有标明是 public 还是 private,只有在同一个包内可以访问

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
        return value;
    }


    public static void main(String[] args) {
        Display d = new Display(24);
        System.out.println(d.value);
        d.value++;
        System.out.println(d.value);

        for (int i=0;i<24;i++) {
            d.increment();
            System.out.println(d.getValue());
        }

    }
}
