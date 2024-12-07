package Day_05;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C01_Arrays_Ortalama {
    public static void main(String[] args) {
        /*
         * Array elemanlarinin ortalama
         * degerini hesaplayan ve ortalamadan büyük olan elemanlari
         * yazdıran bir java
         * programi yazin
         */

        int arr[]={12,24,36,1,52,100,125,256,13,7,5,19,80,85,96,35,374};
        int toplam=0;
        int ortalama=0;

        for (int i = 0; i < arr.length; i++) {
            toplam += arr[i];
        }
        ortalama = toplam/ arr.length;
        System.out.println("Ortalama: " + ortalama);
        System.out.println("---------ORTALAMADAN BUYUK ELEMANLAR--------");
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > ortalama) {
                System.out.println(arr[i] + " ");
            }
        }
        System.out.println();
    }
}
