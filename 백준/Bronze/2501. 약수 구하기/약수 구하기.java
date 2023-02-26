import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //입력 받은 수
        int num = sc.nextInt();
        //몇번째 약수를 출력할 것인가
        int k = sc.nextInt();

        int cnt = 0;
        int answer = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                cnt++;
                if (cnt == k) {
                    answer = i;
                }
            }
        }
        System.out.println(answer);
    }
}
