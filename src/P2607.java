import java.util.Arrays;
import java.util.Scanner;

public class P2607 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int end = 0;

        String[] fi = sc.next().split("");

        Arrays.stream(fi).map(e -> (int)e.charAt(0) );

//        for (int i = 0; i < a - 1; i++) {
//            int  t = 0;
//            String[] af = sc.next().split("");
//
//                for(int j = 0; j < fi.length; j++) {
//                    t += (int)af[j].charAt(0);
//
//
//                }
//            System.out.println(t);
//            //System.out.println(Math.abs(o - t) <= 90);
//                if(Math.abs(o - t) <= 90 || o == t) {
//                    // System.out.println(Arrays.toString(af));
//                 if(af.length == fi.length || af.length == fi.length + 1 || af.length == fi.length -1 ) end++;
//                }
//        }


        System.out.println(Arrays.toString(fi));
    }
}
