import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
         double[] arr = Arrays.stream(br.readLine().split(" ")).mapToDouble(Double::parseDouble).toArray();

        Arrays.sort(arr);
        double cc = 0;


        for (double v : arr) {
            cc += v != 0 ? ((double) v / (double) arr[arr.length - 1]) * 100 : 0;
        }

        System.out.println(cc / arr.length);
    }
}
