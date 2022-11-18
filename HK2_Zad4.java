import java.lang.Math;
public class HK2_Zad4 {

    public static void main(String[] args) {
        int a[] = new int[10];

        for (int i = 0; i < 10; i++) {
            a[i] = (int) (Math.random() * 50);
            System.out.println(i + "th element is: " + a[i]);
        }
           int i=9;
        while (i >= 0) {
            System.out.println(a[i]);
            i--;
        }


    }
}
//yay, това не само че се получи, ами и грешно поставените отначало скоби ми дадоха първата програма която щеше да върви безкрайно дълго :Д
