package sec2;

public class MultiEx2 {
    public static void main(String[] args) {
        Multi2 m1 = new Multi2<String, Integer>("Student", 98);
        Multi2 m2 = new Multi2<String, Integer>("teacher", 24);
        Multi2 m3 = new Multi2<String, Integer>("teacher", 24);

        boolean res1 = m1.compare(m1, m2);           //compare 는 static이라 자동으로 뜨지않음
        System.out.println("비교결과1 : "+res1);
        boolean res2 = m1.compare(m2, m3);           //compare 는 static이라 자동으로 뜨지않음
        System.out.println("비교결과2 : "+res2);
    }
}
