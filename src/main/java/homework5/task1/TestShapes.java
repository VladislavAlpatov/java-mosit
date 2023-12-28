package homework5.task1;

// Абстрактный класс Shape
abstract class Shape {
    protected String color;

    // Конструктор
    public Shape(String color) {
        this.color = color;
    }

    // Абстрактные методы
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}

// Класс Circle
class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Класс Rectangle
class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }
}

public class TestShapes {
    public static void main(String[] args) {
        // Тестирование Circle
        Circle circle = new Circle("Красный", 5.0);
        System.out.println("Circle (Color: " + circle.color + ", Radius: 5.0) - Area: " + circle.calculateArea() + ", Perimeter: " + circle.calculatePerimeter());

        // Тестирование Rectangle
        Rectangle rectangle = new Rectangle("Синий", 4.0, 6.0);
        System.out.println("Rectangle (Color: " + rectangle.color + ", Width: 4.0, Height: 6.0) - Area: " + rectangle.calculateArea() + ", Perimeter: " + rectangle.calculatePerimeter());

        // Добавление других фигур для тестирования, если необходимо
    }
}
