package homework4.task1;

public class CircleTest {
    public static void main(String[] args) {
        // Создаем объект класса Circle с радиусом 5
        Circle circle = new Circle(5.0);

        // Выводим начальные значения радиуса, площади и периметра
        System.out.println("Радиус: " + circle.getRadius());
        System.out.println("Площадь: " + circle.getArea());
        System.out.println("Периметр: " + circle.getPerimeter());

        // Изменяем радиус и выводим обновленные значения
        circle.setRadius(7.0);
        System.out.println("Новый радиус: " + circle.getRadius());
        System.out.println("Новая площадь: " + circle.getArea());
        System.out.println("Новый периметр: " + circle.getPerimeter());
    }
}
