package coreJavaI.abstractClasses;

public class PersonTest {
    public static void main(String[] args) {
        Person[] people = new Person[2];

        people[0] = new Employee("Haha", 50000, 2010, 1, 1);
        people[1] = new Student("Henry", "Computer science");

        for (Person p : people) {
            System.out.println(p.getName() + ": " + p.getDescription());
        }
    }
}
