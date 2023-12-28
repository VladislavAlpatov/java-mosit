package homework6.task2;

class Labrador extends Dog {
    public Labrador(String name, int age) {
        super(name, age);
    }

    @Override
    public void bark() {
        System.out.println(name + " говорит: Гав-Гав!");
    }

    // Дополнительные методы, специфичные для лабрадоров
}