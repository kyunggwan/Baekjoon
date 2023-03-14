import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n + 1];
        //바구니에 공을 채워둠
        for (int i = 1; i <= n; i++) {
            arr[i] = i;
        }

        //m번만큼 변화를 준다
        for (int k = 0; k < m; k++) {
            int i = sc.nextInt();
            int j = sc.nextInt();

            //순서를 바꾼다
            while (i < j) {
                int temp = arr[i];
                arr[i++] = arr[j];
                arr[j--] = temp;
            }
        }
        //출력
        for (int i = 1; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
