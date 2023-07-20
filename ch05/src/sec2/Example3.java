package sec2;

import sec1.Member;

public class Example3 {
    public static void main(String[] args) {

        Member mem1 = new Member();
        mem1.setId("sendjin");
        mem1.setPw("a12345");
        mem1.setName("황교진");
        mem1.setBirth("1993-11-10");

        System.out.println("ID: "+ mem1.getId());
        System.out.println("PW: "+ mem1.getPw());
        System.out.println("Name: "+ mem1.getName());
        System.out.println("Birth: "+ mem1.getBirth());




    }
}
