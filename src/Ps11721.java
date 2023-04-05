import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ps11721 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split("");

        System.out.print(str[0]);
        for(int i = 1; i < str.length; i++) {
            if (i % 10 == 0) {
                System.out.print("\n" + str[i]);
            } else {
                System.out.print(str[i]);
            }
        }

    }
}
