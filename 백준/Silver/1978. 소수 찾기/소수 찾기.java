import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 숫바를 입력 받는다
        int num = Integer.parseInt(br.readLine());
        // 계산에 활용할 배열
        int[] arr = new int[num];
        // 소수의 갯수
        int count = 0;

        // 배열에 입력값을 넣는다
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 입력값을 순서대로 정렬
        Arrays.sort(arr);

        // 배열을 돌면서 검사한다
        for (int i = 0; i < num; i++) {
            // 입력값이 0, 1이면 넘어간다
            if (arr[i] < 2) {
                continue;
            }

            // 소수인지 검사, 2~자신보다 1작은 숫자까지 나눠지는지 검사한다
            boolean isPrime = true;
            for (int j = 2;  j <= Math.sqrt(arr[i]); j++) {
                if (arr[i] % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
            }
        }
        // 2를 포함해야 하므로 +1
        System.out.println(count);
    }
}
