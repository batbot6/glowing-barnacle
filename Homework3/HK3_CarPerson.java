public class HK3_CarPerson {

    public static void main(String[] args) {

        HK3_Car Bani4arka = new HK3_Car();
        Bani4arka.year = 1999;
        Bani4arka.price = 1400;
        Bani4arka.isSportCar = false;
        Bani4arka.fuelTankCapacity = 50;
        Bani4arka.freeFuel = 40;
        Bani4arka.engineFuelOperationSystem = "diesel";


        Bani4arka.useFuel(5.0); // taka razbrah uslovieto za zadelqne na gorivo?

        HK3_Car Ninja = new HK3_Car();
        Ninja.year = 2016;
        Ninja.price = 60000;
        Ninja.isSportCar = true;
        Ninja.fuelTankCapacity = 100; //per cent
        Ninja.freeFuel = 80;
        Ninja.engineFuelOperationSystem = "electric";
        Ninja.changeЕngineFuelOperationSystem("gaz"); //crime against autoenthusiasts =D
        Ninja.price = 35000;

        System.out.println("Bani4arka was produced in " + Bani4arka.year);
        System.out.println("Bani4arka cost " + Bani4arka.price);
        if (Bani4arka.isSportCar) {
            System.out.println("Bani4arka is a sports car");
        }
        else {
            System.out.println("Bani4arka is not a sports car");
        }

        System.out.println("Bani4arka's max fuel capacity is " + Bani4arka.fuelTankCapacity);
        System.out.println("Bani4arka's current fuel reserve is " + Bani4arka.freeFuel);

        System.out.println("Ninja was produced in " + Ninja.year);
        System.out.println("Ninja cost " + Ninja.price);
        if (Ninja.isSportCar) {
            System.out.println("Ninja is a sports car");
        }
        else {
            System.out.println("Ninja is not a sports car");
        }

        System.out.println("Ninja's max fuel capacity is " + Ninja.fuelTankCapacity);
        System.out.println("Ninja's current fuel reserve is " + Ninja.freeFuel);




    }
}
