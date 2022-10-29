import java.util.Scanner;
import java.util.logging.XMLFormatter;

public class Zad1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Въведете стойност на x");
        double x = sc.nextDouble();
        System.out.println("Въведохте " + x + " за Х");

        System.out.println("Въведете стойност на y");
        double y = sc.nextDouble();
        System.out.println("Въведохте " + y + " за Y");

        System.out.println("Въведете стойност за проверка");
        double z = sc.nextDouble();

        if (((x <= z) && (z <= y)) || ((y <=z) && (z <= x))){
            System.out.println("Числото за проверка е между двете стойности");


        } else  { System.out.println("числото не е между двете стойности");

        }

        System.out.println("X e " + x);
        System.out.println("Y e " + y);
        System.out.println("Z e " + z);
    }
}
