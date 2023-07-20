package sec2;
//제너릭의 제한 -> <T extens 제한 클래스>
//제한 클래스의 서브(이하) 클래스만 생성이 허용됨
public class MultiEx3 {
    public static void main(String[] args) {
        //Child<parent> ci = new Child<parent>();       My 이하만 잡았기 때문에 상위는 불가
        Child<My> c2 = new Child<My>();         //java1.6 이상은 new Child<''>   안 생략가능
        Child<season> c3 = new Child<>();
    }
}
