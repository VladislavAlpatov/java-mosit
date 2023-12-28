package homework6.task3;

class Sofa extends Furniture {
    private int seatingCapacity;

    public Sofa(String material, String color, int seatingCapacity) {
        super(material, color);
        this.seatingCapacity = seatingCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("Диван на " + seatingCapacity + " мест, " + super.toString());
    }
}