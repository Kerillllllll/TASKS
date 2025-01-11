package Six;

interface Fuelable {
    void refuel(int liters);
    int getFuelLevel();
    default void refuel(double gallons) {
        int liters = (int) (gallons * 3.785);
        refuel(liters);
    }
}
