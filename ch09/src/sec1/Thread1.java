package sec1;
//Thread : 하나의 작업(task) 또는 하나의 프로그램(Process)
//Multi Thread : 여러 개의 Thread를 동시에 진행 또는 환경
//Op-code(명령어코드) | Operand(데이터가 있는 주소) -> Stack(스택)에 보관되어 처리
//CPU -> 기억 연산 제어
//메모리 Static(속도가 빠르나 작다.) , Dynamic(유동적으로 움직여 속도가 느리나 크다.)
//CPU는 빠른 처리를 위해 s를 쓰고, 외부메모리는 d를 쓴다.
//여러 일을 처리하려면 일의 순서를 정해야 함 -> CPU 스케줄링
//프로세스 과정: 생성(Create) -> 실행대기(Wait) -> 실행(Run) -> 선점대기(Blocking) -> 재실행(Wakeup) -> 종료(Complete)
//교착상태(Deadlock): 중간에 막힘
//시분할처리 : 시작은 순서대로 시작되나 결과는 한 번에 도출됨 -> 멀티 쓰레드에 원조격
//더블코어: 병렬처리

public class Thread1 {
    public static void main(String[] args) {

        int[] arr = {95, 60, 85, 70, 90, 80};

        String[] str = {"김이", "이이", "박이", "황이", "유이", "최이"};    //전체 single Thread는 6개
        for(int i=0;i<arr.length;i++){
            System.out.println("이름 : "+str[i]);
            try{Thread.sleep(1000); //sleep : 대기시간 부여(=딜레이), 지정한 밀리초 만큼 Wait된다.
             }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }

    }
}
