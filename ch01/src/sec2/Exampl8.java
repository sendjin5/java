package sec2;
//출력 변환
public class Exampl8 {
    public static void main(String[] args) {
        String name = "황교진";                                    //대문자 시작은 참조형이다.
        int age= 31;
        double wt = 100;

        System.out.print("이름 : "+name+"\n나이 : "+age+"\n체중 : "+wt);
        System.out.print("\n출력문 예시2\n");
        System.out.println("이름 : \""+name+"\",\t나이 : \'"+age+"\',\t체중 : "+wt );

        System.out.printf("이름: \"%s\", \t나이:\'%d\', 체중:%3.2f", name, age, wt);

        //%b는 2진수, %o는 8진수, %x는 16진수 ->파이썬, c언어
        //각 진수에 해당하는 숫자를 문자열로 바꾸므로 추후 숫자로 변환시, 그 숫자 그대로 10진수로 표기된다.
        //바꾼 데이터는 연산 하지 않도록 주의

        int num1=127;
        System.out.printf("%o", num1);
        String bin = Integer.toBinaryString(num1);      //2진수로
        String oct = Integer.toOctalString(num1);       //8진수로
        String hex = Integer.toHexString((num1));       //16진수로
        System.out.println("2진수:"+bin);
        System.out.println("8진수:"+oct);
        System.out.println("16진수:"+hex);
        System.out.println("10진수:"+num1);

        int k = Integer.parseInt(bin) + Integer.parseInt(oct) + Integer.parseInt(hex);
        System.out.println("더한 결과1:"+k);            //String k = bin +oct +hex; 는 단어기 때문에 단어만 더해짐, Integer.parseIn()로 십진수로 변환
        //System.out.println(Integer.parseInt());

        int b1 = 0b101111;
        int o1 = 0746;
        int x1 = 0x4fc;

        System.out.println("b1="+b1);
        System.out.println("o1="+o1);
        System.out.println("x1="+x1);

        int j = b1 + o1 + x1;
        System.out.println("j="+j);
    }
}
