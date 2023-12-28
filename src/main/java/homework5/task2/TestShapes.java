package homework5.task2;

abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape() {
        // Значения по умолчанию могут быть заданы здесь
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape[color=" + color + ", filled=" + filled + "]";
    }
}
class Circle extends Shape {
    private double radius;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle[radius=" + radius + ", " + super.toString() + "]";
    }
}
class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle() {
        this.width = 1.0;
        this.length = 2.0;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "Rectangle[width=" + width + ", length=" + length + ", " + super.toString() + "]";
    }
}
class Square extends Rectangle {

    public Square() {
        super(1.0, 1.0);
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return width; // Или length, поскольку для квадрата width = length
    }

    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }

    @Override
    public void setWidth(double side) {
        setSide(side);
    }

    @Override
    public void setLength(double side) {
        setSide(side);
    }

    @Override
    public String toString() {
        return "Square[side=" + getSide() + ", " + super.toString() + "]";
    }
}
public class TestShapes {
    public static void main(String[] args) {
        // Тестирование Circle
        Circle circle = new Circle(5.0, "зеленый", true);
        System.out.println(circle);
        System.out.println("Площадь круга: " + circle.getArea());
        System.out.println("Периметр круга: " + circle.getPerimeter());

        // Тестирование Rectangle
        Rectangle rectangle = new Rectangle(4.0, 5.0, "красный", false);
        System.out.println(rectangle);
        System.out.println("Площадь прямоугольника: " + rectangle.getArea());
        System.out.println("Периметр прямоугольника: " + rectangle.getPerimeter());

        // Тестирование Square
        Square square = new Square(4.0, "синий", true);
        System.out.println(square);
        System.out.println("Площадь квадрата: " + square.getArea());
        System.out.println("Периметр квадрата: " + square.getPerimeter());

        // Демонстрация полиморфизма
        Shape shapeRef;

        shapeRef = circle;
        System.out.println("Цвет фигуры: " + shapeRef.getColor());
        System.out.println("Площадь фигуры: " + shapeRef.getArea());

        shapeRef = rectangle;
        System.out.println("Цвет фигуры: " + shapeRef.getColor());
        System.out.println("Площадь фигуры: " + shapeRef.getArea());

        shapeRef = square;
        System.out.println("Цвет фигуры: " + shapeRef.getColor());
        System.out.println("Площадь фигуры: " + shapeRef.getArea());
    }
}
