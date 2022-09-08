    import java.util.ArrayList;
    import java.util.List;
    import java.util.Scanner;

    public class Ps_10952 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            List<Integer> tokens = new ArrayList<>();

            while (true) {
                String[] a = sc.nextLine().split(" ");
                if(a[0].equals("0")) break;

                System.out.println(Integer.parseInt(a[0]) + Integer.parseInt(a[1]));
                //tokens.add(Integer.parseInt(a[0]) + Integer.parseInt(a[1]));
            }

            //System.out.println(tokens);
        }
    }
