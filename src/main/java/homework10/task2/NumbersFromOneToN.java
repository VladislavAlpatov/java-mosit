package homework10.task2;

public class NumbersFromOneToN {
    public static void main(String[] args) {
        int n = 10; // Пример: вывод чисел от 1 до 10
        printNumbers(1, n);
    }

    private static void printNumbers(int current, int n) {
        if (current > n) {
            return; // Условие выхода из рекурсии
        }

        System.out.print(current + " ");

        // Рекурсивный вызов функции с увеличенным на 1 текущим значением
        printNumbers(current + 1, n);
    }
}
