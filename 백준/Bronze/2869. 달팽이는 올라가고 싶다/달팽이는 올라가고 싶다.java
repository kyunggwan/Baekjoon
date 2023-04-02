import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
//        int distance = 0;
//        int answer = 0;
//
//        while (distance < v) {
//            distance += a;
//            answer++;
//            if (distance >= v) {
//                break;
//            }
//            distance -= b;
//        }
//        System.out.println(answer);

        int day = (v - b - 1) / (a - b) + 1;
        System.out.println(day);
    }
}
