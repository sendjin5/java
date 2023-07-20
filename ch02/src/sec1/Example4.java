package sec1;

public class Example4 {
    public static void main(String[] args) {

        //32 6 8 4 2 1
        int a= 20;  //10100
        int b= 14;  //01110

        //비트연산(2진수)
        System.out.println("a & b:"+(a&b)); //00100 = 4
        System.out.println("a | b:"+(a|b)); //11110 = 30
        System.out.println("~a:"+(~a));     //~: 반대의 수(보수), 부호마저 반대로 바꾼다 /양수는 0부터, 음수는 -1부터
        System.out.println("a ^ b:"+(a^b));

        System.out.println("a>>2:" + (a>>2));   //shift: <은 곱하기, >은 나누기
        System.out.println("a>>>2:" + (a>>>2));
        //System.out.println("a<<<2:" + (a<<<2)); //곱하기는 2개까지만 가능 ex) a<<2



    }
}
