package sec1;

class SMThread extends Thread {
    @Override
    public synchronized void start() {  //쓰레드 생성    //synchronized : 병행수행(동기화블럭)
        this.method1(); //동기화 블럭에 기재된 쓰레드는 병행수행된다.
        super.start();
    }

    @Override
    public void run() { //쓰레드 실행
        int[] arr = {95, 60, 85, 70, 90, 80};
        for (int i = 0; i < arr.length; i++) {
            System.out.println("점수 : " + arr[i]);
            try {
                Thread.sleep(1000); //sleep : 대기시간 부여(=딜레이), 지정한 밀리초 만큼 Wait된다.
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void method1() {
        for (int i = 1; i < 7; i++) {
            System.out.println(i);
        }   try {
            Thread.sleep(1000); //sleep : 대기시간 부여(=딜레이), 지정한 밀리초 만큼 Wait된다.
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    }
public class Thread2 {
    public static void main(String[] args) {
        Thread th1 = new SMThread();
        th1.start(); //쓰레드 생성
        try {
            Thread.sleep(1000); //sleep : 대기시간 부여(=딜레이), 지정한 밀리초 만큼 Wait된다.
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    }

