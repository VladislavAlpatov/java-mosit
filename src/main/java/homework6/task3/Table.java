package homework6.task3;

class Table extends Furniture {
    private int length;

    public Table(String material, String color, int length) {
        super(material, color);
        this.length = length;
    }

    @Override
    public void displayInfo() {
        System.out.println("Стол длиной " + length + " см, " + super.toString());
    }
}
