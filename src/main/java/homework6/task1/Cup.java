package homework6.task1;

class Cup extends Dish {
    private int volume;

    public Cup(String material, int volume) {
        super(material);
        this.volume = volume;
    }

    @Override
    public void use() {
        isClean = false;
        System.out.println("Чашка используется.");
    }

    // Дополнительные методы, специфичные для чашки
}