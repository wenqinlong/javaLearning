public class VendingMachine {
    int price = 8;    // 成员变量
    int balance = f();
    int total;

    int f() {
        return 10;
    }

    // 重载
    VendingMachine() {
        total = 0;
    }

    VendingMachine(int price) {
        this.price = price;
    }

    void setPrice(int price) {   // 本地变量
        this.price = price;
    }
    void showPrompt() {
        System.out.println("Welcome");
    };

    void insertMoney(int amount) {
        balance += amount;
    }

    void showBalance() {
        System.out.println(balance);
    }

    void getFood() {
        if (balance >= price) {
            System.out.println("Here you are.");
            balance -= price;
            total += price;
        }
    }

    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();
        vm.showPrompt();
        vm.showBalance();
        vm.insertMoney(10);
        vm.getFood();
        vm.showBalance();

        VendingMachine vm1 = new VendingMachine(100);
        vm1.insertMoney(100);
        vm1.showBalance();
    }


}
