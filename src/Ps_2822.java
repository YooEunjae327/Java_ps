import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ps_2822 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer[] arr = new Integer[8];
        Integer[] arr2 = new Integer[8];
        int a = 0;
        String b = "";

        for(int i =0 ; i < 8; i++){
            arr[i] = sc.nextInt();
            arr2[i] = arr[i];
        }

        Arrays.sort(arr, Collections.reverseOrder());

        for(int i = 0; i < 8; i++){
             if(i < 5) a += arr[i];
            for(int j = 0; j < 5; j++) {
                if(arr2[i].equals(arr[j])) b += Integer.parseInt(String.valueOf(i + 1))  + " ";
            }
        }

        System.out.println(a);
        System.out.println(b);

    }
}


