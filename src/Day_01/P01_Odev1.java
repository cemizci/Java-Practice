package Day_01;

import java.util.Scanner;

public class P01_Odev1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Adınız : ");
        String isim = scan.nextLine();

        System.out.println("Soyadınız : ");
        String soyIsim = scan.nextLine();

        System.out.print("Mail adresiniz : ");
        String email = scan.nextLine();

        System.out.print("Yaşınız : ");
        int yas = scan.nextInt();

        System.out.println("Şifreniz : ");
        int sifre = scan.nextInt();

        System.out.println(" ******       KAYIT BAŞARILI      ******");
        System.out.println("Adınız : " + isim + "\nSoyadınız : " + soyIsim + "\nYaşınız : " + yas + "\nemail " + email + "\nŞifreniz : " + sifre );



















    }
}
