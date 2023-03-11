package Back;

import java.util.Arrays;
import java.util.Scanner;

public class Num11650 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[][] arr = new int[num][2];


        for (int i = 0; i < num; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
//comparator를 람다식으로 표현
        Arrays.sort(arr, (e1, e2) -> {
            if (e1[0] == e2[0]) {   //첫번째 원소가 같다면 두번째 원소 비교
                return e1[1] - e2[1];
            } else {
                return e1[0] - e2[0];
            }
        });

        for (int i = 0; i < num; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
}


