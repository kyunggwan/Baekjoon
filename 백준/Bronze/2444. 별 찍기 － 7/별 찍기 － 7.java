import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int max = num * 2;

        //증가부분
        for (int i = 0; i < num; i++) {
            int s = i * 2 + 1;

            //빈칸 부분
            for (int g = 1; g < num - i; g++) {
                System.out.print(" ");
            }

            //마름모 증가부분
            for (int j = 0; j < s; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        //감소부분
        for (int i = num - 2; i >= 0; i--) {
            int s = i * 2 + 1;

            //마름모 감소부분 빈칸
            for (int g = 1; g < num - i; g++) {
                System.out.print(" ");
            }

            //감소부분 별
            for (int j = 0; j < s; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}




