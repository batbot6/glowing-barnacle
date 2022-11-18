import java.util.Scanner;
import java.util.logging.XMLFormatter;

public class HK2_Zad1 {
    public static void SumChis (int f, int r) {  //adds the two numbers
        int Sum1 = f +r;
        System.out.println("The sum of the numbers is: " + Sum1);
    }
    public static void main(String[] args) {  // main
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter X: ");
        int x = sc.nextInt();


        System.out.println("Enter Y: ");
        int y = sc.nextInt();

        SumChis(x, y); // adds and displays sum of the two numbers

    }

}

// не ми се получи съвсем това - не знам в момента как да направя SumChis така че да не е void, a int, и да изкарва резултат като изходен параметър, вместо да
// слагам system.out.println в нея