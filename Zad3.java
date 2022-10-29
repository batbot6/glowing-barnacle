import java.util.Scanner;

public class Zad3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Въведете стойност на n1");
        int n1 = sc.nextInt();

        System.out.println("Въведете стойност на n2");
        int n2 = sc.nextInt();

        System.out.println("Въведете стойност на n3");
        int n3 = sc.nextInt();

        int temp = 0;
        temp = n1;
        n1 = n2;
        n2 = n3;
        n3 = temp;

        System.out.println ("Разликата между сбора на новите две стойности и третото число е " + (n1+n2-n3));


    }



}