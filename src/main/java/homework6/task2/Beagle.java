package homework6.task2;

class Beagle extends Dog {
    public Beagle(String name, int age) {
        super(name, age);
    }

    @Override
    public void bark() {
        System.out.println(name + " говорит: Вуф-Вуф!");
    }

    // Дополнительные методы, специфичные для биглей
}