package coreJavaI.employee;

public class Manager extends Employee {
    private double bonus;

    // constructor

    /**
     * @param name the employee's name
     * @param salary the salary
     * @param year the hire year
     * @param month the hire month
     * @param day the hire day
     */
    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
        bonus = 0;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getSalary() {
        double baseSalary = super.getSalary();  // super 调用超类中的同名函数
        return baseSalary + bonus;
    }

    public static void main(String[] args) {
        Manager boss = new Manager("BB King", 50000, 1998, 1, 1);
        boss.setBonus(50000);
        boss.getSalary();
        System.out.println(boss.getSalary());
    }
}
