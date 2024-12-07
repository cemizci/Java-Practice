package Day_04;

import java.util.Scanner;

public class C04_whileLoop {
    public static void main(String[] args) {
        /*
        kullanıcdan alınan bir sayinin basamak degerlerinin toplamini
        while loop ile yazdıran bir method create ediniz.

        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 10'dan büyük bir sayı giriniz");
        long sayı = scan.nextInt();

        basamakDegeriTopla(sayı);

    }

    public static void basamakDegeriTopla(long sayı) {
        int toplam = 0;
        long girilenSayı = sayı;

        while(sayı!=0){
            toplam+=sayı%10;
            sayı/=10;
        }
        System.out.println("Girdiğiniz "+girilenSayı+" sayısının basamak değerleri toplamı="+toplam);
    }
}
