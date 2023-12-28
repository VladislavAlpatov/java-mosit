package homework6.task2;


class Bulldog extends Dog {
    public Bulldog(String name, int age) {
        super(name, age);
    }

    @Override
    public void bark() {
        System.out.println(name + " говорит: Ррр-Гав!");
    }

    // Дополнительные методы, специфичные для бульдогов
}