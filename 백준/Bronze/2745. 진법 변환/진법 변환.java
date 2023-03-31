import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 입력값을 받는다
        String b = st.nextToken();
        int n = Integer.parseInt(st.nextToken());

        // 변환 부분
        int ans = 0;
        for (int i = 0; i < b.length(); i++) {
            // 한 글자씩 c에 저장
            char c = b.charAt(i);
            // 대문자인 경우(11진법 부터)
            if ('A' <= c && c <= 'Z') {
                // 각 자리수에 진법 수를 곱해서 나타낸다
                ans = ans * n + ((c - 'A') + 10);

                // 대문자가 아닌 경우는 1~10진법이므로
            } else {
                ans = ans * n + (c - '0');
            }
        }
        // 출력
        System.out.println(ans);
    }
}
