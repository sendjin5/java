package sec1;

public class Qna extends Board{
    //계층형 게시판
    private int level;
    private int parno;

    //상수는 public으로 시작하며, 대문자로 한다. 상수는 값이 바뀌지 않는다.
    //static 개체를 만들지 않아도 공유할 수 있다.
    public final static String DUMMY = "테스트글제목";



    public Qna() {super();}

    public Qna(int no){super(1);}

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getParno() {
        return parno;
    }

    public void setParno(int parno) {
        this.parno = parno;
    }
}
