package Day_04;

import java.util.Arrays;

public class C10_Array_İşaretDegistirme {
    public static void main(String[] args) {
        //bir int Array elemanlarinin işaretini(+-)degistiren  bir method yaziniz.
        // input : 1,2,-3,4,-5,-6
        //output :-1,-2,3,-4,5,6

        int arr[] = {12,-5,-6,2,3,65,18,23,-132};
        System.out.println(Arrays.toString(arr));
        System.out.println("........Hokus Pokus.........");
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= -1;
        }
        System.out.println(Arrays.toString(arr));
    }
}
