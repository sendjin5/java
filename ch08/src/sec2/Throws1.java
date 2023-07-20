package sec2;

public class Throws1 {
    //모든 예외처리는 try~catch~finally 또는 throws 을 반드시 해야한다.
    //Exception은 자세하게 하라 큰 것을 부여하게되면 종류가 많아 원인을 찾을 수 없다.
    public static void main(String[] args) throws Exception{
        String name = null;
        nullCheck(name);

        int[] arr = new int[4];
        otherCheck(arr);

        String data = "1004side";
        otherCheck(data);


    }
    public static void nullCheck(String a) throws NullPointerException {    //throws는 method에 쓴다.
        System.out.println(a);  //예외 상황이 되었을 경우 NullPointerException 가 처리하게
                                //강제 예외 떠넘기기
    }

    public static void otherCheck(int[] a) throws ArrayIndexOutOfBoundsException{
        System.out.println(a[5]);
    }
    public static void otherCheck(String a) throws NullPointerException {
        int data = Integer.parseInt(a);

    }


}


