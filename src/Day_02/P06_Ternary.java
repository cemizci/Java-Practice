package Day_02;

import java.util.Scanner;

public class P06_Ternary {
    public static void main(String[] args) {

        // Kullanicidan bir character girmesini isteyiniz
        // Character harf ise kucuk harf olup olmadigini kontrol ediniz
        // Kucuk harf ise ekrana "Kucuk Harf" yazdiriniz
        // Buyuk harf ise ekrana "Buyuk Harf" yazdiriniz
        // Harf degilse ekrana "Harf degil" yazdiriniz
        //97:a  122:z ascii değeri


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz");
        char ch = scan.next().charAt(0);
        String result=(ch >= 'a' && ch <= 'z') ? "Girilen " + ch + " karakteri bir küçük harftir" :
                       (ch >= 'A' && ch <= 'Z' ) ? "Girilen " + ch + " karakteri büyük bir harftir":
                               "Girilen " + ch + " karakteri bir harf değildir";


        System.out.println(result);

















    }
}
