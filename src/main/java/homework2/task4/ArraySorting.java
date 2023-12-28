package homework2.task4;

import java.util.Arrays;
import java.util.Random;

public class ArraySorting {
    public static void main(String[] args) {
        // Создаем массив из 10 целых чисел
        int[] numbers = new int[10];

        // Заполняем массив случайными числами
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100); // числа от 0 до 99
        }

        // Выводим исходный массив
        System.out.println("Исходный массив: " + Arrays.toString(numbers));

        // Сортируем массив
        Arrays.sort(numbers);

        // Выводим отсортированный массив
        System.out.println("Отсортированный массив: " + Arrays.toString(numbers));
    }
}
