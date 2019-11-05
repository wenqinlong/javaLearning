package clock;

public class Clock {
    private Display hour = new Display(24);
    private Display minute = new Display(60);

    public void start() {

        while (true) {
            minute.increment();
            if (minute.getValue() == 0) {
                hour.increment();
            }
            System.out.printf("%02d:%02d\n", hour.getValue(), minute.getValue());
        }
    }

    public static void main(String[] args) {
        Clock clock = new Clock();
        clock.start();

    }
}


// 不在同一个包里的类，调用需要用 import, 文件夹管理包，同一个文件夹下的源代码文件都属于同一个包
