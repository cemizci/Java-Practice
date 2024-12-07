package Day_04;

import java.util.Scanner;

public class C05_whileLoop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 5 tane sayı giriniz");
        int sayac = 1;
        int enBüyük = 0;
        int sayı = 0;
        while( sayac <= 5) {
            System.out.println(sayac+". sayıyı giriniz");
            sayı= scan.nextInt();
            if (sayı > enBüyük) {
                enBüyük = sayı;
            }
            sayac++;
        }
        System.out.println("Girilen sayıların en büyüğü : " + enBüyük);
    }
}
