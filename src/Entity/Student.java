package Entity;

public class Student {
    double grade;
    String name;

    public Student(double grade, String name) {
        this.name=name;
        this.grade=grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "grade=" + grade +
                ", name='" + name + '\'' +
                '}';
    }
}
