package sec1;

import java.util.ArrayList;
import java.util.List;
//컬렉션 프레임워크(Collection Framwork) : 여러 데이터의 모음을 저장할 자료구조 틀
//Stack\, Queue, Deque, Set, Map, List....
//List : 데이터의 순서가 있으며, 데이터 중복이 허용되며, 순서 유지가 됨 -> ArrayList, Vector, LinkedList...~~
//Set : 일반적인 집합을 말하며, 순서유지 불가, 데이터 중복이 허용되지않음 -> *HashSet, TreeSet...~~
//Map : Set보다 활용성이 크다. 키와 값을 쌍으로 저장, 키의 중복이 혀용되지않으며, 값은 중복가능(나중 것이 우선)
//-> HashMap, HashTable, TreeMap, Properties
//-> Ex : 1;{"kor":100, "eng":100, "mat":100}, 2:{"kor":95, "eng":90, "mat":100}...~~
//Stack : 일반적인 데이터, 최신의 데이터를 저장하는 자료구조로 데이터 입출력이 LIFO(Last In First Out) 거꾸로 진행된다.(최근문서)
//Queue : 양방향 데이터, 데이터 입출력이 FIFO(First In First Out) 순서대로 진행된다. (CPU 스케줄링, Thread)
//Deque : FIFO/LIFO 모두 가능한 자료구조
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
