package Day_05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C09_ArrayList {
    public static void main(String[] args) {
        /*
         * Verilen arraydeki tekrar eden sayilari, ilki haric silip, tekrarsiz
         * sayilardan olusan bir array haline getiren bir program yaziniz.
         *
         * INPUT : {1,2,2,3,1,4,2,5,6,8,7,5,9,1}
         * OUTPUT : [1,2,3,4,5,6,7,8,9]
         */

        int [] arr={1,2,2,3,1,4,2,5,6,8,7,5,9,1};

        List<Integer> list = new ArrayList<>();

        for (Integer eleman:arr){
           if (!list.contains(eleman)) {
               list.add(eleman);
           }
        }
        System.out.println(list);
        int [] tekrarsızArray = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            tekrarsızArray[i] = list.get(i);
        }
        System.out.println(Arrays.toString(tekrarsızArray));
    }
}
