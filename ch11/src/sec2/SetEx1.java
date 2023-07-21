package sec2;

import java.util.*;

public class SetEx1 {
    public static void main(String[] args) {
        Set set1 = new HashSet();
        set1 = new TreeSet();

        //데이터 중복X 순서유지X -> Index가 없다.
        Set<String> set2 = new HashSet<>();
        set2.add("사이다");
        set2.add("콜라");
        set2.add("환타");
        set2.add("밀키스");
        set2.add("콜라");
        set2.add("밀키스");
        System.out.println();
        Iterator it = set2.iterator();
        //Set은 순번이 없어서 for문 불가, while 문을 써야한다.
        while(it.hasNext()){
            System.out.println("Set 결과" +it.next());
        }

        //데이터 중복0, 순서유지 0
        List<String> ls2 = new ArrayList<>();
        ls2.add("사이다");
        ls2.add("콜라");
        ls2.add("환타");
        ls2.add("밀키스");
        ls2.add("콜라");
        ls2.add("밀키스");

        System.out.println("List 결과 ");
        for(String d:ls2){
            System.out.println(d);
        }


    }
}
