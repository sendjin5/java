package sec2;

import java.util.Arrays;

public class Example1 {
    public static void main(String[] args) {
        int a = 0;
        int[] intArr = new int[3];
        double[] doubleArr = new double[3];
        boolean[] booleanArr = new boolean[3];
        String[] StringArr = new String[3];


        System.out.println("a=" + a);
        System.out.println("intArr=" + intArr);   //참조형은 16진수 주소로 결과값이 나옴

        for (int b : intArr) {
            System.out.println(b);
        }
        System.out.println("\n----------\n");
        System.out.println("intArr :" +Arrays.toString(intArr));
        System.out.println("doubleArr :" +Arrays.toString(doubleArr));
        System.out.println("booleanArr :" +Arrays.toString(booleanArr));
        System.out.println("strArr :" +Arrays.toString(StringArr));


        //null : 데이터에 부재 -> String의 초기화 -> 초기화 안할시 null point inception이 나옴
    }
}
