package programmers.stqu;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class P42587 {
    public static void main(String[] args) {
        int[] a = {91,1,1,1,1};
        int b = 2;

        System.out.println(solution(a,b));

    }

    public static int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Integer> qu = new LinkedList<>();
        int[] pri = Arrays.copyOf(priorities, priorities.length);
        int value = 0;
        int val = 0;

        Arrays.sort(priorities);

        for(int i = 0; i < priorities.length; i++) {
            if(value == priorities[priorities.length - 1]) {
                if(pri[i] == pri[location - 1]) val++;
            }

            if(pri[i] == priorities[priorities.length - 1]) value = pri[i];

        }

        for(int i = priorities.length - 1; i > 0; i--) {
            qu.add(priorities[i]);
        }

        System.out.println(val);
        return answer;
    }
}
