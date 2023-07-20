package sec1;

public class Example1 {
    public static void main(String[] args) {
        int[] a;            //선언1 - 타입[] 배열명; //참조형은 기본 0으로 잡히며, 메모리 할당이 되어있어야한다.
        int b[];           //선언2 - 타입 배열명;
        int[] c = new int[3];
        int d;
        //System.out.println("a[0]="+a[0]); - a는 선언만 했을뿐, 메모리 할당이 되지 않았다.
        System.out.println("a[0]="+c[0]);
        //System.out.println("d="+d); - primitive 타입으로, 반드시 초기화가 필요하다.


    }
}
