package coreJavaI.abstractClasses;

public class Student extends Person {
    private String major;

    /**
     * @param name name of the student's name
     * @param major major of the student's major
     */
    public Student(String name, String major) {
        super(name);
        this.major = major;
    }

    public String getMajor() {
        return this.major;
    }

    public String getDescription() {
        return "A student majoring in " + major;
    }

}

