//package programmers.dfsbfs;
//
//import java.util.Arrays;
//
//public class P43162 {
//    static boolean[] val;
//
//    public static void main(String[] args) {
//        int n = 3;
//        int[][] computers = {{1,1,0}, {1,1,0}, {0,0,1}};
//        System.out.println(solution(n, computers));
//        System.out.println(Arrays.toString(val ));
//    }
//
//    public static int solution(int n, int[][] computers) {
//        val = new boolean[n];
//        answer(computers, 0);
//
//        return 1;
//    }
//
//    public static void answer(int[][] computers, int start) {
//        val[start] = true;
//
//        for(int x : computers[start]) {
//            if(val[x - 1] == false) {
//                answer(computers, start);
//            }
//        }
//    }
//}
