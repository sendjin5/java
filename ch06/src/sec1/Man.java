package sec1;


//추상화
public abstract class Man {
    private int item1;
    private String item2;

    //추상화 : 실제 구현내용을 적지않고, 상속 받는 클래스에서 구현내용을 기술하므로써
    //물려 받는 입장에서 쓰고싶은 것이 다를 경우 미리 아래처럼 사용처를 정해버리면
    //그대로 쓰던가 아니면 오버라이딩을 해야함.(추상화는 메서드를 위해 사용)
    // 사용하는 이유
    // 1. 원하는 곳에 사용하기 위함    2. 다른 개체를 빼먹지 않기 위함
    //원하는 부분에 사용하는 것이며, 전체 모두 희망할 경우 인터페이스를 사용한다. = 그렇기에 부모클래스가 될 수밖에 없다.(추후 스프링에서 사용)
    public abstract void method1();
    public abstract int method2();
    public abstract void method3(int no);
    public abstract int method4(int no);

    //추상화 선언이 아니므로 구현내용을 기술해야함
    public void method5(){System.out.println("m5");};
    public int method6(){return 100;}
    public void method7(int no){System.out.println("매개값 : "+no);}
    public int method8(int no){return no*(no-1);}

}
