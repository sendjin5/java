package sec1;

public class ChunjaeEx2 {
    public static void main(String[] args) {

        Chunjae c1 = new Chunjae();
        //c1.no = 10; - private 같은 클래스 내부에서만 가능
        c1.partNo = 1234; //default 같은 패키지 안에서만 가능
        c1.point = 200; //protected 같은 패키지 또는 상속관계에서 가능
        c1.name = "사이다"; // public 모두 상관없이 가능

        //static은 상속만 되며, 변하지 않는다. 같은 패키지 건 어디건 가능
        System.out.println(Chunjae.PI * 10 * 10);

        Sehun s1 = new Sehun();
        Chanwon ch1 = new Chanwon();

        int[] k = new int[100];

        Sehun[] s = new Sehun[10]; //객체 배열 s[0], s[1] ~ s[9]
        //s[0].num ~ s[9].num
        //s[0].data ~ s[9].data

        for(int a=0;a<s.length;a++){ //객체의 배열은 원소를 재생성해야한다.
            s[a] = new Sehun();
            s[a].setNum(a+1);
            s[a].setData("세훈" +(a+1));


        }
        for(int a=0;a<s.length;a++){
            System.out.println(s[a].getNum());
            System.out.println(s[a].getData());
            System.out.println("---------------------");
        }







    }
 }
