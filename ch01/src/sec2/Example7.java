package sec2;

public class Example7 {
    public static void main(String[] args) {
        // 자동형변환(auto casting) : 해당 타입에서 크기가 같거나 더 큰 타입에 대입되었을때 발생
        //byte(1) < char(2) < short(2) < int(4) < long(8)
        //float(4) < double(8)

        int data1 = 1004;
        float data2 = data1;
        char data3 = '황';
        int data4 = data3;

        int data5 = 2048;
        //byte data6 = data5; / 크기가 작아서 변환이 안됨
        byte data6 = (byte) data5;


        System.out.println("data1="+data1);
        System.out.println("data2="+data2);
        System.out.println("data3="+data3);
        System.out.println("data4="+data4); // 유니코드 번호 / 초창기 아스키 코드로 진행함 영문 대소문자 구분 불가, 특수문자도 약간만 가능했음
        System.out.println("data5="+data5);
        System.out.println("data6="+data6); // 강제형변환: 형변환연산자를 활용하는 형변환 (굳이 안 쓰는게 좋다 신빙성이 떨어지기 때문에)

    }
}
