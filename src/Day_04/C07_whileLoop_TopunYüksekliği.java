package Day_04;

public class C07_whileLoop_TopunYüksekliği {
    // Bir top 220 m  yükseklikten atılmaktadır.
    // Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
    // Top zıplama  yüksekliği 25  santimetrenin altına indiğinde durmaktadır.
    // Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulunuz.
    public static void main(String[] args) {

        double yukseklik = 220.0;
        int sayac = 0;
        double alınanYol = 0;
        double h = yukseklik;


        while (yukseklik >= 0.25) {
            alınanYol += yukseklik;
            yukseklik *= 0.75;

            sayac++;
        }
        System.out.println(" Top "+h +" m'den bırakılınca "+sayac+" kere zıplayarak toplamda "+alınanYol+" yol almıştır.");
    }
}
