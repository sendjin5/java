package sec1;

public class Example5 {
    public static void main(String[] args) {
        //오버플로우 언더플로우 진행
        byte b1 = 104;
        //byte b2 = -129; 해당 표현범위보다 작음(언더플로우)
        //byte b3 =  128; 해당 표현범위보다 크다(오버플로우)
        char c1 = 65535;
        //char c2 = -1; 언더
        //char c3 = 65536; 오버
        short s1 = 3659;
        //short s2 = -33768; 언더
        //short s3 = 33767; 오버
        long l1 = 1121134111l;
        //long l2 = -9223372036854775809; 언더
        //long l3 = 9223372036854775808; 오버
        int i1 = 2147483646;
        //int i2 = -2147483649 언더
        //int i3 = 2147483648 오버
        float f1 = 3.4028235E38f;
    }
}
