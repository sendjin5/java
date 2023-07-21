package sec2;

import com.sun.security.jgss.GSSUtil;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackEx1 {
    public static void main(String[] args) {

        Stack<String> st1 = new Stack<>();
        st1.push("0");
        st1.push("1");
        st1.push("2");
        st1.push("4");
        st1.push("8");


        System.out.println(st1);

        st1.pop();              //가장 최근에 작성한 것 내보내기
        st1.pop();
        System.out.println(st1);

        Queue<String> que = new LinkedList<>();
        que.offer("0");
        que.offer("1");
        que.offer("2");
        que.offer("4");
        que.offer("8");

        System.out.println(que);
        que.poll();         //스케줄을 cpu가 뺴내는 것을 poll이라하며 해당 내용은 제거된다.
        que.poll();         //해당 내용은 FIFO 스타일
        System.out.println(que);

    }
}
