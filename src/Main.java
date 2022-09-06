import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] a = sc.nextLine().split(" ");

        if(Integer.parseInt(a[0]) == Integer.parseInt(a[1])) {
            System.out.println("==");
            return;
        }

        System.out.println((Integer.parseInt(a[0]) > Integer.parseInt(a[1]) ) ?  ">" : "<");

    }
}
