package Day_03;

public class C04_stringManipulation {
    public static void main(String[] args) {

         /*
        String seklinde verilen asagidaki fiyatlarin toplamini bulunuz.
        String  str1= %13.99
        String str2= %10.55
      */

        String str1 = "%25.99";
        String str2 = "%10.55";

        Double value1 = Double.parseDouble(str1.substring(1));
        Double value2 = Double.parseDouble(str2.substring(1));

        System.out.println(value1 + value2);

    }
}
