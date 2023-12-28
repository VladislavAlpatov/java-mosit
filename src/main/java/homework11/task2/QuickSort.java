package homework11.task2;
import java.util.Comparator;
public class QuickSort {
    public static void sort(Student[] students, int low, int high, Comparator<Student> comparator) {
        if (low < high) {
            int pi = partition(students, low, high, comparator);
            sort(students, low, pi - 1, comparator);
            sort(students, pi + 1, high, comparator);
        }
    }

    private static int partition(Student[] students, int low, int high, Comparator<Student> comparator) {
        Student pivot = students[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (comparator.compare(students[j], pivot) > 0) {
                i++;
                Student temp = students[i];
                students[i] = students[j];
                students[j] = temp;
            }
        }

        Student temp = students[i + 1];
        students[i + 1] = students[high];
        students[high] = temp;

        return i + 1;
    }
}
