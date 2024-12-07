package Day_05;

import java.util.Arrays;

public class C03_Array_AyrıToplamlarBulma {
    /*
     * $ ve £ isareti olanlarin toplamlarini ayri ayri bulun
     *
     * String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
     */

    public static void main(String[] args) {
        String str = "$1-$23-$134-$2-$7-$24-£32-£40-£2-£65-£4-";

        String arr[] = str.split("-");
        System.out.println(Arrays.toString(arr));
        int dolarTopla = 0;
        int poundTopla = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains("$")){
                dolarTopla +=Integer.parseInt(arr[i].replace("$",""));
            }else {
                poundTopla +=Integer.parseInt(arr[i].replace("£",""));
            }
        }
        System.out.println("$ Toplamı: " + dolarTopla);
        System.out.println("£ Toplamı: " + poundTopla);
    }
}
