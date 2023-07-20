package sec1;

public class Example2 {
    public static void main(String[] args) {
        boolean a = true;                      //논리형 변수  / 1byte=8bit만 사용 가능 /boolean, 참 or 거짓 2가지만 저장가능, 이진수 / 변화하는 장치를 인코더라고 함
        byte b = 127;                          //바이트 변수  / 1byte 표현범위 음수 -128~-1 ,양수 0~127 / 양수와 음수를 넘어섰다 = 오버플로라고 함
        char c = 'k';                          //문자 변수    / 2byte / char는 '' 작은따옴표 필요 싱글쿼터(참조에는 Character) / 저장하는 용량은 1byte지만 저장되는 용량은 2byte다
        short d = 32767;                       //반정도 정수  / 2byte / -32768 ~ 32767
        long f = 785367800L;                    //배정도 정수  / 4byte, 끝에 L을 붙여주면 확장됨  => 8byte    //348670.2478 > + 10의 6승 x 3486702478
        int e = 7853678;                       //단정도 정수  / 4byte (참조 Integer)
        float g = 3.141592f;                    //단정도 실수 / 4byte, 정수만 가능하지만 끝에 f를 붙이면 가능
        double h = 3.141592;                    //배정도 실수 / 8byte / 수가 엄청 크거나 작거나 끝에 d 붙이면 가능
        double i = 3.141592000000000d;
        //8개의 기본타입(반드시 초기화 후 사용요망) > 프리미티브 타입 변수는 표현범위과 있으며, 표현범위를 벗어나면, 오류가 생김
        //표현범위 = -2의 n-1승 ~ 2의 n-1승 -1
        //byte(1) < char(2) < short(2) < int(4) < long(8)
        //float(4) < double(8)
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
        System.out.println("d="+d);
        System.out.println("e="+e);
        System.out.println("f="+f);
        System.out.println("g="+g);
        System.out.println("h="+h);
        System.out.println("i="+i);
    }
}
