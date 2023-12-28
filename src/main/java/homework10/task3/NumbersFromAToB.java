package homework10.task3;

public class NumbersFromAToB {
    public static void main(String[] args) {
        printNumbersFromAToB(5, 10); // Пример: вывод чисел от 5 до 10
        System.out.println(); // Для разделения вывода
        printNumbersFromAToB(10, 5); // Пример: вывод чисел от 10 до 5
    }

    private static void printNumbersFromAToB(int a, int b) {
        if (a < b) {
            System.out.print(a + " ");
            if (a != b) {
                printNumbersFromAToB(a + 1, b);
            }
        } else {
            System.out.print(a + " ");
            if (a != b) {
                printNumbersFromAToB(a - 1, b);
            }
        }
    }
}
