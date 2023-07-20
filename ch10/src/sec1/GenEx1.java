package sec1;
//Generic: 포괄적인 (깍두기)
//
public class GenEx1 {
    public static void main(String[] args) {
        Gen1 g1 = new Gen1();
        g1.method1("사이다");
        //g1.setT(20);  //Gen1 class에서 String으로 하였기 때문에 String type만 가능
        //일반 클래스로 만들어진 필드의 값은 오로지 한 가지 타입만 가능하며, t 필드는 String 이므로
        g1.setT("고구마");
    }
}
