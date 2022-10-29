import java.util.Scanner;

public class Zad2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Въведете стойност на int1");
        int int1 = sc.nextInt();
        System.out.println("Въведете стойност на double1");
        double double1 = sc.nextDouble();
        System.out.println("Въведете стойност на int2");
        int int2 = sc.nextInt();
        System.out.println("Въведете стойност на double2");
        double double2 = sc.nextDouble();

        double temp = int1;
        int1 = (int)double1;
        double1 = int2;
        int2 = (int)double2;
        double2 = temp;

        System.out.println("int1 e " + int1);
        System.out.println("double1 e " + double1);
        System.out.println("int2 e " + int2);
        System.out.println("double2 e " + double2);

        double doubc1 = (double)int1;
        double1 = (double) double1;
        double doubc2= (double)int2;
        double2 = (double)double2;

        System.out.println("Сумата на double числата е " + (doubc1+doubc2+double1+double2));
        System.out.println(doubc1 + " " + double1 + " " + doubc2 + " "+ double2);
        doubc1 = (int)doubc1;
        doubc2 = (int)doubc2;
        double1 = (int)double1;
        double2 = (int)double2;

        System.out.println("Сумата на int числата е " + (doubc1+doubc2+double1+double2));
        System.out.println(doubc1 + " " + double1 + " " + doubc2 + " "+ double2);
    }
}
