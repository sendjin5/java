package sec2;


import java.util.*;
import java.util.Map.*;


public class MapEx1 {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, String> map2 = new Hashtable<>();
        Map<String, Integer> map3 = new TreeMap<>();
        Properties map4 = new Properties();     //다른 맵과 구조가 완전히 다르다.


        map1.put("no", 1);
        map1.put("kor", 100);
        map1.put("eng", 80);
        map1.put("mat", 90);
        System.out.println(map1);
        System.out.println("국어점수: " + map1.get("kor"));
        if (map1.containsKey("soc")) {
            System.out.println("해당 키가 존재합니다.");
        } else {
            map1.put("soc", 100);


        }
        if (map1.containsValue(100)) {
            System.out.println("만점 과목이 존재합니다.");
        } else {
            System.out.println("만점 과목이 없음");

        }

        //맵의 순회
        for (Entry<String, Integer> eSet : map1.entrySet()) {
            System.out.println(eSet.getKey() + ":" + eSet.getValue());
        }

        map2.put("name", "사이다");
        map2.put("age", "31");
        map2.put("height", "185");
        map2.put("weight", "100");
        System.out.println(map2);

        if (map2.containsKey("weight")) {
            map2.remove("weight");
        } else {
            System.out.println("해당 키가 존재하지 않음");
        }

        System.out.println("이름 " + map2.get("name"));

        //해쉬테이블 순회
        for (Entry<String, String> eSet : map2.entrySet()) {
            System.out.println(eSet.getKey() + ":" + eSet.getValue());
        }
        map3.put("no", 1);
        map3.put("age", 31);
        map3.put("height", 185);
        map3.put("weight", 100);
        System.out.println(map2);

        if (map3.containsKey("weight")) {
            map3.remove("weight");
        } else {
            System.out.println("해당 키가 존재하지 않음");
        }

        System.out.println("이름 " + map2.get("no"));

        //트리맵 순회
        for (Entry<String, Integer> eSet : map3.entrySet()) {
            System.out.println(eSet.getKey() + ":" + eSet.getValue());

        }

        map4.setProperty("margin", "48px");            // Properties 선언은 없지만 무조건 ~~ 문자다.
        map4.setProperty("padding", "48px");
        map4.setProperty("width", "1200px");
        map4.setProperty("height", "50px");
        System.out.println("폭: "+ map4.getProperty("width"));



    }
}
