package homework9.task2;

class Artwork implements Priceable {
    private double value;

    public Artwork(double value) {
        this.value = value;
    }

    @Override
    public double getPrice() {
        return value;
    }
}