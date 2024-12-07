package Day_02;

import java.util.Scanner;

public class P01_IfElseSatement {
    public static void main(String[] args) {

        /*
         * BASİT HESAP MAKİNESİ
         * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
         *  dort islemden biri ile isleme koyup sonucun yazdiriniz
         */

        Scanner scan = new Scanner (System.in);
        System.out.println("İşlemyapacağınız iki sayıyı ve işlem türünü giriniz");
        System.out.println("1.sayı : ");
        double  sayı1= scan.nextDouble();
        System.out.println("2.sayı : ");
        double sayı2 = scan.nextDouble();

        System.out.println("Lutfen islem turunu giriniz.. (*, /, +, -)");
        char islem = scan.next().charAt(0);


        if (islem == '+'){
            double sonuc = sayı1 + sayı2;
            System.out.println("Sonuç" + sonuc);
        }else if (islem =='-'){
            double sonuc = sayı1 - sayı2;
            System.out.println("Sonuç" + sonuc);
        }else if (islem == '*'){
            double sonuc = sayı1 * sayı2;
            System.out.println("Sonuç" + sonuc);
        }else if (islem == '/'){
            double sonuc = sayı1 / sayı2;
            System.out.println("Sonuç" + sonuc);
        }else {
            System.out.println("Geçersiz bir işlem girdiniz");
        }









    }
}
