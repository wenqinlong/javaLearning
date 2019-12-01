package coreJavaI.equals;

import java.util.ArrayList;
import java.util.Objects;

public class equalTest {
    public static void main(String[] args) {
        Employee alice1 = new Employee("Alice", 75000, 1988, 12, 18);
        Employee alice3 = new Employee("Alice", 75000, 1988, 12, 18);
        Employee alice2 = alice1;
        Employee bob = new Employee("Bob", 50000, 1990, 1, 1);
        System.out.println(alice1.toString());
        System.out.println("alice1 hashCode: " + alice1.hashCode());
        System.out.println("alice2 hashCode: " + alice2.hashCode());
        System.out.println("alice3 hashCode: " + alice3.hashCode());

        System.out.println("alice1==alice2: " + (alice1==alice2));
        System.out.println("alice1==alice3: " + (alice1==alice3));

        System.out.println("alice1 equals alice2: " + alice1.equals(alice2));
        System.out.println("alice1 equals alice3: " + alice1.equals(alice3));

        Manager carl = new Manager("Carl", 100000, 1977, 1, 1);
        Manager boss = new Manager("Carl", 100000, 1977, 1, 1);

        boss.setBonus(5000);
        System.out.println("boss toString " + boss.toString());
        System.out.println("boss == carl " + (boss==carl));
        System.out.println("boss equals carl " + (boss.equals(carl)));
        System.out.println("boss hashCode: " + boss.hashCode());
        System.out.println("carl hashCode: " + carl.hashCode());
        System.out.println();


        ArrayList<Employee> employees = new ArrayList<>(100); // 最初容量为100的数组列表，也可以不指定容量
        System.out.println(employees.size());
        employees.add(new Employee("Harry", 5000, 1999, 1, 1)); // add 添加新的元素
        employees.add(new Employee("Haha", 50000, 1999, 10, 1));
        System.out.println(employees.size());
        employees.trimToSize();
        System.out.println(employees.get(1).toString());  // get 获取已有的元素
        employees.set(1, new Employee("Hahaha", 500000, 2005, 1,1)); // set替换已有的元素；
        System.out.println(employees.get(1).toString());
        employees.ensureCapacity(200);
        employees.add(new Employee("Happy", 50000, 1999, 10, 1));

        Employee[] staff = new Employee[3];
        System.out.println(staff.length);
    }
}
