import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //입력된 갯수만큼 배열 생성
        double arr[] = new double[sc.nextInt()];

        //입력된 수 배열에 넣음
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextDouble();
        }
        //정렬하면 마지막 값이 최대값
        Arrays.sort(arr);

        double sum = 0;
        //공식 적용
        for (int i = 0; i < arr.length; i++) {
            sum += ((arr[i] / arr[arr.length - 1]) * 100);
        }
        System.out.println(sum / arr.length);
    }
}
