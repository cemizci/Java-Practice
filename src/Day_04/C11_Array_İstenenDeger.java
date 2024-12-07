package Day_04;

public class C11_Array_İstenenDeger {
    /*
     * verilen bir int Arrayde toplamlari istenen degere esit olan sayi ciftlerini
     * yazdiran bir method yaziniz int[] arr= {5,7,-6,4,2,15,3,8,1}; int
     * istenenToplam=9;
     */
    public static void main(String[] args) {
        int[] arr = {5,7,6,4,2,15,3,8,1};
        int istenenToplam=9;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (istenenToplam == arr[i] + arr[j]);
                System.out.println("Toplamı " + istenenToplam + " olan elemanlar " + arr[i] + "," + arr[j]);
            }
        }
    }
}
