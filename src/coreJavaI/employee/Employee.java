package coreJavaI.employee;

import java.time.LocalDate;

public class Employee {
    private static int nextId;
    // instance fields
    private int id;
    private String name;
    private double salary;
    private LocalDate hireDay;

    // constructor
    public Employee() {}

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;  // 如果写成  name=name, 则local变量并没有把值赋给实例域；最好不要命名与实例域相同的变量名字。
        this.salary = salary;
        hireDay = LocalDate.of(year, month, day);
    }

    // methods
    public String getName() {
        return name;
    }

    public String setName(String name) {
        return this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPercent) {
        salary = salary * (1 + byPercent/100);
    }

    public static void tripleSalary(Employee employee) {
        employee.raiseSalary(200);
    }

    public boolean equals(Employee other) {
        return name.equals(other.name);
    }

    public void setId() {
        id = nextId;
        nextId++;
    }

    public int getId() {
        return id;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Happy", 1000000, 2000, 1, 1);
        System.out.println(employee.getName());
        // System.out.println(id); // error
        Employee employee1 = new Employee();
    }

}
