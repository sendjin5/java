package sec2;

import java.util.List;
public class Multi4 {
    public void Method1(List<?> lst) {                //<?> 와일드 카드라고 함 무엇이 와도 상관없다.
        for(Object obj : lst){
            System.out.println(obj + "\t");
        }


    }
    public int method2(List<? extends Number> lst){                 //extends는 이하, super는 이상 것을 쓴다.
        int hap = 0;
        for(Number i:lst){
            hap += i.doubleValue();

        }

        return hap;

    }

    public List<? super Integer> method3(List<? super Integer> lst){
        for(int i=0;i<5;i++);
            lst.add(i);
    }
        return lst;
}
