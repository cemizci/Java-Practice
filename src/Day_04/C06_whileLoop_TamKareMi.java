package Day_04;

import java.util.Scanner;

public class C06_whileLoop_TamKareMi {
    public static void main(String[] args) {

        // Girilen pozitif bir sayının tam kare olup olmadığını bulunuz,
        // tamkare ise true  değilse false yazdırınız.
        // Not: sqrt gibi fonksiyonları kullanmayınız

        Scanner scan=new Scanner(System.in);
        System.out.print("Tam Kare olup olmadığını kontrol etmek istediğiniz pozitif bir sayı giriniz: ");
        int sayı=scan.nextInt();

        boolean tamKareMi = false;
        int i = 1;

        while(i*i <= sayı) {
            if (i*i == sayı) {
                tamKareMi = true;
                break;
            }
            i++;
        }

        if (tamKareMi) {
            System.out.println("Girdiğiniz " + sayı + " sayısı" + ", " + i + " sayısının tam karesine eşittir");
        } else {
            System.out.println("Girdiğiniz " + sayı + " sayısı tamkare bir sayı değildir!");
        }
    }
}
