
import java.util.Scanner;

public class ComputerPrices {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Computer comp1 = new Computer(0,0, "test");
        Computer comp2 = new Computer(2012 ,20000, "Ubuntu");
        System.out.println ("Enter year: ");

        comp1.year = sc.nextInt();

        System.out.println ("Year is " + comp1.year);

        System.out.println ("Enter operation system: ");
        comp1.OperationSystem = sc.nextLine();
        System.out.println("Enter price: ");


        comp1.price = sc.nextInt();
        System.out.println ("Price  is " + comp1.price);


        int result = comp1.comparePrice(comp2);
        System.out.println("result = " + result);
    }
}
