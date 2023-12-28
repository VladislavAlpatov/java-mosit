package homework2.task1;

public class ArraySum {
    public static void main(String[] args) {
        // Инициализация массива
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Переменная для хранения суммы элементов
        int sum = 0;

        // Считаем сумму элементов массива
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        // Считаем среднее арифметическое
        double average = (double) sum / array.length;

        // Выводим результат на экран
        System.out.println("Сумма элементов массива: " + sum);
        System.out.println("Среднее арифметическое: " + average);
    }
}
