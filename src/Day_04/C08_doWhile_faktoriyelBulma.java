package Day_04;

import java.util.Scanner;

public class C08_doWhile_faktoriyelBulma {
    // Problem Tanımı
    // Verilen bir sayının faktöriyelini özyineli (recursive) olarak
    // hesaplayan fonksiyonu yazınız.

    public static void main(String[] args) {

        System.out.println(faktoriyelBul());
    }
    public static int faktoriyelBul() {
        Scanner scan=new Scanner(System.in);
        System.out.print("Sayıyı Giriniz: ");
        int sayı= scan.nextInt();
        int faktoriyel=1;

        do {
            faktoriyel *= sayı;
            sayı--;
        }while (sayı > 0 );

        return faktoriyel;
    }

}


