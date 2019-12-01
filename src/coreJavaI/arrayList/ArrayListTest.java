package coreJavaI.arrayList;

import coreJavaI.equals.*;

import java.util.*;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Employee> staff = new ArrayList<>();
        staff.add(new Employee("Carl", 7500, 1975, 1, 1));
        staff.add(new Employee("Bobby", 8000, 1976, 1, 1));
        staff.add(new Employee("Andrew", 7988, 1988, 1, 1));

        for (Employee e : staff) {
            e.raiseSalary(5);
        }

        for(Employee e : staff) {
            System.out.println("name=" + e.getName() + ", salary=" + e.getSalary() + ", hireDay=" + e.getHireDay());
        }
    }
}