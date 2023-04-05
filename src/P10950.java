import java.util.*;
import java.util.stream.IntStream;

public class P10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String[] tokens = new String[1];
        int[] arr = new int[Integer.parseInt(a)];

        for(int i = 0 ; i < Integer.parseInt(a); i++) {
            tokens = sc.nextLine().split(" ");
            arr[i] = Integer.parseInt(tokens[0]) + Integer.parseInt(tokens[1]);
        }

        StringJoiner sj = new StringJoiner("\n");
        IntStream.of(arr).forEach(x -> sj.add(String.valueOf(x)));
        System.out.println(sj.toString());

    }
}
