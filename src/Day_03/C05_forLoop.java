package Day_03;

public class C05_forLoop {
    public static void main(String[] args) {

      //  1-180 arasındaki 8 ile bölünebilen sayıların toplamını yazın

        int toplam = 0;
        for (int i = 1; i <=180 ; i++) {
            if (i % 8 == 0){
                toplam += i;
            }
        }
        System.out.println(toplam);
    }
}
