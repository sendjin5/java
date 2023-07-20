package sec2;

import sec1.Shape;  //패키지가 다를 경우 import 필요

//String 클래스와 같이 base 클래스인 경우는 import 필요없음

public class Example1 {
    public static void main(String[] args) {

        String str1 = new String();
        String str2 = new String("대한민국");


        //클래스명 인스턴스명 = new 생성자함수();
        Shape s1 = new Shape();
        s1.type = "square";
        s1.length = 50;
        s1.area = s1.length*s1.length;

        double d1 = s1.calcArea();
        System.out.println("현재 도형1의 면적은? " +d1);

        Shape s2 = new Shape("triangle");
        s2.length = 30;
        double d2 = s2.calcArea();
        System.out.println("현재 도형2의 면적은? " +d2);

        Shape s3 = new Shape("circle", 20);
        double d3 = s3.calcArea();
        System.out.println("현재 도형2의 면적은? " +d3);
    }
}
