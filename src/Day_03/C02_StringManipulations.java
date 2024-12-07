package Day_03;

import java.util.Scanner;

public class C02_StringManipulations {
    public static void main(String[] args) {
        //Kullanıcıdan alacağınız, 3 kelimeden oluşan ismi
        // Örn. Ahmet Emin Yılmaz -> A.E.Y.  formatıyla yazdırınız.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen adınızı ve soyadınızı giriniz");
        String isimSoyisim = scan.nextLine();

        String isim = isimSoyisim.substring(0,1);
        String ikinciHarf = isimSoyisim.substring(isimSoyisim.indexOf(" ")+1,isimSoyisim.indexOf(" ")+2);
        String UcuncuHarf = isimSoyisim.substring(isimSoyisim.lastIndexOf(" ")+1,isimSoyisim.lastIndexOf(" ")+2);
        System.out.println(isim.toUpperCase() + "." + ikinciHarf.toUpperCase() + "." + UcuncuHarf.toUpperCase() + ".");
    }
}
