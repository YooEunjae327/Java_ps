package programmers.stqu;

import java.util.Arrays;
import java.util.Objects;
import java.util.Stack;

public class P12909 {
    public static void main(String[] args) {
        String a = "()(()())";
        System.out.println(solution(a));
    }

    static boolean solution(String s) {
        Stack<String> st = new Stack<>();

        for (char value : s.toCharArray()) {
            if (value == '(') {
                st.push(String.valueOf(value));
            } else  {
                if(!st.empty()) {
                    st.pop();
                } else st.push(String.valueOf(value));

            }

        }

        return st.empty();
    }

}




//        Stack<String> st = new Stack<>();
//        int a = 0;
//
//        for(char x : s.toCharArray()) {
//            a += x == '(' ? 1 : -1;
//            if(a < 0) return false;
//        }
//
//        return true;
//    }