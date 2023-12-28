package homework9.task2;

class Service implements Priceable {
    private double serviceCharge;

    public Service(double serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    @Override
    public double getPrice() {
        return serviceCharge;
    }
}