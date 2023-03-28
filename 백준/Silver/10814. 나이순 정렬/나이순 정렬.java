import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        String[][] arr = new String[num][2];

        // 배열에 나이와 이름 입력
        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = st.nextToken(); // 나이 입력
            arr[i][1] = st.nextToken(); // 이름입력
        }

        //
        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
            }
        });

        // 출력 부분, 토큰화 한 것을 붙이자
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num; i++){
            sb.append(arr[i][0]).append(' ').append(arr[i][1]).append('\n');
        }
        // 출력
        System.out.println(sb);
    }
}
