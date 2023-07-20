package sec1;

import java.util.Date;

public class Example5 {
    public static void main(String[] args) {
        //오늘 날짜와 시간
        Date birth1 = new Date();
        String birth2 = "2023-07-07";
        //birth1이 Date로부터 만들어진 인스턴스인지 확인함
        System.out.println(birth1);
        System.out.println("확인1:" + (birth1 instanceof Date));
        //System.out.println("확인2:"+(birth instanceof Date));


        //삼항 연산자: 조건? 참: 거짓
        int point = 84;
        String pan = point >= 80 ? "합격" : "불합격";
        System.out.println("판정 :" + pan);

    }
}