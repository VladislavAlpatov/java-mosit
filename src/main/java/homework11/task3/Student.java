package homework11.task3;

class Student implements Comparable<Student> {
    private String name;
    private double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public int compareTo(Student other) {
        return Double.compare(this.gpa, other.gpa); // Сравнение по GPA
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", gpa=" + gpa + '}';
    }
}
