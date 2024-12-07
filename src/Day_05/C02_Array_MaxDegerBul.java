package Day_05;

public class C02_Array_MaxDegerBul {
    public static void main(String[] args) {
        /*
         * 2 boyutlu bir diziyi kabul eden ve maksimum degeri bulan bir method yazin
         * Input : {{1,2,3},{4,5},{6,7,8}}
         * Output : 8
         */
        maxValueFind();

    }
    public static void maxValueFind(){
        int arr[][] = {{12,3,45}, {4},{26,1,23,25,148},{125}};
        int enBüyük = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > enBüyük) {
                    enBüyük = arr[i][j];
                }
            }
        }
        System.out.println("Bu nestedArray'deki en büyük değere sahip eleman: "+enBüyük);
    }
}
