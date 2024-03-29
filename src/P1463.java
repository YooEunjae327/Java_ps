import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1463 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int count = 0;

        while (num != 1) {
            if((num -1) % 3 == 0  ) {
                count++;
                num -= 1;
                num /= 3;
            }
            else if(num % 3 == 0) { num /= 3; }
            else if (num % 2 == 0) { num /= 2; }
            else { num -= 1; }

            System.out.println(num);
            count++;
        }

        System.out.println(count);

    }

}
