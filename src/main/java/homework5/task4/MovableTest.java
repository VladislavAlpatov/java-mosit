package homework5.task4;

public class MovableTest {
    public static void main(String[] args) {
        // Создаем объект MovablePoint
        MovablePoint point = new MovablePoint(0, 0, 1, 1);
        System.out.println("Начальная позиция точки: ");
        point.printPosition();

        // Двигаем точку вверх и вправо
        point.MoveUp();
        point.MoveRight();
        System.out.println("Позиция точки после перемещения вверх и вправо: ");
        point.printPosition();

        // Создаем объект MovableCircle
        MovableCircle circle = new MovableCircle(10, 10, 2, 2, 5);

        // Двигаем круг вниз и влево
        circle.MoveDown();
        circle.MoveLeft();
    }
}