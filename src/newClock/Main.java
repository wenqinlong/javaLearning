package newClock;

public class Main {
    public static void main(String[] args) {

        Clock clock = new Clock();
        while (true) {
            clock.tick();
        }
    }
}
