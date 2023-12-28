package homework6.task1;

abstract class Dish {
    protected String material;
    protected boolean isClean;

    public Dish(String material) {
        this.material = material;
        this.isClean = true;
    }

    public void wash() {
        isClean = true;
        System.out.println("Посуда вымыта.");
    }

    public abstract void use();

    @Override
    public String toString() {
        return "Посуда из " + material + (isClean ? " чистая" : " грязная");
    }
}
