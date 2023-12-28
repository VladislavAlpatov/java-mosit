package homework5.task5;

public class MovableRectangleTest {
    public static void main(String[] args) {
        // Создаем объект MovableRectangle
        MovableRectangle movableRectangle = new MovableRectangle(0, 0, 5, 5, 1, 1);

        // Печатаем начальную позицию прямоугольника
        System.out.println("Начальная позиция прямоугольника:");
        movableRectangle.printRectangle();

        // Проверяем, одинакова ли скорость у обеих точек
        System.out.println("Скорости движения точек прямоугольника одинаковы? " + movableRectangle.isSpeedEqual());

        // Двигаем прямоугольник вверх и вправо
        movableRectangle.MoveUp();
        movableRectangle.MoveRight();

        // Печатаем позицию прямоугольника после перемещения
        System.out.println("Позиция прямоугольника после перемещения вверх и вправо:");
        movableRectangle.printRectangle();

        // Двигаем прямоугольник вниз и влево
        movableRectangle.MoveDown();
        movableRectangle.MoveLeft();

        // Печатаем позицию прямоугольника после перемещения
        System.out.println("Позиция прямоугольника после перемещения вниз и влево:");
        movableRectangle.printRectangle();
    }
}
