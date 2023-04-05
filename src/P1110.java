import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class P1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int str2 = 0;

        String[] num = str.split("");
        int nu = 0;



        while (Integer.parseInt(str) != str2) {
            if(num[0].equals("0")) {
                num = (num[1] + Integer.parseInt(num[1])).split("");
            } else if (Integer.parseInt(String.join("", num)) < 10) {
                num = (num[0] + Integer.parseInt(num[0])).split("");
            } else {
                num = (num[1] + ((Integer.parseInt(num[0]) + Integer.parseInt(num[1])) % 10 ) ).split("");
            }

            str2 = Integer.parseInt(String.join("",num));
            nu++;
        }

        System.out.println(str.equals("0") ? 1 : nu);
    }
}
