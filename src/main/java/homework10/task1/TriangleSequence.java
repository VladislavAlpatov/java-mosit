package homework10.task1;

public class TriangleSequence {
    public static void main(String[] args) {
        int n = 10; // Пример вывода первых 10 членов последовательности
        printTriangleSequence(1, 0, n);
    }

    private static void printTriangleSequence(int currentNumber, int currentCount, int n) {
        if (n <= 0) {
            return; // Условие выхода из рекурсии
        }

        System.out.print(currentNumber + " ");

        // Если текущее число напечатано достаточное количество раз, переходим к следующему
        if (currentCount + 1 < currentNumber) {
            printTriangleSequence(currentNumber, currentCount + 1, n - 1);
        } else {
            printTriangleSequence(currentNumber + 1, 0, n - 1);
        }
    }
}
