package homework11.task1;



public class StudentTest {

    public static void insertionSort(Student[] students) {
        for (int i = 1; i < students.length; i++) {
            Student current = students[i];
            int j = i - 1;
            while (j >= 0 && students[j].iDNumber > current.iDNumber) {
                students[j + 1] = students[j];
                j--;
            }
            students[j + 1] = current;
        }
    }


    public static void main(String[] args) {
        Student[] students = {
                new Student(3),
                new Student(1),
                new Student(5),
                new Student(4),
                new Student(2)
        };

        System.out.println("До сортировки:");
        for (Student student : students) {
            System.out.println(student);
        }

        insertionSort(students);

        System.out.println("\nПосле сортировки:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
