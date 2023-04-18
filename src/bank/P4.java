//package bank;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Arrays;
//
//public class P4 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        String[] a = br.readLine().replaceAll(" ", "").split("");
//        int b = a.length;
//
//        if(b % 2 != 0) a = Arrays.stream(a)
//                        .filter(i -> i !=  b / 2)
//                        .toArray();
//
//        System.out.println(Arrays.toString(a));
//
//    }
//}
