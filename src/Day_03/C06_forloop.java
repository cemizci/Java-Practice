package Day_03;

public class C06_forloop {
    public static void main(String[] args) {
        /*
         * Girilen bir stringdeki a harfi sayısını bulunuz. ama c harfine gelirse
         * döngüden çıkılsın
         *
         * Bugün hava oldukca güzel.-> 2
         *
         *
         */

        String cumle = "Bugün hava oldukca güzel.";

        int sayac = 0;
        for (int i = 0; i < cumle.length(); i++) {
            if( cumle.toLowerCase().charAt(i) == 'a' ){
                sayac++;
            }
            if (cumle.toLowerCase().charAt(i) == 'c' ){
                break;
            }

        }
        System.out.println(sayac);

    }
}
