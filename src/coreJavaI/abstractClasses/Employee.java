package coreJavaI.abstractClasses;

import java.time.LocalDate;

public class Employee extends Person {
    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day) {
        super(name);
        this.salary = salary;
        hireDay = LocalDate.of(year, month, day);
    }

    public double getSalary() {
        return this.salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPercent) {
        salary = salary * (1 + byPercent / 100);
    }

    public String getDescription() {
        return String.format("An employee wiht a salary of $%8.2f", salary);
    }

    //public boolean equals(Object otherObject) {
    //    if (this == otherObject) {
    //        return true;
    //    }
    //
    //    if (otherObject==null) {
    //        return false;
    //    }
    //
    //    if (this.getClass()!=otherObject.getClass()) {
    //        return false;
    //    }
    //
    //    return this.getName().equals(other.name)
    //}
}
