package Day_01;

import javax.swing.*;
import java.util.Scanner;

public class P02_Odev_2 {
    public static void main(String[] args) {

     /*
        ÖDEV SORUSU: Aşağıdaki gibi bir ATM Karşılama Ekranı Hazırlayıp yazdırınız
        ********** WISE BANK  **********
            WISE ATM’YE HOŞGELDİNİZ
            1 – Bakiye Sorgulama
            2 – Para Yatırma
            3 – Para Çekme
            4 – Bilgi Güncelleme
            5 – Kart İade
        ********** WISE BANK  **********
         */

        System.out.println(" ********** WISE BANK  **********\n      WISE ATM’YE HOŞGELDİNİZ");
        System.out.println("     -------------------------");
        System.out.println(" 1- Bakiye Sorgulama\n 2- Para Yatırma\n 3- Para Çekme\n 4- Bilgi Güncelleme\n 5- Kart İade");
        System.out.println(" ********** WISE BANK  **********");

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz");
        int sayı = scan.nextInt();

        switch (sayı){
            case 1:
                System.out.println("Bakiyeniz 1000 TL");
                break;
            case 2:
                System.out.println("Hangi hesabınıza para yatırmak istiyorsunuz?");
                break;
            case 3:
                System.out.println("Çekebileceğiniz max. tutar 20.000 Tl'dir");
                break;
            case 4:
                System.out.println("Güncellemek istediğiniz bilgilerinizi giriniz");
                break;
            case 5:
                System.out.println("Kartınızı unutmayınız!\n İyi Günler Dileriz");
                break;
        }












    }
}
