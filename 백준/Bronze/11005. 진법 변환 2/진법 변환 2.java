import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 입력을 받음
        int n = Integer.parseInt(st.nextToken()); // 입력값
        int b = Integer.parseInt(st.nextToken()); // 진법
        int answer = 0;

        ArrayList<Character> list = new ArrayList<>();
        while (n > 0) {
            // 나머지 값이 10 이하이면 10진법 까지
            if (n % b < 10) {
                answer = (n % b);
                list.add((char) (answer + '0'));
                // 10진법 이상일 때
            } else {
                answer = n % b - 10;
                list.add((char) (answer + 'A'));
            }
            n /= b;
        }

        // 리스트로 출력
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i));
        }
    }
}
