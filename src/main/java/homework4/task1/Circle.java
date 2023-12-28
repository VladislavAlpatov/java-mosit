package homework4.task1;

public class Circle {
    private double radius;

    // Конструктор
    public Circle(double radius) {
        this.radius = radius;
    }

    // Геттер для радиуса
    public double getRadius() {
        return radius;
    }

    // Сеттер для радиуса
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Метод для вычисления площади
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Метод для вычисления периметра (длины окружности)
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
