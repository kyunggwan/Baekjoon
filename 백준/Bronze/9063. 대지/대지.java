import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 숫자를 입력 받음
        int num = Integer.parseInt(br.readLine());
        int[][] arr = new int[num + 1][2];
        int x_max = -10000, x_min = 10000;
        int y_max = -10000, y_min = 10000;

        //좌표를 입력 받음
        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        // x, y 좌표의 최대값, 최소값
        for (int i = 0; i < num; i++) {
            if (x_max < arr[i][0]) x_max = arr[i][0];
            if (x_min > arr[i][0]) x_min = arr[i][0];
            if (y_max < arr[i][1]) y_max = arr[i][1];
            if (y_min > arr[i][1]) y_min = arr[i][1];
        }

        // 출력
        System.out.println((x_max - x_min) * (y_max - y_min));

    }
}
