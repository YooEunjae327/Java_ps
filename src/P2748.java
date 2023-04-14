import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2748 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int anInt = Integer.parseInt(br.readLine());
        long a = 1;
        long b = 0;

        for(int i = 0; i <= anInt - 2; i++) {
            a += b;
            b = a - b;
        }
        System.out.println(a);

    }
}
