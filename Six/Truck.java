package Six;

class Truck extends Vehicle implements Fuelable {
    private int fuelLevel;

    public Truck(String brand, String model) {
        super(brand, model);
        this.fuelLevel = 0;
    }

    @Override
    public void start() {
        System.out.println("Грузовик " + toString() + " запущен.");
    }

    @Override
    public void stop() {
        System.out.println("Грузовик " + toString() + " остановлен.");
    }


    public void refuel(int liters) {
        fuelLevel += liters;
        System.out.println("Грузовик " + toString() + " заправлен на " + liters + " литров. Уровень топлива: " + fuelLevel + " литров.");
    }

    @Override
    public int getFuelLevel() {
        return fuelLevel;
    }

    public void refuel(double gallons) {
        double liters =  gallons * 3.785;
        fuelLevel += liters;
        System.out.println("Автомобиль " + toString() + " заправлен на " + gallons + " галлонов. Уровень топлива: " + fuelLevel + " литров.");
    }
}
