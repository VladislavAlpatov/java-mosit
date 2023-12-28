package homework6.task1;

class Plate extends Dish {
    private int diameter;

    public Plate(String material, int diameter) {
        super(material);
        this.diameter = diameter;
    }

    @Override
    public void use() {
        isClean = false;
        System.out.println("Тарелка используется.");
    }

    // Дополнительные методы, специфичные для тарелки
}

