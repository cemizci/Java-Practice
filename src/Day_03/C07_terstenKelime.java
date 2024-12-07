package Day_03;

import java.util.Scanner;

public class C07_terstenKelime {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen bir kelime giriniz: ");
        String kelime= scan.nextLine();
        String terstenKelime="";

        for (int i = kelime.length()-1; i >= 0 ; i--) {
           terstenKelime += kelime.charAt(i);
        }
        System.out.println(terstenKelime);
    }
}
