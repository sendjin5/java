package sec2;

import sec1.Qna;

public class Example4 {

    public static void main(String[] args) {


        //공유데이터: 상수는 값이 바뀌지 않는다.
        //개체를 생성하지 않아도 된다.

        Qna q1 = new Qna();
        q1.setTitle(Qna.DUMMY);
        System.out.println(q1.getTitle());

        Qna q2 = new Qna();
        q2.setTitle(Qna.DUMMY);
        System.out.println(q2.getTitle());


    }
}
