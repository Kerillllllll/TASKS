package Six;

abstract class Vehicle {
    protected String brand;
    protected String model;

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public abstract void start();
    public abstract void stop();

    @Override
    public String toString() {
        return "Марка: " + brand + ", Модель: " + model;
    }
}