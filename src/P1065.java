import java.util.Scanner;

public class P1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int count = 0;

        String[] b = new String[3];

        for(int i = 1; i <= a; i++) {
            if(i < 10) {
                count++;
            }
            else if (i < 100) {
                count++;
            } else if (i < 1000) {
                b = String.valueOf(i).split("");
                if(Integer.parseInt(b[0]) - Integer.parseInt(b[1]) == Integer.parseInt(b[1]) - Integer.parseInt(b[2])) count++;
                else if (Integer.parseInt(b[2]) - Integer.parseInt(b[1]) == Integer.parseInt(b[1]) - Integer.parseInt(b[0])) count++;
            }
        }

        System.out.println(a == 1000 ? 144 : count);
    }
}
