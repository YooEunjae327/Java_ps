import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class P1427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] a = sc.nextLine().split("");
        Arrays.sort(a, Collections.reverseOrder());
        String b = String.join("", a);


        System.out.println(b);

    }
}
