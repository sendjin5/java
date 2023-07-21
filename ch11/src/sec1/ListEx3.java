package sec1;

import java.util.ArrayList;
import java.util.List;
class Student{
    public int sno;
    public String sname;
    public int point;
    public Student(){}      //생성자는 반환타입 X

    public Student(int sno, String sname, int point) {
        this.sno = sno;
        this.sname = sname;
        this.point = point;
    }
}
public class ListEx3 {
    public static void main(String[] args) {

        List<String> lst1 = new ArrayList<>();
        lst1.add("사이다"); //요소 추가 .add
        lst1.add("콜라");
        lst1.add("환타");
        lst1.add("밀키스");
        System.out.println(lst1);
        lst1.remove(1);         //특정 인덱스 위치의 요소 제거
        System.out.println(lst1);
        lst1.clear();                 //모든 요소 제거
        System.out.println(lst1);
        lst1.add("기억");             //요소 더하기
        lst1.add("니은");
        lst1.add("디귿");
        lst1.add("리을");
        System.out.println(lst1);
        System.out.println("리스트의 요소 수 : " + lst1.size());       //요소 개수
        System.out.println("특정 인데스가 2인 데이터 : " + lst1.get(2));
        if (lst1.contains("미음")) {
            System.out.println("미음이 있다.");
        } else {
            System.out.println("없다.");
            ;
        }
            if(lst1.isEmpty()){ //빈 리스트 검증
                System.out.println("현재 리스트가 비어있다.");
                }else{
                System.out.println("리스트가 사용중이다.");
            }
            for(int i=0;i<lst1.size();i++){
                System.out.println(lst1.get(i));

            }   System.out.println("------");
                for(String s:lst1) {
            System.out.println(s);
        }

            List<Student> sl = new ArrayList<>();
            Student q1 = new Student();
            q1.sno = 1;
            q1.sname = "한선";
            q1.point = 90;

            Student q2 = new Student();
            q2.sno = 2;
            q2.sname = "유선";
            q2.point = 85;
            Student q3 = new Student();
            q3.sno = 3;
            q3.sname = "황선";
            q3.point = 50;

            sl.add(q1);
            sl.add(q2);
            sl.add(q3);

            for(int i=0;i<sl.size();i++){
                Student s = sl.get(i);
                System.out.println("번호: "+s.sno);
                System.out.println("이름: "+s.sname);
                System.out.println("점수: "+s.point);
            }

        System.out.println("ㅡㅡㅡㅡㅡㅡㅡ");
            for(Student q:sl){
        System.out.println("번호: "+q.sno);
        System.out.println("이름: "+q.sname);
        System.out.println("점수: "+q.point);}
    }
}