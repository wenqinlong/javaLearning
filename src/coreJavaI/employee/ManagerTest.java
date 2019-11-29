package coreJavaI.employee;

public class ManagerTest {
    public static void main(String[] args) {

        Manager boss = new Manager("BB King", 50000, 1998, 1, 1);
        boss.setBonus(50000);

        Employee[] employees = new Employee[3];
        employees[0] = boss;
        employees[1] = new Employee("Toby", 30000, 1998, 5, 1);
        employees[2] = new Employee("Bobby", 20000, 1999, 5, 1);

        for (Employee e : employees) {
            System.out.println("Name: " + e.getName() + ", Salary: " + e.getSalary());
        }
    }
}
