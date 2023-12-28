package homework4.task3;

public class BookTest {
    public static void main(String[] args) {
        // Создаем книгу
        Book book = new Book("Лев Толстой", "Война и мир", 1869);

        // Выводим информацию о книге
        book.displayInfo();

        // Изменяем информацию о книге и выводим ее снова
        book.setAuthor("Федор Достоевский");
        book.setTitle("Преступление и наказание");
        book.setYear(1866);
        book.displayInfo();
    }
}
