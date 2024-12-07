package Day_01;

import javax.swing.*;

public class C03_JOptionPane {
     /*
        Kullanıcıdan aşağıdaki bilgileri alarak
        Adı: Murat
        Soyadı: Yiğit
        Mesleği: Intructor
        Yaşı: 44
        Kayıt başarıyla gerçekleştirildi!
        bu formatta yazdırın
  */
     public static void main(String[] args) {

         String isim = JOptionPane.showInputDialog("İsminizi Giriniz");
         String soyIsim = JOptionPane.showInputDialog("Soyisminizi Giriniz");
         String meslek = JOptionPane.showInputDialog("Mesleğinizi Giriniz");
         String yas = JOptionPane.showInputDialog("Yasınızı Giriniz");
         JOptionPane.showMessageDialog(null,"Adı: "+isim+"\nSoyadı: "+soyIsim+ "\nMesleği: "+meslek+"\nYaşı: "+yas+"\nKayıt basarıyla gerçeklestirildi" );
     }
}
