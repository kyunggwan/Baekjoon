import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //도화지
        boolean[][] arr = new boolean[100][100];
        //답으로 쓸 변수
        int answer = 0;
        //색종이 수 입력받음
        int n = sc.nextInt();
        //입력받은 수 만큼 색종이 추가
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            //색종이 넓이만큼 도화지를 칠한다
            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    if (!arr[j][k]) {
                        arr[j][k] = true;
                        answer++;
                    }
                }
            }
        }
        System.out.println(answer);
        sc.close();
    }
}
