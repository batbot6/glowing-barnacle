public class HK2_Zad6 {

    public static void main(String[] args) {

        int[] a = {1,2,3,4,8,9};
        int[] b = {1,2,3,4,8,9,7};
        boolean flag=true;

        if (a.length != b.length) {
            flag = false;
        }



        for (int i = 0; i < a.length; i++) {

            if (a[i] != b[i]) {
                flag = false;
            }
        }

            if (flag == true) {

                System.out.print ("The two arrays are the same");
            }

            else  {
                System.out.print ("The two arrays are different");

        }

    }

}
