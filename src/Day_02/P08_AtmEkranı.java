package Day_02;

import java.util.Scanner;

public class P08_AtmEkranı {
    public static void main(String[] args) {

    //Girilen bir ay numarasına göre , ayın kaç gün olduğunu sayı ile yazdırınız

    Scanner scan  = new Scanner (System.in);
        System.out.println("Kontrol edeceğiniz ay kaçıncı aydır ?");
        int mount = scan.nextInt();



        switch (mount){

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:

                System.out.println(mount+ " ayı 31 gündür");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(mount+ " ayı 30 gündür");
                break;
            case 2 :
                System.out.println(mount+ "Şubat ayının kaç gün olduğu yıla göre değişir.\n4 yılda bir 29 gün olur.");
                break;
            default:
                System.out.println("Geçersiz bir ay numarası girdiniz");













        }

























    }
}
