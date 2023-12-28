package homework11.task3;

import java.util.Arrays;

public class TestMergeSort {
    public static void main(String[] args) {
        Student[] list1 = {
                new Student("Alice", 3.5),
                new Student("David", 3.0)
        };
        Student[] list2 = {
                new Student("Bob", 3.7),
                new Student("Carol", 3.2)
        };

        Student[] combinedList = Arrays.copyOf(list1, list1.length + list2.length);
        System.arraycopy(list2, 0, combinedList, list1.length, list2.length);

        MergeSort.sort(combinedList, 0, combinedList.length - 1);

        System.out.println("Объединенный и отсортированный список студентов:");
        for (Student student : combinedList) {
            System.out.println(student);
        }
    }
}
