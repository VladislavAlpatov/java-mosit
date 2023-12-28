package homework6.task1;

class Bowl extends Dish {
    private int depth;

    public Bowl(String material, int depth) {
        super(material);
        this.depth = depth;
    }

    @Override
    public void use() {
        isClean = false;
        System.out.println("Миска используется.");
    }

    // Дополнительные методы, специфичные для миски
}
