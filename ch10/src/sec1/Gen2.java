package sec1;
//핵심용어에 약어를 인자로 쓰는게 관례다.
//Type, Element, Key, Number, Value, Result, Question, Query, Generic~~~...
//문법: public class 클래스명<인자> {}
public class Gen2<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
