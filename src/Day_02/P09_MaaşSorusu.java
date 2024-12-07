package Day_02;

import java.util.Scanner;

public class P09_MaaşSorusu {

    public static void main(String[] args) {

    /*
       Bir şirketin çalışanları farklı bölümlerde çalışıyor ve
       her bölümün farklı bir maaş artış oranı var.
       Kullanıcıdan çalışanın bölüm numarasını ve mevcut maaşını isteyin.
       Bölüm numarasına göre çalışanın yeni maaşını hesaplayın ve ekrana yazdırın.

         Bölüm Numara ve Maaş Artış Oranları:

         IT (Bilgi Teknolojileri): %20 maaş artışı
         HR (İnsan Kaynakları): %15 maaş artışı
         Sales (Satış): %25 maaş artışı
         Marketing (Pazarlama): %10 maaş artışı
         Finance (Finans): %18 maaş artışı
         Operations (Operasyonlar): %12 maaş artışı
         Eğer kullanıcı geçerli bir bölüm numarası girmezse, ekrana "Geçersiz bölüm numarası" yazdırın.

    */

    Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen Departman Kodunu Giriniz - IT (971) - HR(812) - Sales(233) - Marketing(404) - Finance(105) - Operations(936) \nDepartman Kodu: ");
    int dpCode = scan.nextInt();
        System.out.print("Mevcut Maaş : ");
    double salary = scan.nextDouble();


    switch (dpCode){
        case 971:
            System.out.println("Departman : IT Bilgi Teknolojileri");
            System.out.println("Yeni Maaş : " + (salary*1.20));
            break;
        case 812:
            System.out.println("Departman : HR Insan Kaynakalrı");
            System.out.println("Yeni Maaş : " + (salary*1.15));
            break;
        case 233:
            System.out.println("Departman: Sales (Satış)) ");
            System.out.println("Yeni Maaş : " + (salary*1.25));
            break;
        case 404:
            System.out.println("Marketing (Pazarlama) ");
            System.out.println("Yeni Maaş : " + (salary*1.10));
            break;
        case 105:
            System.out.println("Finance (Finans) ");
            System.out.println("Yeni Maaş : " + (salary*1.10));
            break;
        case 936:
            System.out.println("Operations (Operasyonlar) ");
            System.out.println("Yeni Maaş : " + (salary*1.12));
            break;
        default:
            System.out.println("Lütfen geçerli bir kod giriniz");
    }




























    }
}
