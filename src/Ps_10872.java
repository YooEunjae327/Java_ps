import java.util.Scanner;

public class Ps_10872 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int a = sc.nextInt();
            Long b = Long.valueOf(1);

            for(int i = 1; i < a; i++) {
                b *= (i + 1);
            }

        System.out.println(b);

    }
}
