package homework4.task3;

public class Book {
    private String author;
    private String title;
    private int year;

    // Конструктор
    public Book(String author, String title, int year) {
        this.author = author;
        this.title = title;
        this.year = year;
    }

    // Геттеры и сеттеры
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Метод для отображения информации о книге
    public void displayInfo() {
        System.out.println("Книга: " + title + ", Автор: " + author + ", Год: " + year);
    }
}
