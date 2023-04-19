package programmers.hash;

import java.util.*;

public class P42586 {
    public static void main(String[] args) {
        int[] a = {93, 30, 55, 60, 40, 65};
        int[] b = {1, 30, 5 , 10, 60, 7};
        System.out.println(solution(a, b));

    }

    public static ArrayList<Integer> solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> answer = new ArrayList<>();
        int dayValue = 0;
        int dayvl = 0;
        Queue<Integer> day = new LinkedList<>();

        for(int i = 0; i < progresses.length; i++) {
            long value = (long) progresses[i];
            int num = 0;

            while (true) {
                value += speeds[i];
                num++;
                if(value >= 100) break;
            }
            day.add(num);
        }
        dayValue = day.peek();
        day.remove();

        for(int i = 0; i < progresses.length - 1; i++) {

            if(dayValue >= day.peek()) {
                dayvl++;
                day.remove();
            }
            else {
                dayvl++;
                answer.add(dayvl);
                dayvl = 0;

                dayValue = day.poll();
            }
        }
        answer.add(dayvl + 1);
        return answer;
    }
}
