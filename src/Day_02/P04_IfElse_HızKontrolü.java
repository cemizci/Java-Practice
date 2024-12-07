package Day_02;

import java.util.Scanner;

public class P04_IfElse_HızKontrolü {
    public static void main(String[] args) {
        /* Problem tanimi : Kulanicidan aracacinin hizini aliniz Trafik cezasinin
         * degerini hesaplayin. 45 hiz siniridir.
         * Eger Hiziniz 55-74 arasinda ise: Ceza 100 $'dir.
         * Eger Hiziniz 75 - 84 arasinda ise: Ceza 150 $'dir.
         * Eger Hiziniz 85 -94 arainda ise: Ceza 320 $'dir.
         * Eger Hiziniz 94'den daha fazla ise: Ceza 500 $'dir.
         * Eger kullanicinin ehliyeti yoksa cezaya 200 $ eklenir.
         * orn: Hiziniz 77 iken cezaniz 150$'dir ama ehliyetiniz yoksa ceza 350 $ olur.
         */


        Scanner scan = new Scanner(System.in);
        System.out.println("Tespit edilen Hız değerini giriniz");
        int speed = scan.nextInt();
        System.out.println("Şoförün ehliyeti var mı ? (e/h)");
        char dl = scan.next().charAt(0);
        int ceza = 0;

        if (speed<=55){
            ceza = 0;
        }else if (speed>55 && speed<=74){
            ceza=100;

        }else if (speed>=75 && speed<=84){
            ceza = 150;
        }else if (speed>=85 && speed<=94){
            ceza = 320;
        } else  {
            ceza = 500;
        }


        if (dl=='e'){
            if (ceza==0){
                System.out.println("Cezanız bulunmamaktadır.\nKurallara uyduğunuz için teşekkür ederiz");
            }else{
                System.out.println("Hız sınırını aşmanız nedeniyle kesilen ceza " + ceza);
            }

        }else {
            System.out.println("Hız sınırını aşmanız nedeniyle kesilen ceza : " + ceza);
            ceza = ceza + 200;
            System.out.println("Ehliyetiniz bulunmaması nedeniyle toplam cezanız : " + ceza);
        }





    }
}
