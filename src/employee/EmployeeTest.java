package employee;

import java.time.*;
import employee.Employee;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Jack", 5000, 2000, 1, 1);
        staff[1] = new Employee("Pony", 4000, 2001, 1, 1);
        staff[2] = new Employee("Robin", 3500, 2002, 1, 1);

        for (Employee e : staff) {
            e.raiseSalary(5);
        }

        //staff[0].setName("Pony");
        Employee.tripleSalary(staff[1]);

        for (Employee e : staff) {
            e.setId();
            System.out.println("name: "+e.getName() +", id: "+e.getId()+ ", salary: "+e.getSalary()+", hireDay: "+e.getHireDay());
        }
        System.out.println(staff[0].getName().equals(staff[1].getName()));
        System.out.println(Employee.getNextId());  // 如果getNextId没有设置为静态方法，就不能用类名调用，只能通过实例对象调用
        System.out.println(staff[0].getNextId());
    }
}
