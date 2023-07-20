package sec2;

public class Example1 {
    public static void main(String[] args) {
    //반복문: 일부의 문장을 반복하여 처리해야 하는 경우 활용
        //1~100의 합계를 구할 경우에 사용
        //ex) for(int i=0;i<100li++){}으로 처리
        //반복문의 종류: for~, while~, do~while
        // for(카운트 변수선언 및 초기화; 조건; 증감식) {문장}
        //해당 지정된 값부터 조건이 만족하는 동안만 증가되면서 실행
        //선언된 값(i)은 해당 괄호 안에서만 적용(지역변수)
        int sum = 0;
        for(int i=0; i<=10; i++) {       //for(int i=0; i<=10; i+=2)  2씩 증가 / 무한루프 for(;;){}
            sum += i; //sum=sum+i / for문 규칙, 1.카운트변수 2.조건 3.문장 4.증감식 5.조건 ~~반복
            //sum=0+1+2+3+~+10 = 55
        }
        System.out.println("합산결과: " +sum);

            int arr[] = {90, 80, 85, 75, 95}; //arr[0] = 90, arr[1] = 80 ~~ ->인덱스(순번)

            int tot1 = arr[0]+arr[1]+arr[2]+arr[3]+arr[4];
            int tot2 = 0;
            for(int i =0;i<arr.length;i++){tot2=arr[i];}
        System.out.println("tot1="+tot1);
        System.out.println("tot2="+tot2);


        int hap = 0;
        for(int a=1;a<=100;a+=2){hap+=a;}
        System.out.println("홀수의 합:" +hap);

        int b = 1;
        hap = 0;
        for(;;){ hap+=b; b+=2; if(b<=100) break;}
        System.out.println("홀수의 합:" +hap);

        for(int c=1; c<=100;c++) {
            if (c % 2 == 1) {
                hap += c;
            } else {continue;
            }
        }



    }
}
