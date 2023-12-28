package homework11.task2;

public class Test {
    public static void main(String[] args) {
        Student[] students = {
                new Student(1, 3.5),
                new Student(2, 4.0),
                new Student(3, 2.8),
                new Student(4, 3.9)
        };

        SortingStudentsByGPA comparator = new SortingStudentsByGPA();
        QuickSort.sort(students, 0, students.length - 1, comparator);

        System.out.println("Студенты, отсортированные по GPA:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
