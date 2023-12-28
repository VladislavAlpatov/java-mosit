package homework2.task2;

public class ArgumentsPrinter {
    public static void main(String[] args) {
        // Проверка, есть ли аргументы
        if (args.length == 0) {
            System.out.println("Нет аргументов командной строки");
            return;
        }

        // Вывод аргументов командной строки
        for (int i = 0; i < args.length; i++) {
            System.out.println("Аргумент " + (i + 1) + ": " + args[i]);
        }
    }
}

