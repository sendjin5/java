package sec2;

//Runnable : 실행 가능한 객체를 만들기 위한 인터페이스
// -> 사용자 상속받아 새로운 클래스를 생성하여 활용
//각 Thread에 대기 순서에 따라 입력 시간이 달라짐
class SBRunnable implements Runnable {
    @Override
    public void run() {
        String[] str = {"김1", "신1", "이1", "박1","황1"};
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //출석을 1초에 한 명씩 부르기
        for(String name:str){
            System.out.println("출석체크 : "+name);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class SCRunnable implements Runnable {
    @Override
    public void run() {
        String[] str = {"김이", "신이", "이이", "박이","황이"};
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //출석을 1초에 한 명씩 부르기
        for(String name:str){
            System.out.println("퇴실체크 : "+name);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class Run1 {
    public static void main(String[] args) {
        Runnable sbRun1, sbRun2;
        sbRun1 = new SBRunnable();
        sbRun2 = new SCRunnable();
        Thread t1 = new Thread(sbRun1);
        t1.start();

        Thread t2 = new Thread(sbRun1);
        t2.start();




}
}
