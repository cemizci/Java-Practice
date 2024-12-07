package Day_02;

import java.util.Scanner;

public class P02_IfElse2 {
    public static void main(String[] args) {

        /*
        *  Kullanicidan 3 tene pozitif  tam sayi alniz.
        *  bu uc sayinin ucgen olusturma durumunu kontrol ediniz
            eger ucgen olabiliyor ise, es kenar ucgen olma durumunu da  kontrol edniz

        üçgen olma sarti :herhangi iki kenar toplami diger kenardan büyük,
        herhangi iki kenar farkı diger kenardan büyük olmali
                a+b>c>a-b
                a+c>b>a-c
                b+c>a>b-c
                a=b=c ise es kenar ucgen

            */



        Scanner scan = new Scanner (System.in);
        System.out.println("Birinci kenar uzunluğu");
        int a = scan.nextInt();
        System.out.println("İkinci kenar uzunluğu");
        int b = scan.nextInt();
        System.out.println("Üçüncü kenar uzunluğu");
        int c = scan.nextInt();

        if (a+b>c && c>a-b || b+c>a && a>b-c || a+c>b && b>a-c){
            if (a==b && a==c){
                System.out.println("Bu ölçülerle bir eşkenar üçgen oluşturulabilir");
            } else if (a==b & a!=c || a==c && a!=b || b==c && a!=c) {
                System.out.println("Bu ölçülerle bir ikizkenar üçgen oluşturulabilir");
            }else {
                System.out.println("Bu ölçülerle bir çeşitkenar üçgen oluşturulabilir");
            }
        }else {
            System.out.println("Bu ölçülerle bir üçgen oluşturulamaz");
        }





























    }
}
