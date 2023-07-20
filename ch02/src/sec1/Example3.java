package sec1;

public class Example3 {
    public static void main(String[] args) {
        // 참 or 거짓으로 결과값이 나옴
        //관계연산: ==(이다/이치), !=(아니다/불일치), >(초과/후), <(미만/전) - (무조건 왼쪽 기준)
        //         >=(이상/이후), >=(이하/이전) - (이상, 이하는 포함된 것)

        int su1 = 90;
        int su2 = 85;
        int su3 = 88;
        System.out.println("su1==su2: "+(su1==su2));
        System.out.println("su1!=su2: "+(su1!=su2));
        System.out.println("su1>=su2: "+(su1>=su2));
        System.out.println("su2>=su3: "+(su2>=su3));
        System.out.println("su1<su2: "+(su1<su2));
        System.out.println("su1<=su2: "+(su1<=su2));



        //논리연산: and(&&), or(||), not(!)
        //andn 연산
        System.out.println("su1>=su2 && su2>=su3 :"+(su1>=su2 && su2>=su3) );          //&&-> and
        //둘이 모두 맞으면 true, 하나라도 틀리면 false
        System.out.println("su1>=su2 || su2>=su3 :"+(su1>=su2 || su2>=su3) );           //|| -> or
        //하나라도 맞으면 true, 둘이 모두 틀리면 false


        //not 연산
        System.out.println("!(su1>=su2): "+!(su1>=su2));
        System.out.println("!(su2>=su3): "+!(su2>=su3));






    }
}
