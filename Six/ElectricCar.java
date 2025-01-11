package Six;

class ElectricCar extends Vehicle {
    private int batteryLevel;

    public ElectricCar(String brand, String model) {
        super(brand, model);
        this.batteryLevel = 0;
    }

    @Override
    public void start() {
        System.out.println("Электромобиль " + toString() + " запущен.");
    }

    @Override
    public void stop() {
        System.out.println("Электромобиль " + toString() + " остановлен.");
    }

    public void charge(int percent) {
        batteryLevel = Math.min(batteryLevel + percent, 100);
        System.out.println("Электромобиль " + toString() + " заряжен на " + percent + "%. Уровень заряда: " + batteryLevel + "%.");
    }
}
