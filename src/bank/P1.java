package bank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int value = Integer.parseInt(br.readLine());
        int pop = 1;

        for(int i = 1; i <= value ; i++) {
            System.out.println(i +"일: " + pop + "마리" );
            pop += 2;
        }

    }
}
