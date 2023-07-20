package sec2;

public class Example6 {
    public static void main(String[] args) {
        //실제 연산 2, 8, 10, 16 진수
        int a = 100;    //십진수                          //
        int b = 0b100;  //이진수 0b부터 시작               //실제 연산과 논리연산 등
        int c = 0100;   //팔진수 0부터 시작 옥타            //권한 부여 및 수행, 회수
        int d = 0x100;  //십육진수 0x로 시작  / C언어는 0h  //실제 주소 또는 메모리 주소 (mac address)
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
        System.out.println("d="+d);
    }
}
