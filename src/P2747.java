import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2747 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int anInt = Integer.parseInt(br.readLine());
        int a = 1;
        int b = 0;

        for(int i = 0; i <= anInt - 2; i++) {
            a += b;
            b = a - b;
        }
        System.out.println(a);

    }
}
