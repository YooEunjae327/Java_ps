package programmers.hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

public class P42577 {
    public static void main(String[] args) {
        String[] a = {"1", "312", "3123"};
        System.out.println(solution(a));
    }

    public static boolean solution(String[] phone_book) {
        boolean answer = true;

        Arrays.sort(phone_book);

//        for(int i = 0; i < phone_book.length; i++) {
//            for(int j = 0; j < phone_book.length; j++) {
//                if(i != j && phone_book[i].length() < phone_book[j].length() ) {
//                    int a = 0;
//                    String[] b = phone_book[j].split("", phone_book[i].length() + 1);
//                    String bc = String.join("", Arrays.copyOf(b, b.length - 1));
//
//                    if(Objects.equals(phone_book[i], bc)) {
//                        answer = false;
//                        break;
//                    }
//
//                }
//
//            }
//        }
//
        for(int i = 0; i < phone_book.length - 1; i++) {
            if(phone_book[i].length() <= phone_book[i + 1].length()) {
                String[] b = phone_book[i + 1].split("", phone_book[i].length() + 1);
                String bc = String.join("", Arrays.copyOf(b, b.length - 1));

                if(Objects.equals(phone_book[i], bc)) {
                    answer = false;
                    break;
                }
            }
        }

        return answer;
    }
}
