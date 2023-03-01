import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //학생 수
        int n = sc.nextInt();
        //입상자 수
        int k = sc.nextInt();
        //점수를 담을 배열
        int[] arr = new int[n + 1];

        //배열에 입력
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //배열 정렬
        Arrays.sort(arr);

        System.out.println(arr[n - k + 1]);
    }
}
