package bank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Objects;

public class P2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] value =  br.readLine().split(" ");
        ArrayList<Integer> arr = new ArrayList<>();
        int a = Integer.parseInt(value[1]);

        arr.add(a);
        for (int i = 1; i < Integer.parseInt(value[0]); i++ ) {
            a *= Integer.parseInt(value[2]);
            arr.add(a);
        }

        System.out.println(String.valueOf(arr));
    }
}
