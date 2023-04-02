import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<Integer>();

        // m~n 사이의 수를 검사한다
        for (int i = m; i <= n; i++) {

            // 1부터 시작한다면 1은 건너뛰어야 한다
            if (i < 2) {
                continue;
            } else if (i == 2) { // 2부터 시작한다면 2를 넣고 계산한다
                list.add(2);
            } else { // 소수를 검사한다
                boolean isPrime = true;
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) { // 만약에  m~n사이의 수가 약수로 나눠지면 소수가 아니다
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    list.add(i);
                }
            }
        }
        // 리스트가 비어있으면 -1 출력
        if (list.isEmpty()) {
            System.out.println("-1");
        } else {
            // 리스트 정렬
            Collections.sort(list);

            // 소수인 모든 수 더하기
            int sum = 0;
            for (int i : list) {
                sum += i;
            }
            System.out.println(sum);

            // 소수 중 최소값
            System.out.println(list.get(0));
        }
    }
}
