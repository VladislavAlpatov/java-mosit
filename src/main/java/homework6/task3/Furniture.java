package homework6.task3;

abstract class Furniture {
    protected String material;
    protected String color;

    public Furniture(String material, String color) {
        this.material = material;
        this.color = color;
    }

    public abstract void displayInfo();

    @Override
    public String toString() {
        return "Мебель из " + material + " цвета " + color;
    }
}
