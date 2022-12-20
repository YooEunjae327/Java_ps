import java.util.HashMap;
import java.util.Scanner;

public class Ps_2577 {
    public static void main(String[] args) {
        HashMap<String, Integer> cap = new HashMap<String,Integer>();
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        String[] b;

        cap.put("0", 0);
        cap.put("1", 0);
        cap.put("2", 0);
        cap.put("3", 0);
        cap.put("4", 0);
        cap.put("5", 0);
        cap.put("6", 0);
        cap.put("7", 0);
        cap.put("8", 0);
        cap.put("9", 0);

        for(int i = 0; i < 3; i++) {
            a[i] = sc.nextInt();
        }

        b = String.valueOf(a[0] * a[1] * a[2]).split("");


        for(int i = 0; i < b.length; i++){
            cap.put(b[i], cap.get(b[i]) + 1 );
        }

        for(int i = 0; i <= 9; i++) {
            System.out.println(cap.get(String.valueOf(i)));
        }

    }
}
