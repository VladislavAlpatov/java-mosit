package homework5.task5;

import homework5.task4.Movable;
import homework5.task4.MovablePoint;

public class MovableRectangle implements Movable
{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    // Конструктор
    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    // Метод для проверки, что точки имеют одну и ту же скорость
    public boolean isSpeedEqual() {
        return (topLeft.xSpeed == bottomRight.xSpeed) && (topLeft.ySpeed == bottomRight.ySpeed);
    }

    // Реализация методов интерфейса Movable

    @Override
    public void MoveUp() {
        if (isSpeedEqual()) {
            topLeft.MoveUp();
            bottomRight.MoveUp();
        }
    }

    @Override
    public void MoveDown() {
        if (isSpeedEqual()) {
            topLeft.MoveDown();
            bottomRight.MoveDown();
        }
    }

    @Override
    public void MoveLeft() {
        if (isSpeedEqual()) {
            topLeft.MoveLeft();
            bottomRight.MoveLeft();
        }
    }

    @Override
    public void MoveRight() {
        if (isSpeedEqual()) {
            topLeft.MoveRight();
            bottomRight.MoveRight();
        }
    }

    // Дополнительный метод для вывода позиции прямоугольника
    public void printRectangle() {
        System.out.print("Rectangle Top-Left position: ");
        topLeft.printPosition();
        System.out.print("Rectangle Bottom-Right position: ");
        bottomRight.printPosition();
    }

    // Метод toString для строкового представления объекта
    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }
}
