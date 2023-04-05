import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while (!Objects.equals(line = br.readLine(), "."))
        {
            String[] tokens = line.split("");
            Stack<String> sta = new Stack<>();
            for (String token : tokens) {
                switch (token) {
                    case "(":
                    case "[":
                        sta.push(token);
                        break;
                    case ")":
                        if(!sta.empty()) {
                            if (Objects.equals(sta.peek(), "(")) sta.pop();
                            else sta.push(token);
                        } else sta.push(token);
                        break;
                    case "]":
                        if(!sta.empty()) {
                            if (Objects.equals(sta.peek(), "[")) sta.pop();
                            else sta.push(token);
                        } else sta.push(token);
                        break;
                }
            }

            System.out.println(sta.empty() ? "yes" : "no");
        }
        br.close();
    }
}
