import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //바구내 갯수 입력받음
        int n = sc.nextInt();
        int[] arr = new int[n + 1];

        //배열은 0으로 초기화
        for (int i = 0; i < n; i++) {
            arr[i] = 0;
        }
        //몇 번 연산인지 입력받음
        int m = sc.nextInt();

        //로직
        for (int i = 0; i < m; i++) {
            int first = sc.nextInt();
            int end = sc.nextInt();
            int num = sc.nextInt();

            for (int j = first; j <= end; j++) {
                arr[j] = num;
            }
        }

        //출력
        for (int i = 1; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
