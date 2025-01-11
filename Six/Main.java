package Six;

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Car("Toyota", "Corolla"),
                new Truck("Volvo", "FH16"),
                new ElectricCar("Tesla", "Model S")
        };

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
            vehicle.start();
            vehicle.stop();

            if (vehicle instanceof Fuelable) {
                Fuelable fuelable = (Fuelable) vehicle;
                fuelable.refuel(50);
                fuelable.refuel(5.6);
            }

            else if (vehicle instanceof ElectricCar) {
                ElectricCar electricCar = (ElectricCar) vehicle;
                electricCar.charge(30);
            }

            System.out.println(vehicle);
        }
    }
}
