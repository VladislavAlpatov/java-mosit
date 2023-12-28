package homework9.task1;

public class NameableTest {
    public static void main(String[] args) {
        Nameable planet = new Planet("Земля");
        Nameable car = new Car("Тесла");
        Nameable animal = new Animal("Кошка");

        System.out.println("Название планеты: " + planet.getName());
        System.out.println("Модель машины: " + car.getName());
        System.out.println("Вид животного: " + animal.getName());
    }
}
