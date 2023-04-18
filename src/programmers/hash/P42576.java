package programmers.hash;

import java.util.HashMap;

public class P42576 {
    public static void main(String[] args) {
        String[] a = {"mislav", "stanko", "mislav", "ana", "mislav"};
        String[] b = {"stanko", "ana", "mislav", "mislav"};
        System.out.println(solution(a, b));
    }

    public static String solution(String[] participant, String[] completion) {
        String answer = "dd";
        HashMap<String, Integer> map = new HashMap<>();

        for (String s : completion) {
            map.merge(s, 1, Integer::sum);
        }

        for(String s : participant) {
            if(map.get(s) == null) {
                answer = s;
                break;
            }
            else map.put(s, map.get(s) - 1);

            if(map.get(s) < 0) answer = s;
        }



        return answer;
    }
}


