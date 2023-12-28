package homework6.task2;

public class DogTest {
    public static void main(String[] args) {
        Dog labrador = new Labrador("Бакс", 3);
        Dog beagle = new Beagle("Чарли", 2);
        Dog bulldog = new Bulldog("Брут", 4);

        System.out.println(labrador);
        labrador.bark();
        labrador.eat("корм");

        System.out.println(beagle);
        beagle.bark();
        beagle.eat("мясо");

        System.out.println(bulldog);
        bulldog.bark();
        bulldog.eat("сухой корм");
    }
}
