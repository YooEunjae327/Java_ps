import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class P10826 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int anInt = Integer.parseInt(br.readLine());
        BigInteger a = new BigInteger("1");
        BigInteger b = new BigInteger("0");

        for(int i = 0; i <= anInt - 2; i++) {
            a = a.add(b);
            b = a.subtract(b);

        }
        System.out.println(a);

    }
}
