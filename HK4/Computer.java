public class Computer {

    int year;
    double price;
    String OperationSystem;

    Computer(int year, double price, String OperationSystem) {
        this.year = year;
        this.price = price;
        this.OperationSystem = OperationSystem ;

    }

     int comparePrice(Computer comp1) {
        if  (price > comp1.price) {   //sravnenie mejdu compare.price
            System.out.println("-1");
                return -1;

            }

         if (price < comp1.price) {
            System.out.println("1");

            return 1;
        }

            return 0;
    }
}
