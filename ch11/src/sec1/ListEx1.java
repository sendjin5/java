package sec1;

import java.util.ArrayList;
import java.util.List;

//Stack\, Queue, Deque, Set, Map, List....
public class ListEx1 {
    public static void main(String[] args) {
        String[] author = {"김유", "황유", "최유", "정유", "박유", "리유"};
        ArrayList<Board> lst = new ArrayList<>();           //배열과 같이 목록을 돌릴때

        Board bd1;
        for(int i=1;i<6;i++) {
            bd1 = new Board();
            bd1.setNo(i);
            bd1.setTitle("더미제목"+i);
            bd1.setContent("더미 글내용"+i);
            bd1.setAuthor(author[i]);
            bd1.setResdate("2023-07-19");
            //bd1.setCnt(0); 안해도 상관 없다.
            lst.add(bd1);
        }
            prt(lst);

    }
    
    
    public static void prt(ArrayList<Board> lst){
        for(Board bd:lst){
            System.out.println("글번호 :" +bd.getNo());
            System.out.println("글제목 :" +bd.getTitle());
            System.out.println("작성자 :" +bd.getAuthor());
            System.out.println("글번호 :" +bd.getNo());
            System.out.println("작성일 :" +bd.getResdate());
            
        }
        
    }
}
