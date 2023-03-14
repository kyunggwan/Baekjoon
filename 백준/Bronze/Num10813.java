package baekjoon;

import java.util.Scanner;

public class Num10813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n+1];

        //바구니 번호만큼 번호입력
        for (int i = 1; i <= n; i++) {
            arr[i] = i;
        }

        //m번만큼 공을 교환한다.
        for (int i = 0; i < m; i++) {
            //몇번째 바구니의 공을 바꿀지 입력받음
            int a = sc.nextInt();
            int b = sc.nextInt();

            int temp = 0;

            temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }

        //출력
        for (int i = 1; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
