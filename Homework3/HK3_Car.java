public class HK3_Car {
    int year;
    double price;
    boolean isSportCar;
    double fuelTankCapacity;
    double freeFuel;
    String engineFuelOperationSystem;

    public void changeЕngineFuelOperationSystem(String newЕngineFuelOperationSystem) {
        engineFuelOperationSystem = newЕngineFuelOperationSystem;
    }

    public void useFuel(double fuel) {
        if (fuel > freeFuel){
            System.out.println("Not enough free fuel!");
        }

        else {
            freeFuel = (freeFuel - fuel);
        }
    }




}
