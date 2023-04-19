package programmers.hash;

import java.util.*;

public class P42579 {
    public static void main(String[] args) {
        String[] a = {"classic", "pop", "classic", "classic", "pop", "sex" , "sex"};
        int[] b = {500, 600, 150, 800, 2500, 1000, 4000};
        System.out.println(solution(a, b));
    }

    public static ArrayList<Integer> solution(String[] genres, int[] plays) {
        ArrayList<Integer> answer = new ArrayList<>();


        ArrayList<Integer> genre = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        String[] last = new String[2];

        ArrayList<Integer> st = new ArrayList<>();
        ArrayList<Integer> se = new ArrayList<>();

        for(int i = 0; i < genres.length; i++) {
            if(map.get(genres[i]) == null) map.put(genres[i], plays[i]);
            else map.put(genres[i], map.get(genres[i]) + plays[i]);
        }

        for(Map.Entry<String, Integer> x : map.entrySet()) {
            genre.add(x.getValue());
        }
        genre.sort(Collections.reverseOrder());
        for(Map.Entry<String,Integer> x : map.entrySet()) {
            if(Objects.equals(map.get(x.getKey()), genre.get(0))) last[0] = x.getKey();
            else if (Objects.equals(map.get(x.getKey()), genre.get(1))) last[1] = x.getKey();
        }

        for(int i = 0; i < genres.length; i++) {
            if(last[0].equals(genres[i])) st.add(plays[i]);
            else if(last[1].equals(genres[i])) se.add(plays[i]);
        }

        st.sort(Collections.reverseOrder());
        se.sort(Collections.reverseOrder());

        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < genres.length ; j++) {
                if(plays[j] == st.get(i) ) {
                    answer.add(j);
                }
            }
        }

        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < genres.length ; j++) {
                if(plays[j] == se.get(i) ) {
                    answer.add(j);
                }
            }
        }
        return answer;
    }
}
