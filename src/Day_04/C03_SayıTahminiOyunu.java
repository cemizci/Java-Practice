package Day_04;

import java.util.Random;
import java.util.Scanner;

public class C03_SayıTahminiOyunu {
    public static void main(String[] args) {

        /*
         Kullanıcıdan 1 ila 25 arasında tahmin yapıp belirlenen sayıyı bulup bulmadığını kontrol eden
         bulursa tebrikler bildiniz desin. tahmin hakkı 5 olmak üzere bilemediğinde
         üzgünüm bilmediniz ve 1 tahmin hakkınız kaldı desin

         */

        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        System.out.println("1 ile 500 arasında aklımdan bir sayı tuttum. Hadi tahmin et");

        int hedefSayı = random.nextInt(10);

        int tahmin = 0;
        int tahminSayısı = 1;
        int tahminHakkı = 5;

        while(tahminHakkı > 0 ) {
            System.out.println("Tahminini gir :");
            tahmin = scan.nextInt();

            if(tahmin < hedefSayı) {
                System.out.println("Doğru bilemediniz.Arttrarak devam ediniz");
            } else if (tahmin > hedefSayı) {
                System.out.println("Doğru bilemediniz.Azaltarak yeniden deneyiniz");
            } else {
                System.out.println(tahminSayısı + " Tebrikler! Doğru tahmin ettiniz.  ");
            }
            tahminSayısı++;
            tahminHakkı--;

            if (tahminHakkı > 0) {
                System.out.println(tahminHakkı + " adet tahmin hakkınız kaldı");
            }else {
                System.out.println("Üzgünüm bilemediniz. Tahmin etmeniz gereken sayı :" + hedefSayı);
            }

        }
    }
}
