package programmers.hash;

import java.util.Arrays;
import java.util.HashMap;

public class P42578 {
    public static void main(String[] args) {
        String[][] a = { {"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"},  {"green_turban", "headgear"}, {"red_face", "face"}};
        System.out.println(solution(a));
    }

    public static int solution(String[][] clothes) {
        int answer = 1;

        HashMap<String, Integer> map = new HashMap<>();

        for(String[] x : clothes) {
            map.merge(x[1], 1, (a, b) -> map.get(x[b]) + b);
        }

        for(String key : map.keySet()) {
            answer *= (map.get(key) + 1);
        }
        return answer - 1;

    }
}

