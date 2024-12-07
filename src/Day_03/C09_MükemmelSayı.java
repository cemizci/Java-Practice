package Day_03;

import java.util.Scanner;

public class C09_MükemmelSayı {
    public static void main(String[] args) {

        /*
               Bir sayinin mükemmel olup olmadiğini bulan bir method yaziniz.
               Mükemmel sayi : bir sayinin kendisi hariç bölenlerinin toplamı,
                               kendisine eşitse o sayi mükemmeldir.
               ORNEK:
               INPUT     : 6
               OUTPUT : 1,2,3
                             1+2+3 = 6 = 6 (Mükemmel)

               mukemmel sayi kontrolu
               1. kullanicidan sayi alalim
               2. bir toplam degiskeni olusturuyoruz
               3. sayinin bolenleri bul
               4. bolenleri toplamla topla
               5. sayiyla toplamin esitligini kontrol et

           */

        System.out.println("********* Mükemmel Sayı Kontrol Programı *********");
        Scanner scan=new Scanner(System.in);
        System.out.print("Kontrol Edilecek Sayı:");
        int sayı= scan.nextInt();
        int toplam=0;

        for (int i = 1; i < sayı; i++) {
            if (sayı % i == 0){
                toplam+=i;
                System.out.println(i);
            }

        }

        System.out.println("Toplam : "+ toplam);

        if (toplam==sayı){
            System.out.println("Girdiğiniz sayı mükemmel bir sayıdır");
        }else {
            System.out.println("Girdiğiniz sayı mükemmel bir sayı değildir");
        }




    }
}
