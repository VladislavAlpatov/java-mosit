package homework6.task3;

class Chair extends Furniture {
    private String style;

    public Chair(String material, String color, String style) {
        super(material, color);
        this.style = style;
    }

    @Override
    public void displayInfo() {
        System.out.println("Стул в стиле " + style + ", " + super.toString());
    }
}