package sec2;


import sec1.Chunjae;

public class ChunjadEx1 {
    public static void main(String[] args) {

        Chunjae c1 = new Chunjae();
        //c1.no = 10; - private 같은 클래스 내부에서만 가능
        //c1.partNo = 1234; - default 같은 패키지 안에서만 가능
        //c1.point = 200; - protected 같은 패키지 또는 상속관계에서 가능
        c1.name = "고구마"; // public 모두 상관없이 가능
        //static은 상속만 되며, 변하지 않는다. 같은 패키지 건 어디건 가능
        System.out.println(Chunjae.PI*10*10);

        
    }

}
