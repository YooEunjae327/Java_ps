import java.util.Scanner;

public class P2420 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] a = sc.nextLine().split(" ");

        Long b = Long.parseLong(a[0]) - Long.parseLong(a[1]);

        System.out.println((b < 0 ) ? b *= -1 : b );

    }
}

