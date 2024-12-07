package Day_02;

import java.util.Scanner;

public class P07_SwitchCase {
    public static void main(String[] args) {



      Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen yıl sonu notunuzu giriniz");
        int yılSonuNotu = scan.nextInt();
        yılSonuNotu/=10;

        switch (yılSonuNotu){
            case 10:
            case 9:
            case 8:
                System.out.println("Notunuzun harf karşılığı : A");
                break;
            case 7:
            case 6:
                System.out.println("Notunuzun harf karşılığı : B");
                break;
            case 5 :
                System.out.println("Notunuzun harf karşılığı : C");
                break;
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                System.out.println("Notunuzun harf karşılığı : D");
                break;
            default:
                System.out.println("Geçerli bir not giriniz");
        }






















    }
}
