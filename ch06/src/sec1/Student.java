package sec1;

public class Student {

    private int no;

    private String name;

    private int kor;

    private int eng;

    private int mat;

    //사용자 정의 method 4가지
    //1. 매개변수, return 도 없을 경우
    public void method1(){              //return이 없을 경우 void 필수
        System.out.println("메서드1");
    }

    //2. 리턴은 있으나, 매게변수가 없을 경우
    //접근제한자 반환타입 메서드명([타입 매개변수]){return 해당 반환타입의 데이터값 또는 변수}
    public int method2(){
        int a= 1004;
        return a;
    }
    //3. 리턴은 없으나, 매개변수는 있을 경우
    public void method3(int a){
        System.out.println("당신은 " +a);
    }

    //4. 리턴과 매개변수가 모두 있을 경우
    public int method4(int a){
        return a*a;
    }

}
