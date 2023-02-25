import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //입력 1~10억 사이의 수 num
        int num = sc.nextInt();
        int range = 2; // 범위
        int answer = 1;

        if (num == 1) {
            System.out.print(1);
        } else {
            while (range <= num) {
                range = range + (answer * 6); //다음 range의 최소값으로 설정
                answer++;
            }
            System.out.print(answer);
        }
    }
}
