package sec1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListEx2 {
    public static void main(String[] args) {
        List lst1 = new ArrayList();
        lst1 = new Vector();
        lst1 = new LinkedList<>();

        ArrayList lst2 = new ArrayList();
        //las2 = new Vector(); 안됨

        Method1(lst1);
        //Method2(lst2);

    }

    public static void Method1(List ls) {}          //사용성이 훨씬 다양함
    public static void Method2(ArrayList ls) {    }
}
