package homework11.task1;

class Student {
    int iDNumber;

    public Student(int iDNumber) {
        this.iDNumber = iDNumber;
    }

    @Override
    public String toString() {
        return "Student{" + "iDNumber=" + iDNumber + '}';
    }
}