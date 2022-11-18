public class HK2_Zad5 {

    public static void main(String[] args) {
        int[] a = {10,12,1,8,4};
        int[] b = new int[10]  ;
        for (int i = 0; i < a.length; i++) {
            b[i]=a[i]; }

        for (int i = 0; i < a.length; i++) {
            System.out.println(b[i]);
        }

    }
}
