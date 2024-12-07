package Day_03;

import java.util.Scanner;

public class C01_StringManipulation {
    public static void main(String[] args) {

        // Kullanıcıdan tek seferde alacağınız
        // 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
        // ad ayrı soyad ayrı sekilde ekrana yazdırınız


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen adınızı ve soyadınızı giriniz");
        String isimSoyisim = scan.nextLine();

        String isim = isimSoyisim.substring(0,isimSoyisim.lastIndexOf(" "));
        String soyisim = isimSoyisim.substring(isimSoyisim.lastIndexOf(" ") +1);
        System.out.println("Adı: " + isim + "\nSoyisim: " + soyisim);
    }

}
