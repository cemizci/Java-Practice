package Day_02;

import java.util.Scanner;

public class P05_ArtıkYılSorusu {
    public static void main(String[] args) {


    /*
      Kural 1: 4 ila bölünemeyen yıllar artık yıl değildir
      Kural 2: 4 ile bölünüp 100 ile bölünemeyen yıllar artık yıldır
      Kural 3: 4 ve 100 ile bölünebilen ama sadece 400'ün katı olan yıllar  artık yıldır
 */


       Scanner scan =new Scanner(System.in);
       System.out.println("Kontrol edeceğiniz yılı yazınız");
       int year = scan.nextInt();

 //      if (year % 100 == 0 && year%400 == 0){
 //          System.out.println("Girdiğiniz" + year + " Artık bir yıldır");
 //      }else if (year%100!=0 && year%4==0){
 //          System.out.println("Girdiğiniz" + year + " Artık yıldır");
 //      }else {
 //          System.out.println("Girdiğiniz" + year + " Artık yıl değildir");
 //      }

 //      System.out.println("------Ternary Çözümü------------");


 //      String result = year%100==0? (year%400==0? "Girdiğiniz" +year+ " yılı artık yıldır" : "Girdiğiniz" +year+ " yılı artık yıl değildir")
 //                      :year%4==0





















    }
}
