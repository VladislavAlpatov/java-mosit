package homework9.task1;

class Car implements Nameable {
    private String model;

    public Car(String model) {
        this.model = model;
    }

    @Override
    public String getName() {
        return model;
    }
}
