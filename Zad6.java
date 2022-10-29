import java.util.Scanner;

public class Zad6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Въведете число, съответстващо на ден от седмицата");
        int dayNum = sc.nextInt();
        String dayString="";


        switch (dayNum) {
            case 1: dayString = "Понеделник";
                break;
            case 2: dayString = "Вторник";
                break;
            case 3: dayString = "Сряда";
                break;
            case 4: dayString = "Четвъртък";
                break;
            case 5: dayString = "Петък";
                break;
            case 6: dayString = "Събота";
                break;
            case 7: dayString = "Неделя";
                break;

            default:System.out.println("Невалиден ден!");

        }

        System.out.println(dayString);

    }

}
