package sec2;

//import sec1.dbl; //dbl 클래스는 default
import sec1.Outer;

public class Example2 {
    public static void main(String[] args) {
        Outer out1 = new Outer();
        out1.setItem1(100);
        out1.setItem2("사이다");
        out1.method1();
        System.out.println("----------------");
        //외부클래스, 내부클래스 인스턴스명 = 외부인터스턴스.net  내부 생성자함수();
        Outer.Inner in1 = out1.new Inner();
        in1.setItem3(200);
        in1.setItem4("콜라");
        in1.method2();
        System.out.println("----------------");

        //틀린거
        //Dbl db1 = new Dbl();
        // Dbl ab = out1.getDbl();

        //이중 클래스인 Outer.java 안에 있는 Dbl 클래스의 객체를 생성하는 방법
        // out1.db - Dbl클래스 타입의 멤버필드에 위한 생성
        //out1.getDbl(); - 메소드 호출에 의한 생성
    }


}
