package sec1;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        //제어문: 조건분기문, 반복문, 기타 제어문
        //조건 분기문: if, if~else~, if~else if~else~, switch~case~break
        Scanner sc =new Scanner(System.in);

        System.out.println("이름입력: ");
        String name = sc.nextLine();
        System.out.println("나이입력: ");
        int age = sc.nextInt();
        System.out.println("키 입력 ");
        double heihgt = sc.nextDouble();

        System.out.printf("\n이름: %s, 나이 : %d, 키 : %3.2f\n", name, age, heihgt );
        //s 문자, d 십진수, 3.2f 소수점 두자리까지
        //if 기본 문법
        //if(조건식) {조건이 만족할 때 실행할 문장1;}


        if(age>=36){System.out.println("당신은 중년입니다.");           //두 줄 이상은 {} 사용
                    System.out.println("당신은 나이가 많습니다.");}
        if(age<=36)System.out.println("당신은 청년입니다.");          // 한 줄은 {} 사용 안해도 됨


    }
}
