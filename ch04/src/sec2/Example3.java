package sec2;

import java.util.Date;

public class Example3 {
    public static void main(String[] args) {
        Date today = new Date();
        //new = 객체 생성
        String date1 = "2023-07-13";                    //기본 변수 타입 , 현재 주소
        String date2 = new String("2023-07-13");    //레퍼런스 타입, 주소가 있다정도
            
        if(date1==date2) System.out.println("서로같음");
           else System.out.println("서로 다름");
            //문자열과 객체타입은 값이 같다고 하더라도 등호(==)로 비교할 수 없으며,
            //값 비교를 위해서는 equals() 를 사용하여 비교하여야 한다.

            if(date1.equals(date2)) System.out.println("서로같음");
            else System.out.println("서로 다름");           //문자열 보기


        String info = "";
        String name = "황교진";
        int age = 31;
        float ht = 185.5f;


        info = name + age + ht;      //문자열을 하나라도 있다면 문자열로 변환
        System.out.println("info="+info);







            }

}
