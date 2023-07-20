package sec1;

public class Example1 {

    public static void main(String[] args) {
        //연산(Operation): OPcode, Opreand -> 명령코드, 데이터가 있는 주소
        //연산의 종류: 산술연산, 대입연산, 증감연산, 관계연산, 논리연산, 비트연산, 기타연산
                    // 산술대입증감, 결과가 수치가 /관계논리, 결과가 참거짓으로 나옴

        //산술연산: +,-,*,/,%
        int a= 20;
        int b= 30;
        int c= a + b;
        int d= b / a;       //정수로 소수점 안나옴
        int f= b % a;
        System.out.println("a+b="+c);
        System.out.println("b/a="+d);       //=System.out.printf("b/a=%d\n", b/a);
        System.out.println("b%a="+f);       //=System.out.printf("b%%a=%d\n", f);

        //대입연산: =, +=, -=, *=, /=
        //증감연산: ++,-- 등의 전위와 후위가 존재




    }
}
