package Day_05;

import java.util.ArrayList;
import java.util.Arrays;

public class C06_ArrayList {
    public static void main(String[] args) {
        /*
         * Input olarak verilen listteki isimlerden
         * icinde ‘a’ harfi bulunanlari silen bir program yaziniz
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */

        ArrayList<String> list = new ArrayList<>(Arrays.asList("Ali","Veli","Ayse","Fatma","Ömer","Berk","MURAT","sibel"));
        ArrayList<String> list2 = new ArrayList<>();

        for (String eleman:list){
            if (!eleman.toLowerCase().contains("a")){
                list2.add(eleman);
            }
        }
        System.out.println(list2);
    }
}
