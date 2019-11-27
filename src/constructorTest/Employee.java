package constructorTest;

import java.util.Random;

public class Employee {
    private static int nextId;

    private int id;
    private String name="";  // 实例域初始化
    private double salary;

    // static initialization block
    static {
        Random generator = new Random();
        nextId = generator.nextInt(10000);  // 返回一个0 - n-1 的整数
    }

    // object initialization block
    {
        id = nextId;
        nextId++;
    }

    // overloaded constructor
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee(double salary) {
        // call the Employee(String, double) constructor
        this("#" + nextId, salary);  // 调用另外一个构造器
    }

    public Employee() {}

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }
}
