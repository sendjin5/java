package sec1;

public class Example1 {
    public static void main(String[] args) {
        int a; //변수 선언, 변수란 저장장치
        a = 0; //변수 초기화 / a라는 기억장소 안에 0을 저장해라 *수학이 아니다.
        int b=0;  //변수 선언과 초기화
        int i=0, j=0, k=0;  //동시에도 가능 다만, 타입이 같아야 함
        //;으로 인해 한 줄로 인식 > 한 줄에 해도 됨
        a = a + 5;       // =은 매일 마지막, 오른쪽부터 계산한다 / a=0으로
        i = a + 20;
        j = a - 20;
        System.out.println("a="+a);          //변수의 초기화 = 가장 처음 데이터를 넣는 것 / "a"는 그대로이며, +a는 저장된 값을 의미
        System.out.print("i="+i+"\n");       // println은 한 줄에, print는 같은 줄에> 이때 print를 사용하면서 줄을 바꾸고 싶을때는 print("i="+i+"\n"); 사용
        System.out.printf("j=%d",j);         // c언어와 유사하며, 진행내용에 따라 3가지 모두 필요
        System.out.println();
    }
}
