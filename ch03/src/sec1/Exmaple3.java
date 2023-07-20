package sec1;

import java.util.Scanner;

public class Exmaple3 {
    public static void main(String[] args) {
        // 키보드로 학번과 세 과목 점수를 입력받아
        //총점, 평균, 학점, 판정, 등급 등을 계산하여 출력하시오.
        //tot(총점), ovg(평균), hak(학점), pan(판정), grd(등급)
        //총점= 전산 + PG + OA
        //평균은 세 과목의 점수의 총점을 3으로 나눈 실수
        //학점은 평균이 96이상 A+, 93이상 A0, 90이상은 A-
        // 86이상 B+, 83이상 B0, 80이상은 B-
        // 76이상 C+, 73이상 C0, 70이상은 C-
        // 66이상 D+, 63이상 D0, 60이상은 D-
        // 나머지는 F

        //판정은 평균이 80이상면서, 세 과목 모두 70이상이면, "합격" 아니면 "탈락"
        //등급은 평균을 20으로 나눈 값으로 하되, 5이면, 5등급 ~~~~1이면, 1등급
        //출력형식
        //학번    전산  PG  OA  총점  평균  학점  판정  등급
        //학번
        Scanner sc = new Scanner(System.in);
        System.out.println("학번이력");
        int num = sc.nextInt();
        System.out.println("150");


        int a=80, b=90, c=95;
        int tot = (a+b+c);
        float ovg = (a+b+c) / 3.0f;

        String hak = "";
        if (ovg>=96) hak = "A+";
        else if (ovg>=93) hak = "A0";
        else if (ovg>=90) hak = "A-";
        else if (ovg>=86) hak = "B+";
        else if (ovg>=83) hak = "B0";
        else if (ovg>=80) hak = "B-";
        else if (ovg>=76) hak = "C+";
        else if (ovg>=73) hak = "C0";
        else if (ovg>=70) hak = "C-";
        else if (ovg>=66) hak = "D+";
        else if (ovg>=63) hak = "D0";
        else if (ovg>=60) hak = "D-";
        else hak = "F";

        String pan = "";
        if (ovg>=80 && a>=70 && b>=70 && c>=70){
            pan = "합격";}
        else pan = "탈락";


        int pt = (int)ovg / 20;
        String grd = "";
        switch (pt) {

            case 5:
                grd = "5등급";
                break;
            case 4:
                grd = "4등급";
                break;
            case 3:
                grd = "3등급";
                break;
            case 2:
                grd = "2등급";
                break;
            case 1:
            case 0:
                grd = "1등급";
                break;

        }

        System.out.printf("\n학번: %d, 총점: %d, 평균: %3.0f, 학점: %s, 판정: %s, 등급: %s\n", num, tot, ovg, hak, pan, grd);












    }
}
