package sec1;

public class Middle extends Score {
    private int history;

    public Middle(){ super(); }
        //super는 부모 클래스를 말한다.
    public Middle(int history) {
        this.history = history;
    }

    public int getHistory() {
        return history;
    }

    public void setHistory(int history) {
        this.history = history;
    }

    public void prtPoint(){
        System.out.println("");
    }
}
