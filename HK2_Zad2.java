import java.util.Scanner;

public class HK2_Zad2 {

    public static void Srednochis (int f, int r) {  //calculates average of two numbers
        double average = (double)(f +r) / 2;
        System.out.format("The average is: %.2f", average);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter X: ");
        int x = sc.nextInt();


        System.out.println("Enter Y: ");
        int y = sc.nextInt();

        Srednochis(x,y);


    }
}

//същият случай като с първата задача