package constructorTest;

public class ConstructorTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Harry", 20000);
        staff[1] = new Employee(6000);
        staff[2] = new Employee();

        for(Employee e:staff) {
            System.out.println("name: " + e.getName() + ", id: " + e.getId() + ", salary: " + e.getSalary());
        }
    }
}
