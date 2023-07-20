package sec1;

public class Example2 {
    public static void main(String[] args) {
        //대입연산: =, +=, -=, *=, /=
        int su = 0;
        int num = 0;

        su+=10;           //su=su+10 과 같다
        System.out.println("su+=10=>" +su);

        su-=5;
        System.out.println("su-=5 =>" +su);

        su*=10;
        System.out.println("su*=10 =>"+su);         //위에서부터 순차적으로 계산됨

        su/=4;
        System.out.println("su/=4 =>"+su);          //정수 나누기 정수는 정수로 자동 형변환됨

        //실수로 저장희망 시
        //float num = 0
        //num = su / 4.0f 또는 num = (float) su / 4  로 하게되면 실수로 계산됨



        //증감연산: ++, -- 등의 전위와 후위가 존재
        int a = 10, b = 10;
        // a=a+1, a+=1, a++, ++a 의 결과는 같다.
        System.out.printf("a++의 결과는: %d\n", a++);       //후위연산
        System.out.printf("++b의 결과는: %d\n", ++b);       //전위연산
        System.out.printf("--b의 결과는: %d\n", --b);
        System.out.println("나중출력: "+a);



    }
}
