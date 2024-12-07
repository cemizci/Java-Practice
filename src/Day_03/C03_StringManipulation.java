package Day_03;

import java.util.Scanner;

public class C03_StringManipulation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen adınızı ve soyadınızı giriniz");
        String isimSoyisim = scan.nextLine();

        String ters = new StringBuilder(isimSoyisim).reverse().toString();
        System.out.println(ters);
    }
}
