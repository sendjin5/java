package sec1;

public class ImplementsEx1 {
    public static void main(String[] args) {
        Flying f1;
        Dragonfly d1;
        Airplane a1;
        Birds b1;

        //익명의 객체 : 인터페이스도 구현 내용을 설명해주면 구현 가능하다.
        f1 = new Flying() {
            @Override
            public void fly() {
              System.out.println("비행체가 날아갑니다."); }};

        f1 = new Dragonfly();
        f1.fly();
        f1 = new Airplane();
        f1.fly();

    }
}
