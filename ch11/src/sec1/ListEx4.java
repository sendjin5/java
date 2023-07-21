package sec1;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//과정 관리 로직
class Course{
    public int cno;
    public String cname;
    public int cprice;
    public double ctime;

}
public class ListEx4 {  //수강 내용을 키보드로 받을 수 있게
    static List<Course> cList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean ck = true;  //과정 작업 상태 - true: 계속, false: 종료
        int i = 0;      //과정 수
        while(ck){
            System.out.println("작업 번호[1-6]: ");
            int num = sc.nextInt();
            switch (num){
                case 1: i++;
                    System.out.println("과목종목\n");
                Course c = new Course();
                    System.out.println("과목이름");
                c.cno = i;
                c.cname = sc.nextLine();
                    System.out.println("단가: ");
                    c.ctime = sc.nextInt();
                    System.out.println("소요시간 : ");
                    c.ctime = sc.nextDouble();
                    break;

                case 2:
                    System.out.println("과정 검색\n");
                    System.out.println("검색 할 과정번호 : ");
                    int no = sc.nextInt();
                    if(no<=num){
                        Course co = cList.get(no);
                        System.out.println("과정번호 : " +co.cno);
                        System.out.println("과정이름 : " +co.cname);
                        System.out.println("과정단가 : " +co.cprice);
                        System.out.println("소요시간 : " +co.ctime);
                    } else{
                        System.out.println("해당 과정이 존재하지 않습니다.");
                    }  break;

                case 3:
                    System.out.println("과정 삭제\n");
                    System.out.println("삭제 할 과정번호 : ");
                    no = sc.nextInt();
                    if(no<=num){
                        cList.remove(i);
                    } else{
                        System.out.println("해당 과정이 존재하지 않습니다.");
                    }  break;

                case 4:
                    System.out.println("과정 목록\n");
                    System.out.println("과정 번호\t과정이름 \t수강료\t수강시간");
                    for(Course cr:cList){
                        System.out.println(cr.cno + "/t" + cr.cname + "/t" + cr.cprice + "\t" + cr.ctime);
                    } break;
                case 5:
                case 6:
                    ck = false;
                    break;
                default: System.out.println("과정번호는 1~6 입니다.");
            }
        }
    }

}
