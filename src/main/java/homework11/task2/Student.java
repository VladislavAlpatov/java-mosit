package homework11.task2;

class Student {
    private int iDNumber;
    private double gpa;

    public Student(int iDNumber, double gpa) {
        this.iDNumber = iDNumber;
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{" + "ID=" + iDNumber + ", GPA=" + gpa + '}';
    }
}
