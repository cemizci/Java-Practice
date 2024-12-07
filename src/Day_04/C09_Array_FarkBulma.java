package Day_04;

import java.util.Arrays;
import java.util.Scanner;

public class C09_Array_FarkBulma {

    // kullanicin girdigi sayi kadar int array olusturan ve array elemanlarini
    // kullanicidan alan ve girilen array elemanlarinin en buyuk ile en kucuk
    // elemaninin arasindaki farki gosteren java programi yazin

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Oluşturulacak array'ın eleman sayısını giriniz");
        int arrayUzunluk = scan.nextInt();
        int arr[] = new int[arrayUzunluk];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Array'ın" + (i+1)+ " . elemanını giriniz");
            int eleman = scan.nextInt();
            arr[i] = eleman;
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Girilen elemanlardan en büyük ile en küçük arasındaki fark: " +(arr[arr.length-1] - arr[0]));
        scan.close();
    }
}
