package sec2;

import java.util.Arrays;
import java.util.Locale;

public class Example4 {
    public static void main(String[] args) {
        String code = "831110-1234567";
        char m = code.charAt(7);         //특정자리 문자를 가져와라 //index는 무조건 0부터 시작
        String gender = (m=='1' || m=='3') ? "남" : "여";         //char는 '' 사용
        String yy = code.substring(0,2);            //code.substring(0,4) = began index, end index로
        String mm = code.substring(2,4);            //(0.4) = (index 기준) 0번째부터 4번째 전까지
        String dd = code.substring(4,6);


        System.out.println("성별코드 : "+m);
        System.out.println("성별: " + gender);
        System.out.println("생년월일:" +(yy+"-"+mm+"-"+dd));




        String nick = "siendjin";
        int idx = nick.indexOf('i');        //해당 문자의 index를 반환
        System.out.println("i의 문자 인덱스 값:" +idx);
        idx = nick.indexOf('g');
        System.out.println("g의 문자 인덱스 값:" +idx);    //결과값이 없다면 -1이 나온다.
        idx = nick.lastIndexOf('i');
        System.out.println("i의 문자 인덱스 값:" +idx);

        String name1 = nick + "imperial";
        String name2 = nick.concat("imperial"); //문자열 결합 연산

        //문자열을 문자배열로(toCharArray) / 바이트배열로(grtBytes)
        char[] nArr = nick.toCharArray();  //문자열을 문자배열 k i m k i 로 분리
        byte[] bArr = nick.getBytes();

        System.out.println("@2번째: "+nArr[2]);
        System.out.printf("#2번째: "+bArr[2]); //아스키 코드



        int age = 31;
        float ht = 185.5f;
        boolean ps = true;
        //valueof 특정 타입의 문자열로 변환
        String val1 = String.valueOf(age); //정수 ->
        String val2 = String.valueOf(ht);  //실수 ->  문자열로 변환
        String val3 = String.valueOf(ps);  //부울 ->
        
        if(val1.equals("31")) System.out.println("문자열 변환 성공");


        //대문자(toUpperCase), 소문자(toLowerCase)
        System.out.println("대문자로 변환: " +nick.toUpperCase());
        System.out.println("소문자로 변환: " +nick.toLowerCase());

        //replace 해당 특정 문자를 찾아 바꾼다.
        String nick2 = nick.replace('s','j');
        System.out.println("바뀐값 : "+nick2);


        String babo1 = "김김김/이이이/홍홍홍/유유유";
        String babo2 = "박박박-소소소/최최최-황황황";
        
        //split 문자열 배열을 특정 구분자로 요소 분리
        String[] stArr1 = babo1.split("/");
        String[] stArr2 = babo2.split("/|-");

        //Arrays.toString(문자열배열)
        for (String[] strings : Arrays.asList(stArr1, stArr2))
            System.out.println(Arrays.toString(strings));


        String data1 = "          kim";
        String data2 = "wang        ";
        String data3 = "      gi    ";

        System.out.println("글자수1 : " +data1.length());
        System.out.println("글자수2 : " +data2.length());
        System.out.println("글자수3 : " +data3.length());
        
        //trim 해당 문자열의 앞 뒤에 공백제거
        String trans1 = data1.trim();
        String trans2 = data2.trim();
        String trans3 = data3.trim();

        System.out.println(trans1);
        System.out.println(trans2);
        System.out.println(trans3);





    }



}
