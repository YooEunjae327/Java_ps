package programmers;

import java.util.*;

public class P172927 {
    public static void main(String[] args) {
        int[] a = {1, 1, 0};
        String[] b = {"diamond", "diamond", "diamond", "iron", "stone", "diamond", "diamond", "diamond", "diamond"};
        System.out.println(solution(a, b));
    }
    public static int solution(int[] picks, String[] minerals) {
        int answer = 0;

        Queue<String> qu = new LinkedList<>(Arrays.asList(minerals));

        Queue<String> vi = new LinkedList<>(Arrays.asList(minerals));
        String[][] mi = new String[(minerals.length / 5) + 1][5];



        for(int i = 0; i < (minerals.length / 5) + 1; i++) {
            for(int j = 0; j < 5; j++) {
                mi[i][j] = vi.poll();
            }
        }

        Arrays.sort(mi, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                if(o1[0].toString().contentEquals(o2[0].toString()))
                    return o1[1].toString().compareTo(o2[1].toString());
                else
                    return o1[0].toString().compareTo(o2[0].toString());
            }
        });
        System.out.println(Arrays.toString(mi[0]));
        System.out.println(Arrays.toString(mi[1]));


        for(int i = 0; i < picks[0]; i++) {
            for(int j = 0; j < 5; j++) {
                if(!qu.isEmpty()) {
                    qu.remove();
                    answer++;
                }
            }
        }

        for(int i = 0; i < picks[1]; i++) {
            for(int j = 0; j < 5; j++) {
                if(!qu.isEmpty()) {
                    if(Objects.equals(qu.peek(), "diamond")) answer += 5;
                    else answer++;
                    qu.remove();
                }
            }
        }

        for(int i = 0; i < picks[2]; i++) {
            for(int j = 0; j < 5; j++) {
                if(!qu.isEmpty()) {
                    if(Objects.equals(qu.peek(), "diamond")) answer += 25;
                    else if(Objects.equals(qu.peek(), "iron")) answer += 5;
                    else answer++;
                    qu.remove();
                }
            }
        }

        return answer;
    }
}
