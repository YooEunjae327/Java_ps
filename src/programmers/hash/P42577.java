package programmers.hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

public class P42577 {
    public static void main(String[] args) {
        String[] a = {"1", "23", "45"};
        System.out.println(solution(a));
    }

    public static boolean solution(String[] phone_book) {
        boolean answer = true;

        HashMap<String , Integer > map = new HashMap<>();
        int value = 0;
        int last = 0;

        for(int i = 0; i < phone_book.length; i++) {
            String[] arr = phone_book[i].split("");
            for(int j = 0; j < arr.length; j++) {
                if(map.get(arr[j]) == null ) {
                    map.put(arr[j], 1);
                }
                else {

                    if(j > 0){
                        if(map.get(arr[j - 1]) == last) {
                            System.out.println("1");
                            value++;
                        }
                    }
//                    if(i > 0) {
//                        if(!Objects.equals(arr[j], phone_book[i - 1].split("")[0])) continue;
//                    }
                    map.put(arr[j], map.get(arr[j]) + 1);
                    last = map.get(arr[j]);
                }

            }
            if(i > 0) {
                if(value + 1 == phone_book[i - 1].split("").length) {
                    answer = false;
                }
            }

            value = 0;

        }

        return answer;
    }
}
