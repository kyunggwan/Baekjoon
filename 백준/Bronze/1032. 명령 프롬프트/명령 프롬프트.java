import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        //입력받는다
        char[] pattern = br.readLine().toCharArray();

        for (int i = 0; i < num - 1; i++) {
            char[] filename = br.readLine().toCharArray();
            //비교해서 다르면 ? 넣는다
            for (int j = 0; j < pattern.length; j++) {
                if (pattern[j] != filename[j]) pattern[j] = '?';
            }
        }
        //출력
        System.out.println(pattern);
    }
}
