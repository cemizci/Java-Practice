package Day_04;

public class C01_methodCreation_Overloading {
    public static void main(String[] args) {

        dostSayıOrtalamayıBul(4,5,23,5);
        dostSayıOrtalamayıBul(5.5,6.8,125.9,218);

    }

    public static void dostSayıOrtalamayıBul(int a,int b,int c,int d) {
        int ort = (a+b+c+d) / 4 ;
        System.out.println("ort : " + ort);
    }

    public static void dostSayıOrtalamayıBul(double a, double b,double c,double d) {
        double ort = (a+b+c+d) / 4;
        System.out.println("ort2 : " + ort);
    }
}
