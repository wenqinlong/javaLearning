package employee;

public class ParamTest {
    public static void main(String[] args) {

        // test 1: Methods cannot modify numeric parameters
        System.out.println("Testing tripleValue");
        double percent=10;
        System.out.println("Before: percent="+percent);
        tripleValue(percent);
        System.out.println("After: percent:"+percent);

        // test2: Methods can change the state of object parameters
        Employee harry = new Employee("Harry", 2000, 2000, 1, 1);
        System.out.println("Before: salary:" + harry.getSalary());
        tripleSalary(harry);
        System.out.println("After: salary:" + harry.getSalary());

        // test3: Methods cannot attach new objects to object parameters;
        Employee bob = new Employee("Bob", 5000, 2001, 5, 2);
        System.out.println("Before: bobName="+bob.getName()+" harryName="+harry.getName());
        swap(bob, harry);
        System.out.println("Before: bobName="+bob.getName()+" harryName="+harry.getName());
    }

    public static void tripleValue(double x) {
        x = 3 * x;
        System.out.println("End of method: x="+x);
    }

    public static void tripleSalary (Employee x) {
        x.raiseSalary(200);
        System.out.println("End of method: salary="+x.getSalary());
    }

    public static void swap(Employee x, Employee y) {
        Employee temp = x;
        x = y;
        y = temp;
        System.out.println("End of method: xName="+x.getName()+" yName="+y.getName());
    }
}
