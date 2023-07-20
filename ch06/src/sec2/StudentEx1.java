package sec2;

import sec1.Student;

public class StudentEx1 {
    public static void main(String[] args) {

        Student st1 = new Student();

        //method1(리턴X, 매개변수X)
        st1.method1();

        //method2(리턴O, 매개변수X)
        int a = st1.method2();
        System.out.println(st1.method2());
        System.out.println(a);

        //method3(리턴X, 매개변수0)
        st1.method3(1004);

        //method4(리턴0, 매개변수0)
        int b= st1.method4(1004);
        System.out.println(b);
        System.out.println(st1.method4(50));


    }
}
