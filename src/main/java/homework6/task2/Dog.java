package homework6.task2;

abstract class Dog {
    protected String name;
    protected int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void bark();

    public void eat(String food) {
        System.out.println(name + " ест " + food + ".");
    }

    @Override
    public String toString() {
        return "Собака породы " + this.getClass().getSimpleName() + ", имя: " + name + ", возраст: " + age;
    }
}
