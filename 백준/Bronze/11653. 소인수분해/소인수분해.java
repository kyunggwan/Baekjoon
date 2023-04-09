import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 2; i <= Math.sqrt(num); i++) {
            while (num % i == 0) {
                sb.append(i).append('\n');
                num /= i;
            }
        }
        if (num != 1) {
            sb.append(num);
        }
        System.out.println(sb);
    }
}
