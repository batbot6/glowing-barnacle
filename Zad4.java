import java.util.Scanner;

public class Zad4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Въведете стойност на работни часове");
        int chas = sc.nextInt();

        System.out.println("Въведете стойност на пари");
        double pari = sc.nextDouble();

        System.out.println ("Почивен ден ли е?");
        boolean poch = sc.nextBoolean();

        if (!poch) {
            System.out.println("Ще работя");
        }

        else if (pari > 10) {
             {
                System.out.println ("Shte otida na kino");
            }
        } else if ((pari > 0) && (pari < 10)) {
            System.out.println ("Shte otida za sladoled");
        }
            else if (pari <= 0) {
                System.out.println ("Shte gledam televiziq vku6ti");
        }
    }
}
