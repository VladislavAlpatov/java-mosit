package homework1.task1;

public class TestDog {
    public static void main(String[] args) {
        // Создаем экземпляр класса DogKennel
        DogKennel kennel = new DogKennel();

        // Добавляем собак в питомник
        kennel.addDog(new Dog("Buddy", 3));
        kennel.addDog(new Dog("Lucy", 4));
        kennel.addDog(new Dog("Max", 2));

        // Выводим информацию о собаках в питомнике
        System.out.println(kennel);
    }
}